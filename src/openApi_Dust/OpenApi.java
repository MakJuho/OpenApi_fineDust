package openApi_Dust;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenApi {
	 public static void main(String[] args) {
	        BufferedReader br = null;
	        try{            
	        	String urlstr = "http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty?stationName=%EC%9D%B8%EA%B3%84%EB%8F%99&dataTerm=month&pageNo=1&numOfRows=10&ServiceKey=B63o9VNgdLlYtTfd0h2mvZPtIj1BlXMV0bAKTMstOKSlwJDVadQj3AnlaA8D3clmjipXllP28GVdk2RbAweVXg%3D%3D&ver=1.3";
//	            String urlstr = "http://openapi.airkorea.or.kr/"
//	                    + "openapi/services/rest/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty"
//	                    + "?stationName=¼ö³»µ¿&dataTerm=month&pageNo=1&numOfRows=10&ServiceKey=B63o9VNgdLlYtTfd0h2mvZPtIj1BlXMV0bAKTMstOKSlwJDVadQj3AnlaA8D3clmjipXllP28GVdk2RbAweVXg%3D%3D&ver=1.3";
	            URL url = new URL(urlstr);
	            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
	            urlconnection.setRequestMethod("GET");
	            br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));
	            String result = "";
	            String line;
	            while((line = br.readLine()) != null) {
	                result = result + line + "\n";
	            }
	            System.out.println(result);
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	        }
	    }

}
