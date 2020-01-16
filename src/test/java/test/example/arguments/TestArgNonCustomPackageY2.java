package test.example.arguments;

import com.github.adrninistrator.gensettercalls.utils.ConfigUtil;
import dto.DtoCollections;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestArgNonCustomPackageY2 extends TestBase {

    @Test
    public void test() {

        String[] args = {
                "dto1."
        };

        for (String arg : args) {
            System.setProperty(ConfigUtil.ARG_NONCUSTOMPACKAGE, arg);
        }

        doTest();
    }


    private void doTest() {
        String result = testBase(DtoCollections.class);

        Assert.assertTrue(result.contains("new DtoParent()"));
        Assert.assertTrue(result.contains("new DtoChild()"));
        Assert.assertFalse(result.contains("new Dto1()"));
    }
}
