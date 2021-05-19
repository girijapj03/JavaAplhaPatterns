import java.util.Scanner;

class AlphabetI{
 public static void main( String[] args) {
	 Scanner s =new Scanner (System.in);
  System.out.println("Enter the num of row");
   byte row =s.nextByte();
  
		for(int i=0; i<=row; i++) {
		for(int j=0; j<=row; j++) {
		
 if( i==0||i==row||j==row/2 )
	 
System.out.print(i+""+j +" ");
else
System.out.print("   ");
}
System.out.println( );
}
}
}
					
