
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //Testcase 수 입력
		
		Solution s = new Solution(); 
		
		for(int i=0; i<t; i++)
		{
			int n = sc.nextInt();//phone_book배열 크기 입력
			String[] phone_book = new String[n];//생성
			
			for(int j=0; j<phone_book.length; j++) //데이터 입력
			{
				phone_book[j] = sc.next();
			}
			
			if(s.solution(phone_book)) //true면
			{
				System.out.println("YES"); //yes
			}else                     //false면 
				System.out.println("NO");  //no
		}

	}
}

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashSet<String> hs = new HashSet<String>(); //HashSet 생성

        Arrays.sort(phone_book, new Comparator<String>() { //length가 긴 순서로 정렬
			public int compare(String o1, String o2) {
				
				return o2.length() - o1.length();
			};
		});
		
        for(String num : phone_book) { //num에 phone_book데이터를 넣는다.
        	
        	if(hs.contains(num)) //hs에 num값이 이미 들어있다면(중복검사)
        	{
        		answer = false; //answer가 false로 바뀌고 
        		break; //멈춘다.
        	}
        	
        	for(int i=1; i<num.length() + 1; i++) //hs에 num값이 없다면
        	{
        		String sub = num.substring(0, i); //sub에 num을 0부터 i만큼 자른값을 넣어준다.
        		if(!hs.contains(sub)) { //그 값이 hs에 없다면
        			hs.add(sub); //hs에 
        		}
        	}
        }
        
        return answer;
    }
}

