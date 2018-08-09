package io.gregoryweiss.java.test;

import io.gregoryweiss.java.MathService;
import org.junit.Assert;
import org.junit.Test;

public class MathServiceSubtractTest {

    @Test
    public void subtractTest() {
        MathService mathService = new MathService();
        long result = mathService.subtract(24, 13);
        Assert.assertEquals(result, 11);
    }
}
