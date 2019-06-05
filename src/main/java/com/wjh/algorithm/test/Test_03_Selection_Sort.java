package com.wjh.algorithm.test;


/**
 * 选择排序
 *
 * @author Wen Jiahu
 * @create 2019-06-05 13:39
 **/
public class Test_03_Selection_Sort {

    public static void main(String[] args) {
        Comparable[] arr = {-4, 9, 8, 43, 12, 65, 89, 12, 31, 65, -1, -5, -8};
        sort(arr);
        show(arr);
    }

    /**
     * 一种最简单的排序算法是这样的：首先，找到数组中最小的那个元素，其次，将它和数组的第
     * 一个元素交换位置（如果第一个元素就是最小元素那么就跳过）。再次，在剩下的元素中
     * 找到最小的元素，将它与数组的第二个元素交换位置。如此往复，直到将整个数组排序。这种方法
     * 叫做选择排序，因为它在不断地选择剩余元素之中的最小者
     *
     * 对于长度为 N 的数组，选择排序需要大约 N2/2 次比较和 N 次交换
     *
     * 总的来说，选择排序是一种很容易理解和实现的简单排序算法，它有两个很鲜明的特点。
     * 运行时间和输入无关。为了找出最小的元素而扫描一遍数组并不能为下一遍扫描提供什么信息。
     * 这种性质在某些情况下是缺点，因为使用选择排序的人可能会惊讶地发现，一个已经有序的数组或
     * 是主键全部相等的数组和一个元素随机排列的数组所用的排序时间竟然一样长！我们将会看到，其
     * 他算法会更善于利用输入的初始状态。
     * 数据移动是最少的。每次交换都会改变两个数组元素的值，因此选择排序用了 N 次交换——交
     * 换次数和数组的大小是线性关系。我们将研究的其他任何算法都不具备这个特征（大部分的增长数
     * 量级都是线性对数或是平方级别）。
     *
     * @param a 一个数组
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;//定义最小的下标默认为i
            for (int j = i + 1; j < N; j++)
                if (less(a[j], a[minIndex])) minIndex = j;//找出最小的下标
            if (minIndex != i)//如果不是第i位，就互换位置
                exch(a, i, minIndex);
        }
    }

    /**
     * 左边的数字比右边的小吗？
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换数组两个元素
     *
     * @param a 数组
     * @param i 要交换的数组下标
     * @param j 要交换的数组下标
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 打印数组
     *
     * @param a
     */
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    /**
     * 检验数组是否是有序排列 从小到大排列
     *
     * @param a
     * @return
     */
    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1]))
                return false;
        return true;
    }
}
