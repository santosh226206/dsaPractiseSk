package linkedList;

import java.util.LinkedList;
import java.util.List;

public class ListNodeTest {
    public static void main(String[] args) {
        List<String> lt=new LinkedList<>();
        lt.add("hi");
        lt.add("are");
        lt.add(1,"how");
        System.out.println(lt.toString());
    }
}
