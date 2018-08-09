package io.gregoryweiss.java.test;

import io.gregoryweiss.java.MathService;
import org.junit.Assert;
import org.junit.Test;

public class MathServiceAddTest {

    @Test
    public void addMethodTest() {
        MathService mathService = new MathService();
        long result = mathService.add(5, 4);
        Assert.assertEquals(result, 9);
    }
}
