import java.util.Scanner;

class AlphabetC{
 public static void main( String[] args) {
	 Scanner s =new Scanner (System.in);
  System.out.println("Enter the num of row");
   byte row =s.nextByte();
  
		for(int i=1; i<=row; i++) {
		for(int j=1; j<=row; j++) {
 if(i==1 || j==1 || i==row)
System.out.print(i+""+j +" ");
else
System.out.print("   ");
}
System.out.println( );
}
}
}
					
