package com.example;

import java.io.File;

/**
 * 1.递归，遍历文件夹
 * 2.仲康
 * 3.2016/11/30
 */
public class RecursionClass {
    public static void main(String[] args) {

        RecursionClass rc=new RecursionClass();
        File file=new File("E://kk");

        rc.recursion(file);

//        RecursionClass test=new RecursionClass();
//        test.sun();
//    }
//    int sum=0;
//    int a=1;
//    public void sun(){
//        sum+=a;
//        a++;
//        if(sum<100){
//            System.out.println(sum+"?????");
//            sun();
//        }
    }

    public void recursion(File file){
        //判断是否是文件夹
        if(file.isDirectory()){
            //如果是文件夹，把名字输出到控制台
            System.out.println("文件夹——"+file);
            //得到文件夹中的东西，放到数组
            File[] files = file.listFiles();
            //遍历数组
            for (File f:files) {
                //调用自己的方法
                recursion(f);
            }
        }else{
            //如果是文件，打印文件名
            System.out.println("文件——"+file);
        }
    }

}
