package list;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1,3);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.set(2,4));
        System.out.println(list);
        //换成链表
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.add(1,3);
        System.out.println(linkedList);
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.set(2,4));
        System.out.println(linkedList);
    }
}
