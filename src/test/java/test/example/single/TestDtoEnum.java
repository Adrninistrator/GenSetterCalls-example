package test.example.single;

import dto.DtoEnum;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoEnum extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoEnum.class);
        Assert.assertFalse(result.contains("new Enum1()"));
    }
}
