package cn.com.dotleo.list;

import java.util.List;

/**
 * 线性表的顺序存储(数组): 指用一段连续的存储单元依次存储线性表的数据元素
 *
 * 易错点：
 * 1. 新增删除元素时的两个条件判断
 * 2. 新增删除元素时的移动起止位置
 *
 * 优点：
 * 1. 随机访问快
 * 2. 不需要额外的空间存储
 *
 * 缺点：
 * 1. 插入删除时需要移除大量元素
 * 2. 当元素变化较大时，无法确定存储空间
 * 3. 造成存储空间的"碎片"
 *
 */
public class MyArrayList<E> implements MyList<E> {

    // Data Field

    private final int defaultCapacity = 50;
    private Object[] elements;
    private int length;

    public MyArrayList() {
        elements = new Object[defaultCapacity];
        length = 0;
    }

    // Method Field

    public void initList(List<E> datas) {
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

    /**
     * 条件判断:
     * 1. 是否还能添加
     * 2. 索引是否非法
     *
     * 逻辑:
     * 1. 如果不是末尾，需要将元素后移(从最后一个位置的后一位开始，到要添加位置的后一位止,将前一位的元素到后一位)
     * 2. 赋值
     * 3. 长度加一
     */
    public void listInsert(int index, E data) {
        if (length == defaultCapacity) {
            throw new IllegalStateException("list is over");
        }
        if (index < 0 || index > length - 1) {
            throw new IllegalArgumentException("index is Illegal");
        }
        if (index < length - 1) {
            for (int i = length; i > index; i--) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index] = data;
        length++;
    }

    /**
     * 条件判断：
     * 1. 是否还能删除
     * 2. 索引是否非法
     *
     * 逻辑：
     * 1. 元素前移(从要删除的位置开始，到最后一位的前一位止，将后一位的元素放到前一位)
     * 2. 长度减1
     */
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

    // Algorithm Field

    /**
     * 寻找数组中第二小的元素
     *
     */

    /**
     * 找到数组中第一个不重复出现的整数
     */

    /**
     * 合并两个有序数组
     */

    /**
     * 重新排列数组中的正值和负值
     */
}
