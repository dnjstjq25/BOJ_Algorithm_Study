import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5,6,7,8}; //비교할 배열
		int num[] = new int[8]; //입력받는 배열
		int ascending = 0; //ascending 카운트
		int descending = 0; //descending 카운트
		
		for(int i=0; i<arr.length; i++)
		{
			num[i] = sc.nextInt(); //입력받고
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==num[i]) //입력받은 배열과 비교용 배열을 비교
			{
				ascending++; //ascending 증가
			}
			
			if(arr[arr.length-i-1]==num[i])
			{
				descending++; //descending은 숫자가 반대이기 때문에 인덱스를 반대로 비교
			}
		}
		
		if(ascending==8) //ascending이 8이되면 자리수가 다 맞았기 때문에 출력
		{
			System.out.println("ascending");
		}
		else if(descending==8) //descending이 8이되면 자리수가 다 맞았기 때문에 출력
		{
			System.out.println("descending");
		}
		else //하나라도 맞지않으면 mixed
		{
			System.out.println("mixed");
		}
	}
}
