package report;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //참가자 수 입력
		HashMap<String, Integer> check = new HashMap<String, Integer>(t); //HashMap 생성(참가자, 동명이인 체크 값)
		String part; //참가자
		String comp; //완주자
		
		for(int i=0; i<t; i++) //참가자 입력받는 배열
		{
			part = sc.next();
			if(check.containsKey(part)) { //맵안에 입력받은 참가자와 동일한 인물이 있다면
				Integer value = check.get(part); //value에 현재 맵안에 있는 값을 준다.
				check.put(part, ++value); //그리고 입력받은 참가자의 이름과 value + 1 한 값을 다시 넣어준다.
			} else //맵안에 입력받은 참가자가 없다면
				check.put(part, 0); //참가자 이름과 0으로 넣어준다.
		}
		
		for(int i=0; i<t-1; i++) //완주자 입력받는 배열
		{
			comp = sc.next(); 
			if(check.containsKey(comp)) { //맵안에 완주자의 이름이 들어있다면
				Integer value = check.get(comp); //참가자때와 마찬가지로 키에 해당하는 값을 value에 넣어준다.
				check.put(comp, ++value); //value + 1을 해준 값을 다시 맵에 넣는다.
			} 
		}
		
		check.forEach((k, v) -> { //맵 전체 반복
			if(v%2==0) //key에 해당하는 value의 값이 짝수면
				System.out.println(k); //완주를 하지 못한 사람
		});
	}

}
