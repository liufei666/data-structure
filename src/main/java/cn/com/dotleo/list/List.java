package cn.com.dotleo.list;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 线性表(List)：零个或者多个数据元素的有限集合
 *
 * 若线性表记为(a1,...,ai-1,ai,ai+1,...an)
 *     称ai-1为ai的直接前驱，
 *     ai+1为ai的直接后继
 *
 * 线性表元素的个数n(n>=0)定义为线性表的长度，当n=0时，称为空表
 * 数据元素之间一对一的关系
 */
public interface List<E> {

    // Data Field

    /**
     * 线性表中的数据结合{a1,a2,...,an},每个元素的类型均为DataType。
     */

    // Method Field

    /**
     * 写入(初始化)线性表
     * @param datas
     */
    void initList(ArrayList<E> datas);

    /**
     * 读取线性表
     * @param index
     * @return
     */
    E getElem(int index);

    /**
     * 插入
     * @param data
     * @param index
     */
    void listInsert(int index, E data);

    /**
     * 删除
     * @param index
     * @return 旧值
     */
    E listDelete(int index);

    /**
     * 查找元素，有返回对应的索引，没有返回-1
     * @param data
     * @return
     */
    int localElem(E data);

    /**
     * 返回队列长度
     * @return
     */
    int localLength();

    /**
     * 清空线性表
     */
    void clearList();

    /**
     * 线性表是否为空
     * @return
     */
    boolean listEmpty();

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
