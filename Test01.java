package cn.demo;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//ʹ�ñ������洢������Ϣ
		//(1)�жϱ������ͣ����� String�ַ���  �Ա�  char ���� int ����  double
		//(2)������ȡ�� ���� String  name �ַ���  �Ա�  char sex  ���� int  age ����  double score
		//��3��ʹ�ñ��� ��������  ������ =ֵ
		System.out.print("����������:");
		Scanner input=new Scanner(System.in);
		String name =input.next();
		System.out.print("�������Ա�:");
		String sex =input.next();
		System.out.print("������ɼ���:");
		double score =input.nextDouble();
		System.out.print("����������:");
		int age=input.nextInt();
		/*System.out.println("����:"+name);
		System.out.println("�Ա�"+sex);
		System.out.println("����:"+age);
		System.out.println("���Է���:"+score);*/
		
		
	}

}
