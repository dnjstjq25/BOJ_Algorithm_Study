package report;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //듣도 못한 사람 수
		int m = sc.nextInt(); //보도 못한 사람 수
		String ear; //키 변수
		String eye; //키 변수
		int count = 0;
		TreeMap<String, Integer> both = new TreeMap<String, Integer>(); //정렬을 위해 TreeMap으로 생성
		
		for(int i=0; i<n; i++)
		{
			ear = sc.next(); //듣도 못한 사람을 먼저 받는다.
			both.put(ear, 0); //value = 0으로 세팅
		}
		
		for(int i=0; i<m; i++)
		{
			eye = sc.next(); //보도 못한 사람을 받는다.
			if(both.containsKey(eye)) //보도 못한 사람을 입력했을때 듣도 못한 사람과 이름이 같다면 듣보잡이므로
			{
				Integer value = both.get(eye); //해당 key의 value를 받아와
				both.put(eye, ++value); //Map에 넣어준다.
			}
			else
				both.put(eye, 0); //겹치지 않으면 처음 들어오는 key이므로 0으로 세팅
		}
    
    for(String key : both.keySet()){ //듣보잡으로 확정된 사람의 수를 체크하는 반복문
       	 
         Integer value = both.get(key);
 
            if(value > 0)
            	count++;
        }
        
        System.out.println(count); //듣보잡 수 먼저 출력
        
        both.forEach((k,v) -> { //듣보잡의 이름을 출력
        	if(v>0)
        		System.out.println(k);
        });
		
        sc.close();
	}

}
