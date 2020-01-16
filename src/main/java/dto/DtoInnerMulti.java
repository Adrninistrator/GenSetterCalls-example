package dto;

import java.util.List;
import java.util.Map;

public class DtoInnerMulti {

    private TestInnerM1 testInnerM1;

    public static class TestInnerM1 {
        private String s;
        private List<String> list;
        private TestInnerM2 testInnerM2;

        public static class TestInnerM2 {
            private Integer i;
            private Map<Integer, String> map;
        }
    }
}
