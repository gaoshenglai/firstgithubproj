package cn.demo;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//使用变量来存储个人信息
		//(1)判断变量类型：姓名 String字符串  性别  char 年龄 int 分数  double
		//(2)给变量取名 姓名 String  name 字符串  性别  char sex  年龄 int  age 分数  double score
		//（3）使用变量 数据类型  变量名 =值
		System.out.print("请输入姓名:");
		Scanner input=new Scanner(System.in);
		String name =input.next();
		System.out.print("请输入性别:");
		String sex =input.next();
		System.out.print("请输入成绩：:");
		double score =input.nextDouble();
		System.out.print("请输入年龄:");
		int age=input.nextInt();
		/*System.out.println("姓名:"+name);
		System.out.println("性别"+sex);
		System.out.println("年龄:"+age);
		System.out.println("考试分数:"+score);*/
		
		
	}

}
