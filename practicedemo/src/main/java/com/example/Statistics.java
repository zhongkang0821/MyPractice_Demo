package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1.统计字符串中的各个类型数据的个数l
 * 2.仲康
 * 3.2016/11/30
 */

public class Statistics {
    static String s;
    public static void main(String[] args) {
        try {
            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入字符串:");
            //string变量接收输入的string串
            s=r.readLine();
            //各个字符类型的数量
            int chCount = 0;//字母类型
            int digitCount = 0;//数字类型
            int blankCount = 0;//空格
            int chineseCount = 0;//汉字
            //按照string的长度进行循环
            for (int i = 0; i < s.length(); i++) {
                //定义一个char类型的变量接收string的charAt方法返回的字符
                char ch=s.charAt(i);
                //判断，如果是英文类型的，英文类型的数量++
                if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch<= 'Z')){
                    chCount++;
                }
                //判断，如果是数字类型的，数字类型的数量++
                if ('0' <= ch && ch <='9'){
                    digitCount++;
                }
                //判断，如果是空格类型的，空格类型的数量++
                if (ch==' '){
                    blankCount++;
                }
                //判断，如果是因为汉字的，汉字类型的数量++
                if (ch>=0x0391 && ch<= 0xFFE5){//用到中文Unicode编码
                    System.out.println(ch);
                    chineseCount++;
                }
            }
            //打印
            System.out.println("英文字符有"+chCount+"个");
            System.out.println("数字字符有"+digitCount+"个");
            System.out.println("空格字符有"+blankCount+"个");
            System.out.println("中文字符有"+chineseCount+"个");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
