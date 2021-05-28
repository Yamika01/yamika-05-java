import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int amin=sc.nextInt();
			int bmin=sc.nextInt();
			int cmin=sc.nextInt();
			int tmin=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(a>=amin&&b>=bmin&&c>=cmin)
			{
				if(a+b+c>=tmin)
				{
					System.out.println("yes");
				}
			
			else
			{
				System.out.println("no");
			}
				
			}
		}
	}

}
