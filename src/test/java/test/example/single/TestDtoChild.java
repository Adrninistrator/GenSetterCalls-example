package test.example.single;

import dto.DtoChild;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoChild extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoChild.class);
        Assert.assertFalse(result.contains("new Enum1()"));
    }
}
