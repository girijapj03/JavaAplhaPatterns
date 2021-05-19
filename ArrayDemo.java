class ArrayDemo{
	public static void main(String[] a){
	//literal way
	int evenNum[]={2,4,6,8,10,12};
	System.out.println(evenNum [2]);
	System.out.println("Size of EvenNumbers" + " " +evenNum.length);
	
	//new keyword//syntax= datatype[] arrayName= new samedatatype[];
	int []oddNum=new int[10];
	System.out.println("size of oddNumbers" + " "  +oddNum.length);
	System.out.println(oddNum[0]);
	oddNum[0]=12;
	System.out.println(oddNum[0]);
	
	for(int i=0;i<evenNum.length; i++){
		System.out.print(evenNum[i] +" ");
	}
	}
}