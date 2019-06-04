package com.wjh.algorithm.test;

/**
 * 二分查找法
 *
 * @author Wen Jiahu
 * @create 2019-06-04 17:25
 **/
public class Test_02 {

    /**
     * 判断数组arr中是否存在key，存在则返回index，否则返回-1
     *
     * @param key 值
     * @param arr 数组 必须是从小到大排列，这是使用二分查找的基础
     * @return
     */
    public static int indexOf(int key, int[] arr) { // 数组必须是有序的
        int begin = 0;//查找起始位置
        int end = arr.length - 1;//查找末尾位置
        int count = 0;//计数器，统计查了多少次
        while (begin <= end) { // 被查找的键要么不存在，要么必然存在于 arr[begin..end] 之中
            count++;//每查一次计数器+1
            int mid = begin + (end - begin) / 2;
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                begin = mid + 1;
            } else {
                System.out.println("共计查询了" + count + "次");//得出结论之前打印一下遍历次数
                return mid;
            }
        }
        System.out.println("共计查询了" + count + "次");
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 4, 5, 6, 7, 9, 10, 12, 14, 16, 17, 18, 19, 21, 28, 39, 41, 43, 44, 49, 51, 53, 54, 55, 60, 62, 65, 69, 79};//一个长度为30的数组
        System.out.println(indexOf(79, arr));

    }
}
