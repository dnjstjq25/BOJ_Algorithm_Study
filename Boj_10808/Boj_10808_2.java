import java.util.*;

public class Boj_10808_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next(); //문자열 입력받음
		
		int[] res = new int[26]; // 알파벳 자리 증가를 위한 배열
		
		for(int i=0; i<input.length(); i++) {
			res[input.charAt(i)-'a']++; //입력받은 문자열 - 'a'를 연산한 결과값을 res의 자리로 지정하고 1씩 증가
		}
		
		for (int i : res) {
			System.out.print(i+" ");  // 출력
		}
		
	}
}
