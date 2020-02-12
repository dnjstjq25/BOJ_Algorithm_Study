import java.util.Scanner;

public class Boj_10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer(); //스트링버퍼 생성
		
		while(true)
		{
			int x = sc.nextInt(); //숫자1
			int y = sc.nextInt(); //숫자2
			
			if(x==0 && y==0) //숫자가 둘 다 0이면
			{
				System.out.println(sb.toString()); //스트링버퍼의 내용을 출력한다.
				break;
			}
			sb.append(x+y+"\n"); //if문의 조건이 아니면 스트링버퍼에
							     //x와 y를 더한 값을 넣는다.
		}
		
	}
}
