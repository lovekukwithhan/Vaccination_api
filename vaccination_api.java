package apiTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
 
public class vaccination_api {
    public static void main(String[] args) {
        BufferedReader br = null;
        try{            
            String urlstr = "https://nip.cdc.go.kr/"
                    + "irapi/rest/getCondVcnCd.do"
                    + "?serviceKey=q8glIeFohmlVIqvGgRa3o2CU4jNXrk8DfQPh9n3s87BqBYhjQ0A0qDLCXEFfJ7GTWQHLMh%2F78CWpoTjvBTyLZA%3D%3D";
            URL url = new URL(urlstr);
            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
            urlconnection.setRequestMethod("GET");
            br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));
            String result = "";
            String line;
            while((line = br.readLine()) != null) {
                result = result + line + "\n";
                System.out.println();
            }
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}