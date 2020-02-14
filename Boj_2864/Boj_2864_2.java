import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next(); //숫자1
		String y = sc.next(); //숫자2

		int min = 0;
		int max = 0;
		
		x = x.replace("6", "5"); //숫자1의 6을 5로 바꿈
		y = y.replace("6", "5"); //숫자2의 6을 5로 바꿈
		
		min = Integer.parseInt(x) + Integer.parseInt(y); //최소값 계산
		
		x = x.replace("5", "6"); //위와 같은 방식으로 최대값 계산
		y = y.replace("5", "6");
		
		max = Integer.parseInt(x) + Integer.parseInt(y);
		
		System.out.println(min+" "+max); //출력
	}

}
