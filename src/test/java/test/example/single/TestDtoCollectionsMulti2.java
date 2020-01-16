package test.example.single;

import dto.DtoCollectionsMulti2;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestDtoCollectionsMulti2 extends TestBase {

    @Test
    public void test() {

        String result = testBase(DtoCollectionsMulti2.class);
        Assert.assertTrue(result.contains("(LinkedList<TreeSet<ConcurrentLinkedQueue<ConcurrentHashMap<String, LinkedHashMap<Integer, " +
                "DtoCollections>>>>>)"));
    }
}
