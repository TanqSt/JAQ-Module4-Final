package Module4Final.Tests;

import Module4Final.Pages.AccountCreate;
import Module4Final.Resource.DataSource;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;


import java.io.IOException;

//Test Scenario: Validate successful user registration

        //1. Navigate to the registration page
         //2. Fill in the registration form with valid user information
         //3. Submit the form
         //Expected Result:
         // A success message should be displayed indicating that the user account was created successfully.

public class TestAccountCreateDataProv extends Module4Final.Resource.Hooks {


    @Test(dataProvider = "dataProviderMethod",dataProviderClass = DataSource.class)
    public void accountCreation(String data)  throws IOException, ParseException, org.json.simple.parser.ParseException {
        String[]formInfo=data.split(",");

        //DataSource.dataProviderMethod();
        AccountCreate.addFirstName(formInfo[0]);
        AccountCreate.addLastName(formInfo[1]);
        AccountCreate.addAddress(formInfo[2]);
        AccountCreate.addCity(formInfo[3]);
        AccountCreate.addState(formInfo[4]);
        AccountCreate.addZipCode(formInfo[5]);
        AccountCreate.addPhone(formInfo[6]);
        AccountCreate.addSsn(formInfo[7]);
        AccountCreate.addUserName(formInfo[8]);
        AccountCreate.addPassword(formInfo[9]);
        AccountCreate.repeatPassword(formInfo[10]);
        AccountCreate.pressLoginButton();
        AccountCreate.pressLogoutButton();

    }

}



