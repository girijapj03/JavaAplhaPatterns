import java.util.Scanner;
class AlphabetA{
 public static void main( String[] args) {
	  Scanner A= new Scanner(System.in);
System.out.println("Enter the num of row");
   byte row =A.nextByte();
		for(int i=1; i<=row; i++) {
		for(int j=1; j<=row; j++) {
 if(i+j <= row/2 +2 || j-i >= row/2  || i==1 || i==row/2 + 1 || j==1|| j==row)
System.out.print(i+""+j +" ");
else
System.out.print("   ");
}
System.out.println( );
}
}
}
					
