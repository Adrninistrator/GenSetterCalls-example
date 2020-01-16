package test.example.arguments;

import com.github.adrninistrator.gensettercalls.utils.ConfigUtil;
import dto1.Dto1;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestArgHideImportY extends TestBase {

    @Test
    public void test() {

        System.setProperty(ConfigUtil.ARG_HIDEIMPORT, "1");
        String result = testBase(Dto1.class);

        Assert.assertFalse(result.contains("import"));
    }
}
