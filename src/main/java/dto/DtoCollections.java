package dto;

import dto1.Dto1;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class DtoCollections {
    private Dto1 dto1;
    private DtoParent dtoParent;
    private DtoChild dtoChild;
    private List<String> list1;
    private ArrayList<DtoParent> list2;
    private Map<DtoParent, String> map1;
    private HashMap<String, DtoChild> map2;
    private Set<String> set1;
    private HashSet<DtoParent> set2;
    private Queue<String> queue1;
    private LinkedBlockingQueue<DtoParent> queue2;
}
