import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //숫자 a,b,c 입력받음
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mul = a * b * c; //입력 받은거 곱함
		int arr[] = new int[10]; //0~9 숫자 증가시켜줄 배열
		int x; //자리수
		String length = Integer.toString(mul); //곱해준 결과의 길이를 알기위해서 사용
		
		for(int i=0; i<length.length(); i++) //곱해준 결과값의 길이만큼 반복문을 돌린다.
		{
			x = mul % 10; //만약 곱한 결과가 25123050 라고 하면 뒤에서부터 하나씩 x에 저장된다 
			arr[x]++; //arr배열의 x자리수를 증가
			mul = mul/10; //mul 값을 나눠줘야 다음에도 숫자를 연산할 수 있다.
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]); //
	}
}
