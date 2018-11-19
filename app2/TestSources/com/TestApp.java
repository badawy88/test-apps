package com;

import org.junit.Assert;
import org.junit.Test;

public class TestApp {
    App app = new App();
    @Test
    public void testGetX() {
        Assert.assertTrue(app.get("Badawy").equals("welcome Badawy"));
    }
}
