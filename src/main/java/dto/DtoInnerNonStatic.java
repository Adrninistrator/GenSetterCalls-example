package dto;

import java.util.Map;

public class DtoInnerNonStatic {
    private Integer i;
    private TestInnerNS testInnerNS;

    public class TestInnerNS {
        private Integer i;
        private Map<String, String> map;
    }
}
