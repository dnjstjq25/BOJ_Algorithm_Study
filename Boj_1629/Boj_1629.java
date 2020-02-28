import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //곱할 숫자
		int b = sc.nextInt(); //제곱수
		int c = sc.nextInt(); //나머지 연산할 수
		
		long result = 1; //결과가 들어갈 변수
		long d = a%c; //a%c의 값을 구해서 d에 저장
		
		while(b>0)
		{
			if(b%2==1) { //b가 홀수인 경우
				result *= d; //결과값 * d를 연산 후
				result %= c; //결과값 % c를 연산한다.
			}
			d = ((d%c)*(d%c))%c; //d에 d%c를 제곱한 후 c로 %한다.
			b/=2; //b를 다시 2로 나눈다.
		}
		System.out.println(result);
	}
}
