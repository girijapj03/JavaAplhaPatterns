import java.util.Scanner;

class AlphabetB{
 public static void main( String[] args) {
	 Scanner s =new Scanner (System.in);
  System.out.println("Enter the num of row");
   byte row =s.nextByte();
  
		for(int i=1; i<=row; i++) {
		for(int j=1; j<=row; j++) {
 if(i==1 || i==row/2 +1 ||  j==1 ||  j-i >=row/2 + 1 || i==row || i== row/2|| i+j >= row+(row/2)+2 )
System.out.print(" ** ");
else
System.out.print("    ");
}
System.out.println( );
}
}
}
					
