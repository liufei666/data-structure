package cn.com.dotleo.list;

import java.util.List;

/**
 * 在MyNoHeadNodeSingleLinkedList中，添加了头结点
 *
 *  头指针：链表中第一个结点的存储位置叫做头指针。
 *  头结点：向链表的第一个元素前附设一个结点，称为头结点。
 *
 *  问题：
 *  1. 为什么需要添加头结点(头结点为了方便如插入,删除过程中，
 *      需要知道操作位置的前一个结点，因此需要对第一个位置的插入进行特殊处理而加入的结点)
 *  2. 尾插法
 *
 *  易错点：
 *  1. 删除时，如果用当前位置=当前位置的下一个位置，会出现错误
 *
 */
public class MySingleLinkedList<E> implements MyList<E> {


    @Override
    public void initList(List<E> datas) {

    }

    @Override
    public E getElem(int index) {
        return null;
    }

    @Override
    public void listInsert(int index, E data) {

    }

    @Override
    public E listDelete(int index) {
        return null;
    }

    @Override
    public int localElem(E data) {
        return 0;
    }

    @Override
    public int localLength() {
        return 0;
    }

    @Override
    public void clearList() {

    }

    @Override
    public boolean listEmpty() {
        return false;
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
