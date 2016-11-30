package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1.ͳ���ַ����еĸ����������ݵĸ���l
 * 2.�ٿ�
 * 3.2016/11/30
 */

public class Statistics {
    static String s;
    public static void main(String[] args) {
        try {
            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("�������ַ���:");
            //string�������������string��
            s=r.readLine();
            //�����ַ����͵�����
            int chCount = 0;//��ĸ����
            int digitCount = 0;//��������
            int blankCount = 0;//�ո�
            int chineseCount = 0;//����
            //����string�ĳ��Ƚ���ѭ��
            for (int i = 0; i < s.length(); i++) {
                //����һ��char���͵ı�������string��charAt�������ص��ַ�
                char ch=s.charAt(i);
                //�жϣ������Ӣ�����͵ģ�Ӣ�����͵�����++
                if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch<= 'Z')){
                    chCount++;
                }
                //�жϣ�������������͵ģ��������͵�����++
                if ('0' <= ch && ch <='9'){
                    digitCount++;
                }
                //�жϣ�����ǿո����͵ģ��ո����͵�����++
                if (ch==' '){
                    blankCount++;
                }
                //�жϣ��������Ϊ���ֵģ��������͵�����++
                if (ch>=0x0391 && ch<= 0xFFE5){//�õ�����Unicode����
                    System.out.println(ch);
                    chineseCount++;
                }
            }
            //��ӡ
            System.out.println("Ӣ���ַ���"+chCount+"��");
            System.out.println("�����ַ���"+digitCount+"��");
            System.out.println("�ո��ַ���"+blankCount+"��");
            System.out.println("�����ַ���"+chineseCount+"��");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
