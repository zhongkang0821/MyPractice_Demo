package com.example;

/**
 * 1.杨辉三角形
 * 2.仲康
 * 3.2016/11/30
 * */

public class MyClass {
    public static void main(String[] args) {
//        int a[][] = new int[11][11];
//        for (int i = 0; i < a.length; i++){
//            for (int j = 0; j < a[i].length; j++) {
//                if (j == 0 || i == j){
//                    a[i][j]=1;
//                }else{
//                    if(i>j){
//                        a[i][j] = a[i-1][j]+a[i-1][j-1];
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (i >= j){
//                    System.out.print(a[i][j]+"\t");
//                }
//            }
//            System.out.println();
//        }

        int triangle[][]=new int[5][];// 创建二维数组
        // 遍历二维数组的第一层
        for (int i = 0; i < triangle.length; i++) {
            triangle[i]=new int[i+1];// 初始化第二层数组的大小
            // 遍历第二层数组
            for(int j=0;j<=i;j++){
                // 将两侧的数组元素赋值为1
                if(i==0||j==0||j==i){
                    triangle[i][j]=1;
                    }else{// 其他数值通过公式计算
                        triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
                    }
                System.out.print(triangle[i][j]+"\t"); // 输出数组元素
                }
            System.out.println(); //换行
        }
    }
}
