import java.util.Scanner;

public class Boj_1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"}; //색 배열
		int[] value = {0,1,2,3,4,5,6,7,8,9}; //색에 해당하는 값 배열
		long[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000}; //색에 해당하는 곱 배열
		
		String[] input = new String[3]; //입력받기 위한 배열
		String[] str = new String[1]; //
		int count = 0; //입력받을 때 증가시켜주는 변수
		long x = 0; //결과 값
		str[0] = "";
		
		for(int i=0; i<input.length; i++)
		{
			input[i] = sc.next(); // ex) yellow, violet, red를 입력받음
		}
		
		for(int i=0; i<input.length; i++)
		{
			for(int j=0; j<color.length; j++)
			{
				if(input[i].equals(color[j])) //내가 입력한 값과 색 배열의 값이 같다면
				{
					if(count==2) //그런데 카운트가 2번째라면
					{
						x = Integer.parseInt(str[0]) * mul[j]; // str의 값과 곱 배열의 값을 곱해서 x에 저장 47 * 100 = 4700
					}
					else
					{
						str[0] += Integer.toString(value[j]); // count가 2보다 작다면 str에 값 배열의 값을 String형으로 받아서 붙인다.
                                                  // yellow = 4, violet = 7 ==> 47
					}
					count++;
				}
			}
		}
		System.out.println(x); //출력
	}
}
