package cn.jun.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Author: jun
 * @Date: 2020/8/27 18:12
 * @Version: 1.0
 * @Description:
 */
public class LinkedListedTest {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add(null);
        linkedList.add("1");
        linkedList.add("b");


        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            listIterator.remove();
        }

        linkedList.forEach(k -> System.out.println(k));

    }
}
