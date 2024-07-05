package Module4Final.Resource;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileReader;

import java.util.ArrayList.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.Iterator.*;

import java.lang.ClassCastException;


public class ReadConfig {
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


    public static void credentialsAndURLS() throws IOException, ParseException, org.json.simple.parser.ParseException {

        String sysPath = System.getProperty("user.dir");
        File myObj = new File(sysPath + "\\src\\test\\java\\Module4Final\\Resource\\config.json");
        FileReader reader = new FileReader(myObj);
        JSONParser jsonparser = new JSONParser();
        //JSONArray configJsonObj = (JSONArray) jsonparser.parse(reader);
        Object object = jsonparser.parse(reader);
        JSONObject configJsonObj = new JSONObject(object.toString());
        //JSONArray configJsonObj = new JSONArray();
        //JSONArray arr = configJsonObj.getJSONArray("data");

        //for (Object o : arr) {
            //JSONObject configJsonObj = (JSONObject) object;
            //JSONArray credentials = (JSONArray) configJsonObj.get("data");//configJsonObj.getJSONArray("credentials");
            //Iterator iterator = credentials.iterator();
            //while (iterator.hasNext()) {
                //for(int i = 0 ; i < credentials.length() ; i++){
                    //object.getJSONObject(i).getString("credentials");
            firstName = (String) configJsonObj.get ("firstName");
            //arr.getJSONObject(i).getString("firstname");
            lastName = (String) configJsonObj.get("lastName");
            address = (String) configJsonObj.get("address");
            city = (String) configJsonObj.get("city");
            state = (String) configJsonObj.get("state");
            code = (String) configJsonObj.get("code");
            mobPhone = (String) configJsonObj.get("mobPhone");
            ssn = (String) configJsonObj.get("ssn");
            user = (String) configJsonObj.get("user");
            pass = (String) configJsonObj.get("pass");
            repPass = (String) configJsonObj.get("repPass");
        }

            //lastName = (String) configJsonObj.get("lastName");
            //address = (String) configJsonObj.get("address");
            //city = (String) configJsonObj.get("city");
            //state = (String) configJsonObj.get("state");
            //code = (String) configJsonObj.get("code");
            //mobPhone = (String) configJsonObj.get("mobPhone");
            //ssn = (String) configJsonObj.get("ssn");
            //user = (String) configJsonObj.get("user");
            //pass = (String) configJsonObj.get("pass");
            //repPass = (String) configJsonObj.get("repPass");
        }















//try {
//    String sysPath = System.getProperty("user.dir");
// File myObj = new File("C:\\Users\\zdrav\\Projects\\JQA_homeworks\\ZornitsaStefanova\\java-api-demo\\src\\main\\java\\config\\config.json");
// System.out.println(sysPath);
// File myObj = new File(sysPath + "\\src\\test\\java\\Module4Final\\Resource\\config.json");
/// Scanner myReader = new Scanner(myObj);
//// while (myReader.hasNextLine()) {
//String data = myReader.nextLine();
//System.out.println(data);
//}
//myReader.close();
////} catch (FileNotFoundException e) {
// System.out.println("An error occurred.");
// e.printStackTrace();

//}
// }

