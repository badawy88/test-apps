package com;

import org.junit.Assert;
import org.junit.Test;

public class TestApps {
    @Test
    public void pass_parameter() {
        Apps apps = new Apps() ;
        Assert.assertTrue(apps.sum(2,3) == 5);
    }
}
