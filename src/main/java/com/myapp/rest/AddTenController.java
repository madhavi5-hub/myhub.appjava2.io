package com.myapp.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myapp.views.ViewModel;

@Controller
@RequestMapping("addTen")

public class AddTenController {
	
	private Logger logger = LoggerFactory.getLogger(AddTenController.class);

	

	@RequestMapping(value = "/v1/{num}", produces = (MediaType.APPLICATION_JSON_VALUE), method = RequestMethod.GET)
	public @ResponseBody ViewModel getContractHistoryv1ById(@PathVariable final int num) {
		logger.info("request AddTenController#query/v1/{num}");
		ViewModel viewModel = new ViewModel();
		try {
						
			viewModel.setResponse(num + 10);
			
		} catch (Exception e) {
			logger.error("", e);
			viewModel.setErrorMessage(e.getMessage());
		}
		return viewModel;
	}

	//http://localhost:8080/galv-add/api/addTen/v1/7
	//http://localhost:8080/galv-add/myappAdd.jsp

}
