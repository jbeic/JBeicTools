package com.jbeic.tools.file;

import java.net.HttpURLConnection;
import java.net.URL;

public class JFile {

	/**
	 * 获取网络文件的大小
	 * @param urlString
	 * @return
	 */
	static long getNetWorkFile(String urlfile) {
		long length = -1;
		URL url;
		HttpURLConnection urlcon = null;
		try {
			url = new URL(urlfile);
			// 打开连接
			urlcon = (HttpURLConnection) url.openConnection();
			// 获取文件大小
			length = urlcon.getContentLength();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (urlcon != null) {
				// 关闭连接, 释放资源
				urlcon.disconnect();
			}
		}
		System.out.println(length);
		return length;
	}
}
