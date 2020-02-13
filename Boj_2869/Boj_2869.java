import java.util.Scanner;

public class Boj_2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong(); //낮에 올라가는 데이터
		long b = sc.nextLong(); //밤에 미끄러지는 데이터
		long v = sc.nextLong(); //정상 높이
		double x = 0; //결과 값
		
		if(v<=a)
			System.out.println(1); //정상 높이가 낮에 올라갈 수 있는 숫자보다 같거나 작으면 1로 출력
		else {
			x = (double) (v - b) / (a - b); // ex) 2 1 5의 경우 2x -1(x-y) = 5 라는 공식에 대입하면 4가 나옴
			System.out.println((int)Math.ceil(x)); //소수점의 결과가 나오는 경우에 올림을 해줘야 알맞은 값이 나옴(반올림 절대안된다.)
		}	
	}
}
