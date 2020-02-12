import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0; //횟수
		
		int n = sc.nextInt(); //사탕 개수
		
		for(int i=2; i<n-1; i+=2) { //6 밑으로는 0이 나온다.
			count += ((n-i-2)/2);     //6부터 숫자 두개씩 일정한 카운트가 세어지는 규칙이 있다.
		}                           //6 7 8 9 10 11 12 13 14 15 16 17 ...
		                            //1 1 3 3 6  6  10 10 15 15 21 21 ...
    System.out.println(x);      //그리하여 반복문으로 저 수열이 나오도록 돌리면 된다.
                                //이 방식은 택희 영훈 남규가 사탕을 몇개를 받는지 상관할 필요가 없다. ㅋㅋ
		
	}
}
