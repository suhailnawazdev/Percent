import java.util.Scanner;

class Percent

{
	
	public static void main(String args[])
	
	{
		int M,P,C,E,H,PE;
		
		System.out.println("Enter the 5 Subject");
		
		Scanner in = new Scanner(System.in);
		
		M= in.nextInt();
		P= in.nextInt();
		C= in.nextInt();
		E= in.nextInt();
		H= in.nextInt();
		PE=M*P*C*E*H;
		
		System.out.println("pe is" + PE);
		
	}
}
     
