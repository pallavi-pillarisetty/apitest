package org.pallavi.com;

import org.junit.BeforeClass;
import org.pallavi.com.Utils.ExtentReportListener;
import org.testng.annotations.Listeners;

@Listeners(ExtentReportListener.class)
public class BaseTestClass {
    @BeforeClass
    public static void  setuptestWithBaseURI(){
        String baseUri = "https://swapi.dev/api" ; //ReadConfigFile.getConfigReader().get("baseUrl");
    }
}
