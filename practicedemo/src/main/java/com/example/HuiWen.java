package com.example;

/**
 * autour: �ٿ�
 * date: 2016/11/30 19:07 
 * update: 2016/11/30
 * version: 5λ�����ҳ����У��ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ
 */

public class HuiWen {
    public static void main(String[] args) {
        int j = 0;
        for (long i = 10000; i < 100000; i++)
            if (ishuiwen(i) == 1) {//�������ֵ��1�����ǻ���������ӡ�����������0���Ͳ��ǻ�����,����ӡ
                j++;
                System.out.println("������:" + i);
            }
        System.out.println(j + "����ͬ�Ļ�����");

    }

    public static int ishuiwen(long x) {
        int a, b, c, d, e;//5������
        a = (int) (x / 10000);//a=i����10000
        b = (int) ((x / 1000) % 10);//b=i����1000����10ȡ��
        c = (int) ((x / 100) % 10);//c=i����100����10ȡ��
        d = (int) ((x / 10) % 10);//d=i����10����10ȡ��
        e = (int) (x % 10);//e=i��10ȡ��
        if ((a == e) && (b == d))//���a=e����b=d�����ǻ�����������1
            return 1;
        else//���򷵻�0
            return 0;
    }
}
