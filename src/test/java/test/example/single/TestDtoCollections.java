package test.example.single;

import dto.DtoCollections;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoCollections extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoCollections.class);
        Assert.assertTrue(result.contains("(LinkedBlockingQueue<DtoParent>)"));
    }
}
