import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //테스트케이스 개수 입력받고
		
		for(int x=0; x<t; x++)
		{
			int num = sc.nextInt(); //반복할 횟수 입력받고
			
			String str = sc.next(); //문자열 입력
			String[] split = str.split(""); //문자열을 하나하나 나눈다
			for(int i=0; i<split.length; i++) //문자열 개수만큼 반복을 돌리고
			{
				for(int j=0; j<num; j++)
				{
					System.out.print(split[i]); //입력받은 횟수만큼 반복해서 출력
				}
			}
			System.out.println(); //다음 입력받기 편하게 줄바꿈
		}
	}
}
