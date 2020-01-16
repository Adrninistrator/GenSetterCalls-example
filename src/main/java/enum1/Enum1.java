package enum1;

public enum Enum1 {
    E1a("1"),
    E1b("2");

    private String value;

    Enum1(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
