package jp.dcnet.lss.chapter02;

public class Test1 {

	public static void main(String[] args) {
		int a = 10;
		float b =1.0f;
		
		System.out.println("abc"+"def");//test

		System.out.println("this is line1\tthis line2");//Q1
		System.out.println("this is line1\\tthis line2");//Q1
		System.out.println("this is line1\t this line2");//Q1
		System.out.println("this is line1\n tthis line2");//Q1
		System.out.println(String.valueOf("1.0F"));//Q3
		System.out.println(1.0F + "");//Q3
		System.out.println(1.0 + 2.0);//Q4
		System.out.println(1.0 + "2.0");//Q4
		System.out.println("a");//Q5
		System.out.println(a);

	}

}
