import java.util.Scanner;

public class Hello2 {

	static int sumof(int a, int b) {
		
		int min, max;
		
		if (a < b)
		{min = a; max = b;}
		
		else
		{min = b; max = a;}
		
		int sum = 0;
		
		for (int i=min; i<= max; i++)
			sum = sum + i;
		
			return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int c, d;
		int result = 0;
		
		System.out.println("a�� b�� �����Ͽ� �� ������ ��� ������ ���� ���մϴ�.");
		System.out.print("a�� ����");
		c = input.nextInt();
		
		System.out.print("b�� ����");
		d = input.nextInt();
		
		result = sumof (c,d);
		System.out.print(result);
	}

}
