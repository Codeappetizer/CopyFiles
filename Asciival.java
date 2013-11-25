package CopyFiles;
public class Asciival {
  int n;
  
 //Scanner s=new Scanner(System.in);
	public void Asciinum(int n){
		String rem="";
		int quo=n;
		
	while(quo>=1){
		rem = (quo%2)+ rem;
		quo=quo/2;
		
		//System.out.println("Binary value is"+quo);
	}
	if(quo == 0){
	rem = "0" + rem;
	}
	
if(rem.charAt(0)=='0'){
	rem=rem.substring(1);
}
//rem = quo + '1';

System.out.println("Binary value is"+rem);
	}
	public static void AsciiChar() {
  //char ch='A';
  //char c='n';
  //System.out.println((int)ch + " "+(int)c);
	}
}