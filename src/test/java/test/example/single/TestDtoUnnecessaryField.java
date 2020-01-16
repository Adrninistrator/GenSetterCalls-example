package test.example.single;

import dto.DtoUnnecessaryField;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoUnnecessaryField extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoUnnecessaryField.class);
        Assert.assertTrue(result.contains("setS("));
        Assert.assertFalse(result.contains("setPublic_1("));
        Assert.assertFalse(result.contains("setStatic_1("));
        Assert.assertFalse(result.contains("setFinal_1("));
    }
}
