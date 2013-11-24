package CopyFiles;

public class Asciival {
  int n;
  
 
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
}