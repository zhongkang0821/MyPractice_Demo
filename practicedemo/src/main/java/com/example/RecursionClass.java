package com.example;

import java.io.File;

/**
 * 1.�ݹ飬�����ļ���
 * 2.�ٿ�
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
        //�ж��Ƿ����ļ���
        if(file.isDirectory()){
            //������ļ��У����������������̨
            System.out.println("�ļ��С���"+file);
            //�õ��ļ����еĶ������ŵ�����
            File[] files = file.listFiles();
            //��������
            for (File f:files) {
                //�����Լ��ķ���
                recursion(f);
            }
        }else{
            //������ļ�����ӡ�ļ���
            System.out.println("�ļ�����"+file);
        }
    }

}
