package org.pallavi.com;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;

import org.mockito.Mockito;
import org.pallavi.com.service.ChickActions;
import org.pallavi.com.service.ChickFillAService;

import static org.mockito.Mockito.mock;

public class MockTest extends BaseTestClass{
    ChickFillAService chickFillAMockService = mock(ChickFillAService.class);
    ChickActions chickActions = new ChickActions(chickFillAMockService);
//    @Test
//    public void testAvgChickFillACustomers(){
//        test.log(LogStatus.INFO,"Starting");
//        Mockito.when(chickFillAMockService.getFanCount()).thenReturn(100);
//        Mockito.when(chickFillAMockService.getTotalItems()).thenReturn(1000);
//        Assert.assertEquals(10,chickActions.getAvgFav());
//        test.log(LogStatus.INFO,"Success");
//    }
    @Test
    public void testAvgChickFillACustomers2(){
        System.out.println("Hello Pallavi");
       //test.log(LogStatus.INFO,"Starting");
        Mockito.when(chickFillAMockService.getFanCount()).thenReturn(100);
        Mockito.when(chickFillAMockService.getTotalItems()).thenReturn(1000);
        Assert.assertEquals(10,chickActions.getAvgFav());
        //test.log(LogStatus.INFO,"Success");
    }

}
