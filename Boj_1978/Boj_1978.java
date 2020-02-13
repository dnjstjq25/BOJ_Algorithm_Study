import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //입력받을 개수를 입력
		
		int arr[] = new int [n]; //n만큼 배열크기 지정
		
		int i,j;
		int count=0;
		int x=0;
		
		for(int m=0; m<arr.length; m++)
		{
			arr[m] = sc.nextInt(); //배열길이만큼 반복해서 숫자를 받음
		}
		
		for(i=0; i<=1000; i++) //0~1000까지 i값을 반복하고
		{
			for(j=2; j<i; j++) //j는 2부터 시작해서 i만큼 반복한다 1은 소수가 아니기 때문
			{
				if(i%j==0) //그랬을 때 두 값이 0이되면 멈추는데
					break;
			}
			if(i==j) //멈췄을때 i와 j가 같다면 소수다.
			{
				while(true) //반복한다
				{
					if(arr[x]==i) //내가 입력했던 값과 i가 같으면
					{
						count++; //개수증가
					}
					x++; //자리값 증가
					if(x==n) //x가 처음에 입력한 개수랑 같아지면
					{
						x=0; //x를 0으로 만들고
						break; //멈춘다.
					}
				}
			}
		}
		System.out.println(count); //출력
	}

}
