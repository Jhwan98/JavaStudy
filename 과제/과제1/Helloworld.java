import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1���� n������ �������մϴ�.");
		
		int n = input.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=n; i++)
			{
			if (i < n)
			System.out.print(i + " + ");
			
			else
			System.out.print(i);
			
			sum = sum+i;
			}
		
		System.out.println(" = " + sum);
	}
	

}
