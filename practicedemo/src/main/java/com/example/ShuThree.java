package com.example;

/**
 * 1.��n����Χ��һȦ��˳���źţ��ӵ�һ����ʼ��������1--3������������3�����˳�Ȧ�ӣ���������µ��Ǽ���
 * 2.�ٿ�
 * 3.2016/11/30
 */
public class ShuThree {
    public static void main(String[] args) {
        //����10�������ŵ�boolean����
        boolean people[] = new boolean[100];
        //������������ѭ��
        for (int i = 0; i < 100; i++) {
            //ȫ������Ϊtrue
            people[i] = true;
        }
        //ִ��rep�����������鴫��ȥ
        rep(people);
        //��������
        for (int i = 0; i < people.length; i++) {
            //ֵΪtrue������������µ���
            if (people[i]==true){
                System.out.println("��������"+i);
            }
        }
    }

    public static void rep(boolean[] people){
        int i = 0, j = 0 , n = people.length, m = n;
        //whileѭ��,ѭ��������n>2
        while (n>1){
            //i+1����mȡ�࣬ȡ��󸳸�i
            i=++i%m;
            //��iΪ�±꣬���people��ǰ�±���true
            if (people[i] == true){
                //j+1��
                j++;
                //�жϣ����j=3
                if (j == 3){
                    //people��ǰ�±��ֵ��Ϊfalse
                    people[i] = false;
                    //����˳�Ȧ�ӵ�����
                    System.out.println(i);
                    //���鳤�ȼ�1
                    n--;
                    //j��ֵ0
                    j = 0;
                }
            }
        }
    }
}
