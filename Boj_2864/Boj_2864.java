import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String x = sc.next(); //숫자1
		String y = sc.next(); //숫자2

		int min = 0;
		int max = 0;

		String[] xs = x.split(""); //숫자1을 하나씩 자른다
		String[] ys = y.split(""); //숫자2를 하나씩 자른다
		String xx = "";
		String yy = "";

		for (int i = 0; i < xs.length; i++) { //5를 6으로 바꿔주는 반복문
			if (xs[i].equals("5")) { //숫자1
				xs[i] = "6";
			}
			if (ys[i].equals("5")) { //숫자2
				ys[i] = "6";
			}
			xx += xs[i]; //잘라준것을 다시 붙인다.
			yy += ys[i];
		}
		
		max = Integer.parseInt(xx) + Integer.parseInt(yy); //새로 나온 값들을 더해서 max에 저장
		
		xx=""; yy=""; //최소값 계산을 위해 초기화

		for (int i = 0; i < xs.length; i++) { //위와 동일한 방식
			if (xs[i].equals("6")) {
				xs[i] = "5";
			}
			if (ys[i].equals("6")) {
				ys[i] = "5";
			}
			xx += xs[i];
			yy += ys[i];
		}
		
		min = Integer.parseInt(xx) + Integer.parseInt(yy);

		System.out.println(min + " " + max); //출력

	}
}
