package packege3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RPasswordclass {

	public static void main(String[] args) {
		String string = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890!@#$%^&*";
		
		
		char character[] = string.toCharArray();
		Random random= new Random();
		ArrayList<Integer> indexes= new ArrayList<Integer>();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Name so thah we can make eight digit Random Password");
		while(true) {
			System.out.println("Usarname:  ");
			String UsarName=scanner.next();
			System.out.println("Random passwoerd:  ");
			
			while(indexes.size()<character.length){
				int num= random.nextInt(character.length);
				if(!indexes.contains(num)) {
					indexes.add(num);
				}
			}
			for(int i=0;i<8; i++) {
				int x=indexes.get(i);
				System.out.print(character[x]);
			}
			System.out.println();

		}
			
			
		}
		
	

}
