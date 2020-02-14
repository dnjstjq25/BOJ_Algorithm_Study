import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //멀티탭 개수
		int sum = 0; //총 연결 가능한 컴퓨터 수
		int arr[] = new int[n]; //멀티탭의 구멍개수를 각각 배열에 저장
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt(); //0번째 멀티탭부터 계산
			
			if(i==arr.length-1) //i가 마지막이면 모든 구멍에 컴퓨터를 연결 가능
				sum += arr[i];
			else				//i가 마지막이 아니면 구멍개수 - 1을 해줘야함
				sum += arr[i]-1;
		}
		System.out.println(sum); //출력
	}

}
