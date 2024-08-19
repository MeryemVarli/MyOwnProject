package selenium;

import org.testng.annotations.DataProvider;

public class DataProviderLocation {



@DataProvider
public Object[][] testData(){


    return new Object[][]{

            {"meryem","ID"} ,
            {"jeff","SDET"},
            {"lilia","CEO"},



    };


}




@DataProvider
    public Object[][]  testData2(){

    return new Object[][]{
            {"test@gmail.com","1234567","Warning: No match for E-Mail Address and/or Password."} ,
            {"asgs@gmail.com","3$55%6","Warning: No match for E-Mail Address and/or Password."} ,
            {"2fwu3@gmail.com","sbajsdc7","Warning: No match for E-Mail Address and/or Password."}  ,



    };
}














}
