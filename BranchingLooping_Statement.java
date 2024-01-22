package zen;
import java.util.Scanner;
public class BranchingLooping_Statement {
	//print Number between 10 to 50
	void method1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=10;i<=num;i++) {
			System.out.println("Number from 10 to 50 -->"+i);
		}
	}
	//given number is positive or negative	
	void method2() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0)  
		{  
			System.out.println("The number is positive.");  
		}  
		else if(num<0)  
		{  
			System.out.println("The number is negative.");  
		}  
		else  
		{  
			System.out.println("The number is zero.");  
		} 
	}
	//reverse number
	void method3() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev =0;
		while(num !=0){
			int remainder = num%10;
			rev = rev*10 + remainder;
			num = num/10;
		}
		System.out.println(rev);

	}
	//find smallest number among 3
	void method4() {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if (num1 < num2 && num1 < num3)  
			System.out.println("The smallest number is: "+num1);  
		else if (num2 < num1 && num2 < num3)  
			System.out.println("The smallest number is: "+num2);  
		else if (num3 < num1 && num3 < num2)  
			System.out.println("The smallest number is: "+num3);  
		else  
			System.out.println("The numbers are same.");  

	}
	//
	void method5() {
		Scanner sc = new Scanner(System.in);
		int purchase_amt=sc.nextInt();
		if(purchase_amt < 500) {
			System.out.println("no discount "+purchase_amt);
		}else if(purchase_amt > 500 && purchase_amt < 1000) {
			int discount = purchase_amt*10/100;
			System.out.println("discount 10% "+(purchase_amt-discount));
		}else if(purchase_amt > 1000) {
			int discount = purchase_amt*20/100;
			System.out.println("discount 20% "+(purchase_amt-discount));
		}else {
			System.out.println("not valid");
		}
	}
	void method6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j >= 1; j--) {
				if (j > i) {
					System.out.print(j);
				} else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		BranchingLooping_Statement obj = new BranchingLooping_Statement();
		//obj.method1();
		//obj.method2();
		//obj.method3();
		//obj.method4();
		//obj.method5();
		obj.method6();
	}

}
