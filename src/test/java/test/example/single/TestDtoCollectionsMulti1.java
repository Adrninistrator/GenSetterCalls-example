package test.example.single;

import dto.DtoCollectionsMulti1;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoCollectionsMulti1 extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoCollectionsMulti1.class);
        Assert.assertTrue(result.contains("(TreeMap<String, CopyOnWriteArrayList<DtoParent>>)"));
    }
}
