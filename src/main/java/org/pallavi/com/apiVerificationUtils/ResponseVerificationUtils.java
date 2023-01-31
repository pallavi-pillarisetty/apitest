package org.pallavi.com.apiVerificationUtils;

import com.relevantcodes.extentreports.LogStatus;
import io.restassured.response.Response;
import org.testng.Assert;
import org.json.JSONObject;
import org.json.JSONArray;

import static org.pallavi.com.Utils.ExtentReportListener.test;

//import org.json.JSONObject;
public class ResponseVerificationUtils {
    public static void verifyResponseCode(Response response, int statuscode){
        try {
            Assert.assertEquals(response.statusCode(),statuscode);
        }
        catch (Exception exception){
            //test.
        }
    }

    public static void responseKeyValidationFromJSONObject(Response response, String key, int expectedValue) {
        try {
            JSONObject json = new JSONObject(response.getBody().asString());
            if (json.has(key) && json.get(key) != null) {
                Assert.assertEquals(json.get(key), expectedValue);
                System.out.println("Successfully validated value of " + key + " It is " + json.get(key));
                test.log(LogStatus.PASS, "Successfully validated value of " + key + " It is " + json.get(key));
            } else {
                test.log(LogStatus.FAIL, "Key is not available");
            }
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e.fillInStackTrace());
        }
    }
}
