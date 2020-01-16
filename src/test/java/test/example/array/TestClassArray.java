package test.example.array;

import com.github.adrninistrator.gensettercalls.gen.GenSetterCalls;
import com.github.adrninistrator.gensettercalls.utils.PrintUtil;
import dto.*;
import org.junit.Test;
import test.example.base.TestBase;

public class TestClassArray extends TestBase {

    @Test
    public void test() {

        //指定需要生成set方法调用的类
        Class[] classArray = {DtoArray.class,
                DtoChild.class,
                DtoCollections.class,
                DtoCollectionsMulti1.class,
                DtoCollectionsMulti2.class,
                DtoEnum.class,
                DtoInnerMulti.class,
                DtoInnerNonStatic.class,
                DtoInnerStatic.class,
                DtoParent.class,
                DtoUnnecessaryField.class,
                DtoWithDollar$a$b$c.class};

        for (Class clazz : classArray) {
            PrintUtil.infoPrint("\"" + clazz.getName() + "\",");
        }

        //生成指定类的set方法调用
        new GenSetterCalls().handleClasses(classArray);
    }
}
