package cn.com.dotleo.list;

import java.util.ArrayList;

/**
 * 线性表的顺序存储(数组): 指用一段连续的存储单元依次存储线性表的数据元素
 *
 */
public class FixArrayList<E> implements List<E> {

    // Data Field

    private final int defaultCapacity = 50;
    private Object[] elements;
    private int length;

    public FixArrayList() {
        elements = new Object[defaultCapacity];
        length = 0;
    }

    // Method Field

    public void initList(ArrayList<E> datas) {
        clearList();
        if (datas == null || datas.isEmpty()) {
            return;
        }
        if (datas.size() > defaultCapacity) {
            throw new IllegalArgumentException("too many element to add");
        }
        for (int i = 0, len = datas.size(); i < len; i++) {
            elements[i] = datas.get(i);
            length++;
        }
    }

    public E getElem(int index) {
        if (index < 0 || index > length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public void listInsert(int index, E data) {
        if (length == defaultCapacity) {
            throw new IllegalStateException("list is over");
        }
        if (index < 0 || index > length - 1) {
            throw new IllegalArgumentException("index is Illegal");
        }
        if (index < length - 1) {
            int localIndex = localElem(data);
            for (int i = length - 1; i > localIndex; i--) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index] = data;
        length++;
    }

    public E listDelete(int index) {
        if (length == 0) {
            throw new IllegalStateException("list is over");
        }
        if (index < 0 || index > length - 1) {
            throw new IllegalArgumentException("index is Illegal");
        }
        E e = getElem(index);
        for (int i = index; i < length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        length--;
        return e;
    }

    public int localElem(E data) {
        for (int i = 0; i < length; i++) {
            if (elements[i].equals(data)) {
                return i;
            }
        }

        return -1;
    }

    public int localLength() {
        return length;
    }

    public void clearList() {
        elements = new Object[defaultCapacity];
        length = 0;
    }

    public boolean listEmpty() {
        return length == 0;
    }
}
