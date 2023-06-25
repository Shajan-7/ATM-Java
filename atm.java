//Bankfun.java
package MiniProject;

import java.util.Scanner;

public class BankFun {
	public int flag1=1,flag2=1,flag3=1,flag4=1,flag5=1,balance1,balance2,balance3,balance4,balance5,a;
	
	public void fun(int a) {
		int pin_no,pin[]={1001,1002,1003,1004,1005},i,v,j=0,m=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("\nEnter Your Pin: ");
		pin_no=scan.nextInt();
		
		if(pin_no==pin[j]|| pin_no==pin[j+1]||pin_no==pin[j+2]||pin_no==pin[j+3]||pin_no==pin[j+4]){
				if(pin_no==pin[j]&&a==1) {
					
				}
				else if(pin_no==pin[j+1]&&a==2) {
					
				}
				else if(pin_no==pin[j+2]&&a==3) {
					
				}
				else if(pin_no==pin[j+3]&&a==4) {
					
				}
				else if(pin_no==pin[j+4]&&a==5) {
					
				}
				else {
					System.out.println("\tPassword is Invalid !!");
				}
		}
		else{
			System.out.println("\tPassword is Invalid !!");
		}
		if(pin_no==pin[0]&&a==1){
			System.out.println("\n\tPress 1->withdraw 2->deposit 3->Balance Enqurie : ");
			i=scan.nextInt();
			if(i==1){
				System.out.println("Enter the Amount for withdraw : ");
				v=scan.nextInt();
				balance1-=v;
				System.out.println("\nAmount Withdrawed");
			}
			else if(i==2){
				System.out.println("Enter the Amount for deposit : ");
				v=scan.nextInt();
				balance1+=v;
				System.out.println("\nAmount Deposited");
			}
			else if(i==3){
				System.out.println("Your balance is "+balance1);
			}
			else{
				System.out.println("\tPressed key is wrong !");
			}
		}
	
		if(pin_no==pin[1]&&a==2){
			System.out.println("\n\tPress 1->withdraw 2->deposit 3->Balance Enqurie : ");
			i=scan.nextInt();
			if(i==1){
				System.out.println("Enter the Amount for withdraw : ");
				v=scan.nextInt();
				balance2-=v;
				System.out.println("\nAmount Withdrawed");
			}
			else if(i==2){
				System.out.println("Enter the Amount for deposit : ");
				v=scan.nextInt();
				balance2+=v;
				System.out.println("\nAmount Depositd");
			}
			else if(i==3){
				System.out.println("Your balance is "+balance2);
			}
			else{
				System.out.println("\tPressed key is wrong !");
			}
		}
	
		if(pin_no==pin[2]&&a==3){
			System.out.println("\n\tPress 1->withdraw 2->deposit 3->Balance Enqurie : ");
			i=scan.nextInt();
			if(i==1){
				System.out.println("Enter the Amount for withdraw : ");
				v=scan.nextInt();
				balance3-=v;
				System.out.println("\nAmount Withdrawed");
			}
			else if(i==2){
				System.out.println("Enter the Amount for deposit : ");
				v=scan.nextInt();
				balance3+=v;
				System.out.println("\nAmount Deposited");
			}
			else if(i==3){
				System.out.println("Your balance is "+balance3);
			}
			else{
				System.out.println("\tPressed key is wrong !");
			}
		}
	
		if(pin_no==pin[3]&&a==4){
			System.out.println("\n\tPress 1->withdraw 2->deposit 3->Balance Enqurie : ");
			i=scan.nextInt();
			if(i==1){
				System.out.println("Enter the Amount for withdraw : ");
				v=scan.nextInt();
				balance4-=v;
				System.out.println("\nAmount Withdrawed");
			}
			else if(i==2){
				System.out.println("Enter the Amount for deposit : ");
				v=scan.nextInt();
				balance4+=v;
				System.out.println("\nAmount deposited");
			}
			else if(i==3){
				System.out.println("Your balance is "+balance4);
			}
			else{
				System.out.println("\tPressed key is wrong !");
			}
		}
	
		if(pin_no==pin[4]&&a==5){
			System.out.println("\n\tPress 1->withdraw 2->deposit 3->Balance Enqurie : ");
			i=scan.nextInt();
			if(i==1){
				System.out.println("Enter the Amount for withdraw : ");
				v=scan.nextInt();
				balance5-=v;
				System.out.println("\nAmount Withdrawed");
			}
			else if(i==2){
				System.out.println("Enter the Amount for deposit : ");
				v=scan.nextInt();
				balance5+=v;
				System.out.println("\nAmount Deposited");
			}
			else if(i==3){
				System.out.println("Your balance is "+balance5);
			}
			else{
				System.out.println("\tPressed key is wrong !");
			}
		}
	}
	
	
	public void acc1(){
		String name="Salamon";
		int a=1;
		if(flag1==1){
			balance1=5000;
			flag1=0;
		}
		
		System.out.println("\tWELCOME "+name);
		fun(a);
	}

	public void acc2(){
		String name="Johnson";
		a=2;
		if(flag2==1){
			balance2=10000;
			flag2=0;
		}
		
		System.out.println("\tWELCOME "+name);
		fun(a);
	}
	public void acc3(){
		String name="Vinson";
		int a=3;
		if(flag3==1){
			balance3=3000;
			flag3=0;
		}
		System.out.println("\tWELCOME "+name);
		fun(a);
	}
	public void acc4(){
		String name="Shajan";
		int a=4;
		if(flag4==1){
			balance4=5500;
			flag4=0;
		}
		System.out.println("\tWELCOME "+name);
		fun(a);
	}
	public void acc5(){
		String name="Magesh";
		int a=5;
		if(flag5==1){
			balance5=6000;
			flag5=0;
		}
		System.out.println("\tWELCOME "+name);
		fun(a); 
	}
	
}




//bank.java

package MiniProject;

import java.util.Scanner;

public class Bank{
	
	public static void main(String[] args) {
		
		int acc[]={13931,13932,13933,13934,13935},acc_no,n=1,b;
		Scanner scan= new Scanner(System.in);
		
		BankFun k=new BankFun();
		
		System.out.println("SS Bank");
		
		while(n==1){
			
			System.out.println("\nEnter Your Account Number: ");
			acc_no=scan.nextInt();
			
			if(acc_no==acc[0]){
				k.acc1();
			}
			else if(acc_no==acc[1]){
				k.acc2();
			}
			else if(acc_no==acc[2]){
				k.acc3();
			}
			else if(acc_no==acc[3]){
				k.acc4();
			}
			else if(acc_no==acc[4]){
				k.acc5();
			}
			else {
				System.out.println("Invalid Account number!!");
			}
			
			System.out.println("\nPress 1->continue : ");
			b=scan.nextInt();
			
			if(b!=1){
				break;
			}
			
		}
		
		System.out.println("\n\tWElcom! Come Again...\n\t  Thank You!!");
		
	}

}
