import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, sum=0, max=0;
		
		for(int i=0; i<4; i++)
		{
			x = sc.nextInt(); //내리는 사람
			y = sc.nextInt(); //타는 사람
			if(i==0) //1번역일때
				sum = x + y; //그냥 더해준다.
			else//1번역을 지나면
				sum = sum - x + y; //타고있는 사람 - 내리는 사람 + 타는 사람
			
			if(max < sum) //max보다 sum이크면 max를 sum으로 바꿔준다.
				max = sum; 
		}
		System.out.println(max); //출력
	}

}
