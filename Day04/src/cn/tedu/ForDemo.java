package cn.tedu;

public class ForDemo {

	public static void main(String[] args) {
		/*
		 * ѭ���ṹ��
		 * 	��������ִ��ĳ���һ�λ��߶��
		 * ѭ����Ҫ�أ�
		 * 	ѭ�������ĳ�ʼ��
		 * 	ѭ������������ѭ��������
		 * 	ѭ�������ĸı䣨����ѭ�������ķ���ı䣩
		 * 	(ѭ����)
		 * ѭ��������
		 * 	��ѭ�������з����ı����
		 * 1 2 4 3 243 243 243....2ѭ������Ϊ��ʱ����
		 * 
		 * ����������
		 * ����������ʼ������������Ĵ�����
		 * for(int j=1,i=99;j<2&&i<100;j++,i++)
		 * 
		 * m+=2
		 * m=m+m
		 * m++
		 * 
		 * //break�󲻿�д����
		 */
		
		//��ϰ ��ӡ1-10   �ܱ�3����  1-10�ĺ�  �׳�
		//int i = 1;
		int sum = 0;
		int s = 1;
		for(int i=1;i<11;i++) {
			//�ж��Ƿ�3����
			if(i%3==0) {
				//System.out.println(i);
			}
			//���
			sum+=i;
			//�׳�
			s*=i;
		}
		
		System.out.println(sum+","+s);
	}

}