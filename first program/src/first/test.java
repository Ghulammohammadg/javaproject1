package first;

public class test {
	
	public static void main(String args[]) {
		
		test1 obj1=new test1();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		obj1.show();
		obj1.get(44, 77);
		
		
		
	}
	
	
	
	}
	
	
	
	
      

 class test1 {
	 int x=200;
		int y=500;
		void show() {
			
			System.out.println("this is function for test1 class="+x);
			System.out.println(x+y);
			
		}
		
		void get(int a,int b) {
			int k=a;
			int l=b;
			System.out.println(k+l);
		}
 }

	