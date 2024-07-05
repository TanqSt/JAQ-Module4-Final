package Module4Final.Resource;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataSource {
    public static String firstName;
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static String code;
    public static String mobPhone;
    public static String ssn;
    public static String user;
    public static String pass;
    public static String repPass;
    @DataProvider(name = "dataProviderMethod")
    public  Object[] dataProviderMethod() throws IOException, ParseException, org.json.simple.parser.ParseException {


        String sysPath = System.getProperty("user.dir");
        File myObj = new File(sysPath + "\\src\\test\\java\\Module4Final\\Resource\\config.json");
        FileReader reader = new FileReader(myObj);
        JSONParser jsonparser = new JSONParser();
        Object object = jsonparser.parse(reader);
        JSONObject configJsonObj = new JSONObject(object.toString());
        JSONArray array =configJsonObj.getJSONArray("credent");
        String [] arr = new String[array.length()];

for (int i=0;i< array.length();i++){
    JSONObject users=(JSONObject) array.get(i);
    String firstName = (String) users.get ("firstName");
    String lastName = (String) users.get("lastName");
    String  address = (String) users.get("address");
    String city = (String) users.get("city");
    String state = (String) users.get("state");
    String code = (String) users.get("code");
    String mobPhone = (String) users.get("mobPhone");
    String ssn = (String) users.get("ssn");
    String user = (String) users.get("user");
    String  pass = (String) users.get("pass");
    String repPass = (String) users.get("repPass");

    arr[i]=firstName+","+lastName+","+address+","+city+","+state+","+code+","+mobPhone+","+ssn+","+user+","+pass+","+repPass;
}
return arr;
    }}