package cn.com.dotleo.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by liufei on 2019-04-18.
 */
public class MyNoHeadNodeSingleLinkedListTest {

    @Test
    public void test() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        MyNoHeadNodeSingleLinkedList<Integer> linkedList = new MyNoHeadNodeSingleLinkedList<>();
        linkedList.initList(list);
        System.out.println(linkedList.localElem(1));
        System.out.println(linkedList.localElem(5));
    }
}
