package Module4Final.Resource;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileReader;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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


    //public static void main(String[] args) {
    //readJson()
//}
//public static void readJson() throws IOException, ParseException {

    // ParseException

    public static void credentialsAndURLS() throws IOException, ParseException, org.json.simple.parser.ParseException {



        FileReader reader = new FileReader("c:\\Users\\Boris\\IdeaProjects\\JQALearn\\src\\test\\java\\Module4Final\\Resource\\config.json");
        JSONParser jsonparser = new JSONParser();
        Object object = jsonparser.parse(reader);
        JSONObject configJsonObj = (JSONObject) object;

        firstName = (String) configJsonObj.get("firstName");
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
    //try {
    //JSONParser parser = new JSONParser();
    //Use JSONObject for simple JSON and JSONArray for array of JSON.
    //JSONObject data = (JSONObject) parser.parse(
    //new FileReader("c:\\Users\\Boris\\IdeaProjects\\JQALearn\\src\\test\\java\\Module4Final\\Resource\\config.json"));//path to the JSON file.
    //String json;
    //json = data.toString();
    //firstName = configJsonObj.getString("firstName");
    ////lastName=(String) data.get("lastName");
    // address=(String) data.get("address");
    //city=(String) data.get("city");
    //state=(String) data.get("state");
    //code=(String) data.get("code");
    //mobPhone=(String) data.get("mobPhone");
    //ssn=(String) data.get("ssn");
    //user=(String) data.get("user");
    //pass=(String) data.get("pass");
    //repPass=(String) data.get("repPass");

    //}catch (IOException | ParseException e) {
    //e.printStackTrace();
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

