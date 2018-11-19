package com;


import org.junit.Test;
import servletunit.struts.MockStrutsTestCase;

import java.io.File;

//badawy: 5daad91563a6477d08db7ba6b71f6cc3b957e0bb
//mvn -e clean jacoco:prepare-agent install jacoco:report


//mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=5daad91563a6477d08db7ba6b71f6cc3b957e0bb

//mvn -e clean jacoco:prepare-agent install jacoco:report sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=5daad91563a6477d08db7ba6b71f6cc3b957e0bb
public class TestLoginAction extends MockStrutsTestCase{

    //private LoginAction loginAction;

    public TestLoginAction(String testName) {
        super(testName);
    }


    @Test
    public void testPerform() {
//        setConfigFile("/WEB-INF/struts-config.xml");
        //setRequestPathInfo("/helloWorld");
        //actionPerform();
        //verifyForward("success");
        setContextDirectory(new File("WebContent"));
        setConfigFile("/WEB-INF/config/struts-config.xml");


    }

    @Test
    public void testLoginAction() {
//        setConfigFile("/WEB-INF/struts-config.xml");

        setContextDirectory(new File("WebContent"));
        setConfigFile("/WEB-INF/config/struts-config.xml");
        setRequestPathInfo("/login");
        actionPerform();
        //verifyForward("success");


    }
}
