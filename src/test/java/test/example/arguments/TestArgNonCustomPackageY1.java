package test.example.arguments;

import com.github.adrninistrator.gensettercalls.utils.ConfigUtil;
import dto.DtoCollections;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestArgNonCustomPackageY1 extends TestBase {

    @Test
    public void test() {

        String[] args = {
                "dto.",
                "dto.,",
                ",dto.",
                ",dto.,",
                " ,dto.,",
                ",dto. ,",
                " ,dto. ,",
                ",,dto.,,",
                " , , dto. , , "
        };

        for (String arg : args) {
            System.setProperty(ConfigUtil.ARG_NONCUSTOMPACKAGE, arg);
        }

        doTest();
    }


    private void doTest() {
        String result = testBase(DtoCollections.class);

        Assert.assertFalse(result.contains("new DtoParent()"));
        Assert.assertFalse(result.contains("new DtoChild()"));
        Assert.assertTrue(result.contains("new Dto1()"));
    }
}
