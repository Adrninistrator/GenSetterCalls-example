package dto;

import java.util.List;
import java.util.Map;

public class DtoArray {
    private int[] ints;
    private String[] strings;
    private byte[] bytes;
    private char[] chars;
    private DtoChild[] dtoChildren;
    private DtoCollections[][] dtoCollections;
    private List<DtoParent[]> list;
    private Map<String, DtoChild[]> map;
}
