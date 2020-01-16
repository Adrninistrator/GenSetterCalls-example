package test.example.single;

import dto.DtoInnerStatic;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoInnerStatic extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoInnerStatic.class);
        Assert.assertTrue(result.contains("new DtoInnerStatic.TestInnerS()"));
    }
}
