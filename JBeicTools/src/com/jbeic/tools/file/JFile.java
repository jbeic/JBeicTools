package com.jbeic.tools.file;

import java.net.HttpURLConnection;
import java.net.URL;

public class JFile {

	/**
	 * ��ȡ�����ļ��Ĵ�С
	 * @param urlString
	 * @return
	 */
	static long getNetWorkFile(String urlfile) {
		long length = -1;
		URL url;
		HttpURLConnection urlcon = null;
		try {
			url = new URL(urlfile);
			// ������
			urlcon = (HttpURLConnection) url.openConnection();
			// ��ȡ�ļ���С
			length = urlcon.getContentLength();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (urlcon != null) {
				// �ر�����, �ͷ���Դ
				urlcon.disconnect();
			}
		}
		System.out.println(length);
		return length;
	}
}
