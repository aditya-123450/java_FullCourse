import java.util.Scanner;

public class condition_ifelse {

	public static void main(String[] args) {
		
		int pwd;
		System.out.print("Enter Passwords:=");
		Scanner obj=new Scanner(System.in);
		pwd=obj.nextInt();
		if(pwd==2731)
		{
			System.out.print("My name:=Aditya");
			System.out.print("My agr:=20");
			System.out.print("My contact:=7739240267");
		}
		else
		{
			System.out.print("sorry! wrong password..");
		}
	}

}
