import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		//We need variables for A,B,C
		double A=0;
		double B=0;
		double C=0;
		//Give instructions. Enter 0 for no value.
		System.out.println("Enter the values for A, B & C. Enter 0 for the value you want to solve for.");
		//Ask for A
		System.out.print("A=");
		A=in.nextDouble();
		//Ask for B
		System.out.print("B=");
		B=in.nextDouble();
		//Ask for C
		System.out.print("C=");
		C=in.nextDouble();
		//If C==0,
		if (C==0) {
			//Do A^2+B^2=C^2
			C=Math.pow(A,2)+Math.pow(B, 2);
			C=Math.sqrt(C);
		}
		//Else if A==0
		else if (A==0) {
			//Do A^2=C^2-B^2
			A=Math.pow(C, 2)-Math.pow(B, 2);
			A=Math.sqrt(A);
		}
		//Else if B==0
		else if (B==0) {
			//Do B^2=C^2-A^2
			B=Math.pow(C, 2)-Math.pow(A, 2);
			B=Math.sqrt(B);
		}
		//Else
		else {
			//Not possible
			System.out.println("This isn't possible to solve.");
			in.close();
			System.exit(0);
		}
		//Print answer
		System.out.println("Your three sides are A= "+A+" B= "+B+" C= "+C);
		System.out.format("Your three sides are A= %2.2f B= %08.3f C= %3.4f",A,B,C);
	}

}
