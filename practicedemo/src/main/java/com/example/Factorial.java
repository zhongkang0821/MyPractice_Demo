package com.example;

import java.util.Scanner;

/**
 * autour: �ٿ�
 * date: 2016/11/30 14:54
 * update: 2016/11/30
 * version: �׳�
 */

public class Factorial {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("�����������׳˵ĺ�:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int an = 0;

        for(int i = 1;i <= n + 1;i++){
            if(i == n + 1){
                sum += an;
            }else if(i == n){
                sum += an;
                an = 1;
                System.out.print(i+"!");
                for(int j = i;j >= 1;j--){
                    an *=j;
                }
            }else if(i%10 == 0){
                System.out.println();
                sum += an;
                an = 1;
                System.out.print(i+"!"+"+");
                for(int j = i;j >= 1;j--){
                    an *=j;
                }
            }else{
                sum = sum + an;
                an = 1;
                System.out.print(i+"!"+"+");
                for(int j = i;j >= 1;j--){
                    an *=j;
                }
            }
        }System.out.println(" = "+sum);

    }
}