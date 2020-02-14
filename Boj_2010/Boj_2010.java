import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //플러그 개수 입력받음
		int count = 0;
		int i = 0;
		
		check:
		while(i < n) 
		{
			int m = sc.nextInt(); //플러그 구멍 개수 입력
			
			if(m>1 && i==n-1) //플러그 구멍 개수가 1보다 크고 
			{				  //i값이 플러그 개수-1 과 같으면
				count = count+(m); // 구멍 개수 만큼 카운트한다.
				break check;
			}
			
			if(m>1)
			{
				count = count+(m-1); //구멍개수가 1보다 크면 입력값-1 의 값을 카운트한다.
			}
			if(m==1 && i==n-1)
			{
				count++; //구멍의 개수가 1이고 i의 값이 n-1이면 그냥 카운트를 해준다.
			}
			
			i++; //i증가
		}
			
		System.out.println(count); //출력

	}
}
