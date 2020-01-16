package test.example.array;

import com.github.adrninistrator.gensettercalls.gen.GenSetterCalls;
import org.junit.Test;
import test.example.base.TestBase;

public class TestClassNameArray extends TestBase {

    @Test
    public void test() {

        //指定需要生成set方法调用的类
        String[] classNames = {"dto.DtoArray",
                "dto.DtoChild",
                "dto.DtoCollections",
                "dto.DtoCollectionsMulti1",
                "dto.DtoCollectionsMulti2",
                "dto.DtoEnum",
                "dto.DtoInnerMulti",
                "dto.DtoInnerNonStatic",
                "dto.DtoInnerStatic",
                "dto.DtoParent",
                "dto.DtoUnnecessaryField",
                "dto.DtoWithDollar$a$b$c"};

        //生成指定类的set方法调用
        new GenSetterCalls().handleClasses(classNames);
    }
}
