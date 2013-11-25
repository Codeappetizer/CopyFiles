package CopyFiles;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class binarymain {

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		DataInputStream in=new DataInputStream(System.in);
		char ch;
		int n;
		Asciival ac=new Asciival();
		
		do{
			System.out.println("Enter a character");
		 	byte b=in.readByte();
		 	
		     ch= (char) b;
		     while(ch==10){
		    	 ch=(char)in.readByte();
		     }
		  if(ch <= -1)
				 break;
			 
			 	ac.Asciinum(ch);
			 
			 
		}while(ch>-1);
		
		}
}


