package org.pallavi.com.Utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.tools.sjavac.Log;
import org.testng.ITestContext;
import org.testng.ITestListener;
import com.relevantcodes.*;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {
    public static ExtentReports reports;
    public static ExtentTest test ;
    String ReportLoc = "test-result/report/";
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Pallavi Test name  : "+result.getTestName());
        reports = new ExtentReports(ReportLoc);
        test = reports.startTest(result.getTestName(),"First test");
        test.log(LogStatus.INFO,"Stating now");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Log.info("Started "+result.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Log.info("Failed "+result.getTestName());
    }


    @Override
    public void onStart(ITestContext context) {
        Log.info("Tests Started");
    }

    @Override
    public void onFinish(ITestContext context) {
        Log.info("Tests Finished");
        reports.endTest(test);
        reports.flush();
    }
}
