package com.wjh.algorithm.test;


/**
 * 插入排序
 *
 * @author Wen Jiahu
 * @create 2019-06-05 13:39
 **/
public class Test_04_Insertion_Sort {

    public static void main(String[] args) {
        Comparable[] arr = {2,1,-9,5,4,8};
        sort(arr);
//        show(arr);
    }

    /**
     * @param a 一个数组
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {//从第二位开始比较，到i=n-1时排序完成
            //如果a[i]比前面的数小,就互换位置
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
            show(a);
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
