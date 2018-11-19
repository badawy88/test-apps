package com;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorldForm {

    HelloWorldForm helloWorldForm = new HelloWorldForm();
    @Test
    public void testMessage() {
        helloWorldForm.setMessage("welcome");
        Assert.assertTrue(helloWorldForm.getMessage().equals("welcome"));
    }
}
