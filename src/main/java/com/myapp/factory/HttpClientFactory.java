package com.myapp.factory;

import java.util.concurrent.TimeUnit;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class HttpClientFactory implements Cloneable {
	public static final CloseableHttpClient createInstance() throws Exception {
		RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(15000).setSocketTimeout(15000).setConnectTimeout(15000).build();
		PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
		connManager.setMaxTotal(100);
		connManager.setDefaultMaxPerRoute(20);
		connManager.closeExpiredConnections();
		connManager.closeIdleConnections(30, TimeUnit.SECONDS);
		return HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).setConnectionManager(connManager).build();
	}
}
