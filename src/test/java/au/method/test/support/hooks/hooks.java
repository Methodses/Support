package au.method.test.support.hooks;

import au.method.test.support.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @Before
    public void init(){
        BasePage.initialize();
    }


    @After
    public void  closure(){
       // BasePage.close();
    }

}
