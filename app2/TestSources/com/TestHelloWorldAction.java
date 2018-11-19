package com;

import org.junit.Assert;
import org.junit.Test;
import servletunit.struts.MockStrutsTestCase;

import java.io.File;

public class TestHelloWorldAction extends MockStrutsTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setContextDirectory(new File("WebContent"));
        setConfigFile("/WEB-INF/config/struts-config.xml");
        //loginAction = new LoginAction();
    }
    @Test
    public void test() {
        Assert.assertTrue(true);
    }
}
