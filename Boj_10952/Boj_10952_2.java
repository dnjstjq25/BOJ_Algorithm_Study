import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int num1 = scan.nextInt(); //숫자1 입력
			int num2 = scan.nextInt(); //숫자2 입력
			if(num1 == 0 && num2 == 0) break; //둘 다 0이면 멈춘다.
			System.out.println(num1 + num2); //아니면 출력
		}
	}
}
