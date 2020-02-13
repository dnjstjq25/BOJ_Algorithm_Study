import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();	//캔디
		int a=1;	//택희
		int b=0;	//영훈
		int c=0;	//남규
		int count=0;

		for(c=3; c<=(n-3) && c>0; c++) {
			for(b=1; b<=(c-2) && b>0; b++) {
					a=(n-(b+c));
					if(a%2==0 && a>0)
					count++;
			}
		}
		System.out.println(count);
	}
}
