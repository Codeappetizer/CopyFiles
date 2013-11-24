package CopyFiles;

import java.util.Scanner;

public class binarymain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		Asciival ac=new Asciival();
		do{
			System.out.println("Enter a number");
			 n=s.nextInt();
			 if(n <= -1)
				 break;
			 	ac.Asciinum(n);
		}while(n>-1);
		
		}
}


