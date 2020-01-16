package dto;

import enum1.Enum1;

public class DtoEnum {

    private String s;
    private Enum1 enum1;
    private Enum2 enum2;

    public enum Enum2 {
        E2a(1),
        E2b(2);

        private int value;

        Enum2(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
