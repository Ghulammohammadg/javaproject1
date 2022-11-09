package packege1;

import java.util.Scanner;

public class varible {

	public static void main(String[] args) {
		
		
		join obj=new join();
		int k=obj.s;
		System.out.println(k);
		
		System.out.println(join.a);
		
		obj.show();
		
		//instance and static method class
		Scanner s=new Scanner(System.in);
		System.out.println("enter salary bonus text");
		
		int sallary=s.nextInt();
		int bonus=s.nextInt();
		int text=s.nextInt();
		
		instance_static_mehod obj1=new instance_static_mehod();
		obj1.get(sallary, bonus, text);
		obj1.show();
		

	}}


class join{
	
	int s=100;             //instance varible 
	static int a=20;      // static varible --->this varible access by class name in onther class
	
	void show() {
		int b=19;         // local varible --->this varible access by function 
		System.out.println(b);
	}

}