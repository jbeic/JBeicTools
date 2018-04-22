# JBeicTools
jbeic工具类库

com.jbeic.tools.fle.JFile

* 2018-4-22 17:46:29
* 获取网络文件的大小
* @param urlString
* @return long

JFile.getNetWorkFile(String urlfile);

__________________________________________

com.jbeic.tools.url.JHttp

* 2018-4-22 18:10:29
* httpclient 无参数Post请求
* @param url
* @return String
com.jbeic.tools.url.JHttp.HttpPost(String)

* 2018-4-22 18:10:29
* httpclient 参数Post请求
* @param url
* @param postData 参数
* @return String
com.jbeic.tools.url.JHttp.HttpPost(String, ArrayList<NameValuePair>)

* 2018-4-22 18:12:31
* httpclient get请求
* @param url
* @return string
com.jbeic.tools.url.JHttp.HttpGet(String)