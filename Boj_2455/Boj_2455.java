import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y; //내리는 사람, 타는 사람
		int count=0; // 뭘 세주는거지?
		int max = 0; // 제일 많이 탔을때 사람 수
		int sum; //y-x
		int maxsum = 0; //왜 또 더해?
		for(int i=0; i<4; i++)
		{
			x = sc.nextInt(); //내리는 사람
			y = sc.nextInt(); //타는 사람
			
			sum = y - x; //총 인원 = 탄 사람 - 내리는 사람
			
			max += sum; //max에 sum값을 저장
			
			if(count==0) //맨 처음이면
				maxsum = max; //maxsum에 max저장
			else if(maxsum < max) //처음이 아니라면 둘을 비교
			{
				maxsum = max; //새로 저장된 max값이 maxsum보다 크면 새로 저장
			}
			count++; //카운트 증가
		}
		System.out.println(maxsum); //출력
	}
}
