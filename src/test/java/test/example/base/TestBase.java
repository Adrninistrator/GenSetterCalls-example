package test.example.base;

import com.github.adrninistrator.gensettercalls.gen.GenSetterCalls;
import com.github.adrninistrator.gensettercalls.utils.ConfigUtil;
import org.junit.BeforeClass;

public abstract class TestBase {

    @BeforeClass
    public static void beforeClassBase() {
        System.setProperty(ConfigUtil.ARG_DEBUG, "");
        System.setProperty(ConfigUtil.ARG_SORT, "");
        System.setProperty(ConfigUtil.ARG_HIDETYPE, "");
        System.setProperty(ConfigUtil.ARG_HIDEIMPORT, "");
        System.setProperty(ConfigUtil.ARG_NONCUSTOMPACKAGE, "");
    }

    protected String testBase(Class clazz) {

        ConfigUtil.init();

        return new GenSetterCalls().handleClass(clazz);
    }
}
