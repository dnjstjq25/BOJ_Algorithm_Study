import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //숫자 입력 3개받고
		int y = sc.nextInt();
		int z = sc.nextInt();
		int result = x * y * z; // 입력받은거 곱해서 저장하고
		int count[] = new int[10]; //0 ~ 9자리 증가시키는 배열
		String arr[] = {"0", "1", "2", "3", "4", 
                        "5", "6", "7", "8", "9"}; //스플릿 배열과 비교할 배열
		String str = Integer.toString(result); //곱한결과를 String으로 형변환
		String[] sp = str.split(""); //형변환해준거 스플릿으로 나눈다.
		
		for(int i=0; i<sp.length; i++) //스플릿 배열 길이만큼 반복문 돌리고
		{
			for(int j=0; j<arr.length; j++) // 그 안에 arr 배열 길이만큼 돌리고
			{
				if(sp[i].equals(arr[j])) //스플릿 배열 데이터를
				{                        //arr배열과 하나씩 비교해준다
					count[j]++;          //같으면 해당 자리 증가
				}
			}
		}
		
		for(int i=0; i<count.length; i++)
		{
			System.out.println(count[i]); //출력
		}
	}
}
