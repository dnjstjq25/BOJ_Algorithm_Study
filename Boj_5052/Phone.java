import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		Solution s = new Solution();
		
		for(int i=0; i<t; i++)
		{
			int n = sc.nextInt();
			String[] phone_book = new String[n];
			
			for(int j=0; j<phone_book.length; j++)
			{
				phone_book[j] = sc.next();
			}
			
			if(s.solution(phone_book))
			{
				System.out.println("YES");
			}else
				System.out.println("NO");
		}

	}
}

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i=0; i<phone_book.length-1; i++)
        {
        	for(int j=i+1; j<phone_book.length; j++)
        	{
        		if(phone_book[i].startsWith(phone_book[j]))
        			answer=false;
        		if(phone_book[j].startsWith(phone_book[i]))
        			answer=false;
        	}
        }
        
        return answer;
    }
}

