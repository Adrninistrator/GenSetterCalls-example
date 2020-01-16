package test.example.arguments;

import com.github.adrninistrator.gensettercalls.utils.ConfigUtil;
import dto1.Dto1;
import org.junit.Assert;
import org.junit.Test;
import test.example.base.TestBase;

public class TestArgSortN extends TestBase {

    @Test
    public void test() {

        System.setProperty(ConfigUtil.ARG_SORT, "");
        String result = testBase(Dto1.class);

        int indexI = result.indexOf("setI(");
        int indexS = result.indexOf("setS(");
        Assert.assertTrue(indexI > indexS);
    }
}
