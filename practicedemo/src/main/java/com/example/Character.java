package com.example;

/**
 * autour: 仲康
 * date: 2016/11/30 16:42
 * update: 2016/11/30
 * version: 字符在字符串中出现次数
 */

public class Character {
    public static void main(String[] args) {
        //定义字符串
        String str="abcdabefghiabjklmabn";
        //定义要找的字符
        String str1="ab";
        //找到的字符的次数
        int count = 0;
        //所找字符的下标
        int start = 0;
        //while循环（判断条件：被查找的字符串（参数：目标字符，开始查找的下标）大于0并且下标小于被查找字符串的长度）
        while(str.indexOf(str1,start)>=0 && start < str.length()){
            //找到了目标字符的情况下count++
            count++;
            //把下表移动到已找到的字符下，循环时从当前下标开始
            start = str.indexOf(str1,start) + str1.length();
        }
        System.out.println(str1 + "在" + str + "中出现的次数为" + count);
    }
}
