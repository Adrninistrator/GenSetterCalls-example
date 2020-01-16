package test.example.single;

import dto.DtoInnerMulti;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoInnerMulti extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoInnerMulti.class);
        Assert.assertTrue(result.contains("new DtoInnerMulti.TestInnerM1()"));
        Assert.assertTrue(result.contains("new TestInnerM2()"));
    }
}
