package test.example.single;

import dto.DtoWithDollar$a$b$c;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoWithDollar$a$b$c extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoWithDollar$a$b$c.class);
        Assert.assertTrue(result.contains("new DtoWithDollar$a$b$c()"));
    }
}
