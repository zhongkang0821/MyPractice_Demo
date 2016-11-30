package com.example;

/**
 * 1.有n个人围成一圈，顺序排号，从第一个开始报数（从1--3报数），报到3的人退出圈子，问最后留下的是几号
 * 2.仲康
 * 3.2016/11/30
 */
public class ShuThree {
    public static void main(String[] args) {
        //定义10个人数放到boolean数组
        boolean people[] = new boolean[100];
        //根据人数进行循环
        for (int i = 0; i < 100; i++) {
            //全部定义为true
            people[i] = true;
        }
        //执行rep方法，把数组传过去
        rep(people);
        //遍历数组
        for (int i = 0; i < people.length; i++) {
            //值为true的人是最后留下的人
            if (people[i]==true){
                System.out.println("最后的人是"+i);
            }
        }
    }

    public static void rep(boolean[] people){
        int i = 0, j = 0 , n = people.length, m = n;
        //while循环,循环条件：n>2
        while (n>1){
            //i+1后向m取余，取余后赋给i
            i=++i%m;
            //以i为下标，如果people当前下标是true
            if (people[i] == true){
                //j+1；
                j++;
                //判断，如果j=3
                if (j == 3){
                    //people当前下标的值改为false
                    people[i] = false;
                    //输出退出圈子的人数
                    System.out.println(i);
                    //数组长度减1
                    n--;
                    //j赋值0
                    j = 0;
                }
            }
        }
    }
}
