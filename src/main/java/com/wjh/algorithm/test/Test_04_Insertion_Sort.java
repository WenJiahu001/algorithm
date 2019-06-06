package com.wjh.algorithm.test;


/**
 * 插入排序
 *
 * @author Wen Jiahu
 * @create 2019-06-05 13:39
 **/
public class Test_04_Insertion_Sort {

    //测试入口
    public static void main(String[] args) {
        Comparable[] arr = {3, 2, 1, -2, -9, 4, 8, 2, 9, 4, -67, -12, 12, 67};
        System.out.print("初始数据：");
        show(arr);
        sort(arr);
    }

    /**
     * 优化后的插入排序
     *
     * @param a 一个数组
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {//从第二位开始比较，到i=n-1时排序完成
            //i表示当前需要排序的下标

//            插入位置标记
            int mark = i;
            //j表示左边数字的下标，依次比较
            for (int j = i - 1; j >= 0 && less(a[i], a[j]); j--)//如果比左边的数字小，就记录下这个位置
                //记录下需要插入的下标位置
                mark = j;

            Comparable num = a[i];
            //往左比较完毕后。将其他元素后移
            for (int m = i - 1; m >= mark; m--)//
                a[m + 1] = a[m];
            //将当前值插入到合适的地方
            a[mark] = num;
            System.out.print("第" + i + "次排序：");
            show(a);
        }
    }

    /**
     * 《算法第四版》中的插入排序案例
     *
     * @param a
     */
    public static void sort2(Comparable[] a) { // 将a[]按升序排列
        int N = a.length;
        for (int i = 1; i < N; i++) { // 将 a[i] 插入到 a[i-1]、a[i-2]、a[i-3]...之中
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
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
