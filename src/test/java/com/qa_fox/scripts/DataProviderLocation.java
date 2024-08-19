package com.qa_fox.scripts;

import org.testng.annotations.DataProvider;

public class DataProviderLocation {




@DataProvider(name="dataTest")
public Object[][] dataTest(){

    return new Object[][]{
            {"jeff","nowak","str@gmail.com","543678123","1234"},

    };
}











}
