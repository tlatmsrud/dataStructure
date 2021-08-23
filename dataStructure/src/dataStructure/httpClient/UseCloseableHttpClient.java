package dataStructure.httpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class UseCloseableHttpClient {

	private static final String URL = "http://www.naver.com";
	public static void main(String[] args) {
		CloseableHttpClient httpClient = null;
		try {
			httpClient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(URL);
			
			CloseableHttpResponse response = httpClient.execute(httpGet);
			httpClient.close(); // 추가한 코드
			CloseableHttpResponse response2 = httpClient.execute(httpGet); // 추가한 코드
			
			System.out.println(":: CloseableHttpResponse ::");
			System.out.println(":: response 1 result code : "+response.getStatusLine().getStatusCode());
			System.out.println(":: response 2 result code : "+response2.getStatusLine().getStatusCode()); // 추가한 코드
			
			BufferedReader reader= new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String inputLine;
			StringBuffer responseBuf = new StringBuffer();
			
			while((inputLine = reader.readLine()) != null) {
				responseBuf.append(inputLine);
			}

			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(httpClient != null) {
				try {
					httpClient.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
