package cn.com.dotleo.list;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by liufei on 2019-04-11.
 */
public class MyFixArrayListTest {

    private MyArrayList<Integer> arrayList = new MyArrayList<>();

    @Before
    public void initListTest() {
        List<Integer> tmp = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            tmp.add(random.nextInt(20));
        }
        arrayList.initList(tmp);
        print();
    }

    @Test
    public void listInsertTest() {
        arrayList.listInsert(10, 499);
        print();
    }

    private void print() {
        System.out.println("leng=" + arrayList.localLength());
        System.out.println("data=[");
        for (int i = 0; i < arrayList.localLength(); i++) {
            System.out.println(arrayList.getElem(i));
        }
        System.out.println("]");
    }


}
