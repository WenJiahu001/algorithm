package com.wjh.algorithm.test;

/**
 * 欧几里得算法
 *
 * @author Wen Jiahu
 * @create 2019-05-31 11:48
 **/
public class Test_01_Gcd {

    /**欧几里得算法
     * 计算两个非负整数 p 和 q 的最大公约数：若
     * q 是 0，则最大公约数为 p。否则，将 p 除以
     * q 得到余数 r，p 和 q 的最大公约数即为 q 和r 的最大公约数。*/
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    /**
     * 有两个容器，容积分别为A升和B升，有无限多的水，现在需要C升水。
     * 我们还有一个足够大的水缸，足够容纳C升水。
     * 起初它是空的，我们只能往水缸里倒入水，而不能倒出。
     * 可以进行的操作是： 把一个容器灌满； 把一个容器清空（容器里剩余的水全部倒掉，或者倒入水缸）； 用一个容器的水倒入另外一个容器，直到倒出水的容器空或者倒入水的容器满。
     * 问是否能够通过有限次操作，使得水缸最后恰好有C升水?
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static Boolean can(int a, int b, int c) {
        //求出ab的最大公约数
        int gcd = gcd(a, b);

        if (0 == c % gcd)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(gcd(4, 11));
    }
}
