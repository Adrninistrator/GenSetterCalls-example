package test.example.arguments;

import com.github.adrninistrator.gensettercalls.utils.ConfigUtil;
import dto.DtoArray;
import org.junit.Test;
import test.example.base.TestBase;

public class TestArgDebugN extends TestBase {

    @Test
    public void test() {

        System.setProperty(ConfigUtil.ARG_DEBUG, "");
        testBase(DtoArray.class);
    }
}
