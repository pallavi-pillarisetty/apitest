package org.pallavi.com;

import com.relevantcodes.extentreports.LogStatus;
import io.restassured.response.Response;
import org.pallavi.com.apiVerificationUtils.ResponseVerificationUtils;
import org.pallavi.com.apiconfigs.APIPaths;
import org.pallavi.com.apiconfigs.HeaderConfig;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.pallavi.com.Utils.ExtentReportListener.test;

public class SWApiTests extends BaseTestClass {
    Response response;
    ArrayList<Response> responses = new ArrayList<>();

    @Test
    public void getPeopleAPI(){
        test.log(LogStatus.INFO, "Starting getAPITest......");
        response = given().headers(HeaderConfig.defaultHeaders()).when().get(APIPaths.GET_LIST_OF_PEOPLE);
        test.log(LogStatus.INFO, response.getBody().prettyPrint());
        ResponseVerificationUtils.verifyResponseCode(response, 200);
    }

    @Test
    public void getPeopleTotalCountTest() {
        test.log(LogStatus.INFO, "Validating Count of People......");
        ResponseVerificationUtils.responseKeyValidationFromJSONObject(response, "count", 82);
        test.log(LogStatus.INFO, "Validated Count of People......");
    }
}
