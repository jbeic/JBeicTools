package com.jbeic.tools.url;

import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class JHttp {

	/**
	 * httpclient get请求
	 * @param url
	 * @return string
	 */
	public static String HttpGet(String url) {
		String data = "";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		try {
			HttpGet httpGet = new HttpGet(url);
			httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.0.3) Gecko/2008092417 Firefox/3.0.3");
			response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			data = EntityUtils.toString(entity, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
				httpClient.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return data;
	}

	/**
	 * httpclient Post请求
	 * @param url
	 * @param postData 参数
	 * @return String
	 */
	public static String HttpPost(String url, ArrayList<NameValuePair> postData) {
		String data = "";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		try {
			HttpPost post = new HttpPost(url);// 构建post对象
			post.setHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.0.3) Gecko/2008092417 Firefox/3.0.3");
			post.setEntity(new UrlEncodedFormEntity(postData));// 捆绑参数
			response = httpClient.execute(post);// 执行登陆行为
			data = EntityUtils.toString(response.getEntity(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
				httpClient.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return data;
	}
	
	/**
	 * httpclient 无参数Post请求
	 * @param url
	 * @return
	 */
	public static String HttpPost(String url) {
		String data = "";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		try {
			HttpPost post = new HttpPost(url);// 构建post对象
			post.setHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.0.3) Gecko/2008092417 Firefox/3.0.3");
			response = httpClient.execute(post);// 执行登陆行为
			data = EntityUtils.toString(response.getEntity(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
				httpClient.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return data;
	}
}
