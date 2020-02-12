import java.util.Scanner;

public class Boj_10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] c = {"a", "b", "c", "d", "e", "f", "g", "h", "i", 
				      "j", "k", "l", "m", "n", "o", "p", "q", "r", 
				      "s", "t", "u", "v", "w", "x", "y", "z"}; //알파벳 배열 생성
		
		int arr[] = new int[26]; //각 알파벳 자리 수 배열 생성
		
		String str = sc.next(); // 문자열 입력
		String[] x = str.split(""); //입력받은 문자열을 자른다
		
		for(int i=0; i<x.length; i++) //문자열 길이만큼 반복
		{
			for(int j=0; j<c.length; j++) //알파벳 배열 길이만큼 반복
			{
				if(x[i].equals(c[j])) //자른 문자열을 하나씩 알파벳 배열과 비교
				{
					arr[j]++; //같으면 알파벳 배열 자리와 같은 자리를 1씩 증가
				}
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" "); //출력
		}
	}
}
