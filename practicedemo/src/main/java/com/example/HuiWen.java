package com.example;

/**
 * autour: 仲康
 * date: 2016/11/30 19:07 
 * update: 2016/11/30
 * version: 5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
 */

public class HuiWen {
    public static void main(String[] args) {
        int j = 0;
        for (long i = 10000; i < 100000; i++)
            if (ishuiwen(i) == 1) {//如果返回值是1，就是回文数，打印出来，如果是0，就不是回文数,不打印
                j++;
                System.out.println("回文数:" + i);
            }
        System.out.println(j + "个相同的回文数");

    }

    public static int ishuiwen(long x) {
        int a, b, c, d, e;//5个变量
        a = (int) (x / 10000);//a=i除以10000
        b = (int) ((x / 1000) % 10);//b=i除以1000后向10取余
        c = (int) ((x / 100) % 10);//c=i除以100后向10取余
        d = (int) ((x / 10) % 10);//d=i除以10后向10取余
        e = (int) (x % 10);//e=i想10取余
        if ((a == e) && (b == d))//如果a=e并且b=d，就是回文数，返回1
            return 1;
        else//否则返回0
            return 0;
    }
}
