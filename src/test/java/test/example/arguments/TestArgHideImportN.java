package test.example.arguments;

import com.github.adrninistrator.gensettercalls.utils.ConfigUtil;
import dto1.Dto1;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestArgHideImportN extends TestBase {

    @Test
    public void test() {

        System.setProperty(ConfigUtil.ARG_HIDEIMPORT, "");
        String result = testBase(Dto1.class);

        Assert.assertTrue(result.contains("import"));
    }
}
