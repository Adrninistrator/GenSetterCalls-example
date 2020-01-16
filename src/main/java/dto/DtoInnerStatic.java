package dto;

import java.util.List;

public class DtoInnerStatic {
    private String s;
    private TestInnerS testInnerS;

    public static class TestInnerS {
        private String s;
        private List<String> list;
    }
}
