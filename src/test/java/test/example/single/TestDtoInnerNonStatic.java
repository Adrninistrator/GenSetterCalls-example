package test.example.single;

import dto.DtoInnerNonStatic;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoInnerNonStatic extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoInnerNonStatic.class);
        Assert.assertTrue(result.contains("dtoInnerNonStatic.new TestInnerNS()"));
    }
}
