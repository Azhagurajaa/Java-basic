import java.util.Scanner;
public class gettingInput{
	public static void main(String args[]){
		Scanner r=new Scanner(System.in);
		int a,b,c;
		System.out.println("ENTER THA NUMBER");
		b=r.nextInt();
		a=r.nextInt();
		c=(a*a)+(b*b)+(2*a*b);
		System.out.println("Result :"+c);
	}
}