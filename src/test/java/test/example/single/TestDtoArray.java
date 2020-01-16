package test.example.single;

import dto.DtoArray;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoArray extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoArray.class);
        Assert.assertTrue(result.contains("(DtoCollections[][])"));
    }
}
