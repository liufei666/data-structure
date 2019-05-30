package cn.com.dotleo.list;

import java.util.List;

/**
 * 链表是真正的动态数据结构，也是最简单的动态数据结构
 *
 *  单链表：为了表示每个数据元素ai与其直接后继数据元素ai+1之间的逻辑关系，对数据元素ai来说，除了存储本身的信息外，
 *  还需存储一个指示其直接后继的信息。
 *  我们把存储元素信息的域称为数据域，把保存直接后继位置的域称为指针域，指针域中存储的信息称为指针，
 *  这两部分信息组成的数据元素ai称为结点(Node)。
 *
 *
 *  问题：
 *  1. 头插法
 *  2. 如何找到插入元素的前一个元素
 *
 *  易错点：
 *  1. 因为没有头结点，所以在第一个位置插入或者删除第一个元素时需要注意区别对待
 *
 */
public class MyNoHeadNodeSingleLinkedList<E> implements MyList<E> {

    // Data Field
    private MyNode<E> head;
    private int length;

    public MyNoHeadNodeSingleLinkedList() {
        this.head = null;
        this.length = 0;
    }


    @Override
    public void initList(List<E> datas) {
        for (int i = datas.size() - 1; i >= 0; i--) {
            addFirst(datas.get(i));
        }
    }

    public void addFirst(E data) {
//        MyNode<E> myNode = new MyNode<>();
//        myNode.next = this.head;
//        this.head = myNode;
        this.head = new MyNode<>(data, this.head);
        length++;
    }

    @Override
    public E getElem(int index) {
        if (index < 0 || index >= this.length) {
            throw new IllegalArgumentException("index is Illegal");
        }
        MyNode<E> curr = this.head;
        int count = 0;
        while (curr != null) {
            if (count == index) {
                return curr.data;
            }
            curr = curr.next;
            count++;
        }
        return null;
    }

    @Override
    public void listInsert(int index, E data) {
        if (index < 0 || index >= this.length) {
            throw new IllegalArgumentException("index is Illegal");
        }
        if (index == 0) {
            addFirst(data);
        } else {
            MyNode<E> prev = this.head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = new MyNode<>(data, prev.next);
        }

        length++;
    }

    @Override
    public E listDelete(int index) {
        return null;
    }

    @Override
    public int localElem(E data) {
        MyNode<E> curr = this.head;
        int mv = 0;
        while (curr != null) {
            if (curr.data.equals(data)) {
                return mv;
            }
            mv++;
            curr = curr.next;
        }
        return -1;
    }

    @Override
    public int localLength() {
       return this.length;
    }

    @Override
    public void clearList() {

    }

    @Override
    public boolean listEmpty() {
        return this.length == 0;
    }

    /**
     * 结点由存放数据元素的数据域和存放后继结点地址的指针域组成。
     * 注：将Node设计成内部类，可以不向用户暴露实现细节
     */
    private static class MyNode<E> {
        private E data;
        private MyNode<E> next;

        public MyNode() {
            this(null, null);
        }

        public MyNode(E data) {
            this(data, null);
        }

        public MyNode(E data, MyNode<E> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
