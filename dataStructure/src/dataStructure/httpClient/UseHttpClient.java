package dataStructure.httpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class UseHttpClient {

	private static final String URL = "http://www.naver.com";
	
	public static void main(String[] args) {
		HttpClient httpClient = null;
		try {
			httpClient = new DefaultHttpClient(); // httpClient 4.3버전 이후 deprecated 처리.
			
			HttpGet httpGet = new HttpGet(URL);
			
			HttpResponse response = httpClient.execute(httpGet);
			EntityUtils.consume(response.getEntity());
			HttpResponse response2 = httpClient.execute(httpGet); // 추가한 코드
		
			System.out.println(":: DefaultHttpClient Response ::");
			System.out.println(":: response 1 result code : "+response.getStatusLine().getStatusCode());
			//System.out.println(":: response 2 result code : "+response2.getStatusLine().getStatusCode()); // 추가한 코드

			BufferedReader reader= new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String inputLine;
			StringBuffer responseBuf = new StringBuffer();
			
			while((inputLine = reader.readLine()) != null) {
				responseBuf.append(inputLine);
			}

			reader.close();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
