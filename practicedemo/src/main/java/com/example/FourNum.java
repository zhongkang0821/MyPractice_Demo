package com.example;

/**
 * 1.��1,2,3,4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
 * 2.�ٿ�
 * 3.2016/11/30
 */
public class FourNum {
    public static void main(String[] args) {

        //����������
        int count = 0;

  /*
   * ��������ѭ��������ֵİ١�ʮ����λ
   */
        //���ɰ�λ
        for(int i = 1 ; i <= 4 ; i++) {
            //����ʮλ
            for(int j = 1 ; j <= 4 ; j++) {
                //���ɸ�λ
                for (int k = 1 ; k <= 4 ; k++) {
                    //ȷ��i��j��k��λ������ͬ
                    if (i != j && j != k && i != k) {
                        //�������ۼ�
                        ++count;
                        //����̨�����ǰ��ϳ�����λ��
                        System.out.println("��" + count + "����Ϸ�ʽ��" + i + "" + j + "" + k);
                    }
                }
            }
        }

        //����̨���ͳ����Ϣ
        System.out.println(" ����" + count + "����λ����Ϸ�ʽ��");
    }
}
