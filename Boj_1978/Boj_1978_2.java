import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //받을 개수 입력
        Boolean b = true;
        int count = 0;
 
        for (int i = 0; i < num; i++) {
            int pNum = sc.nextInt(); //소수인지 판별할 숫자 입력
 
            if (pNum <= 1) //1보다 같거나 작으면 소수가 아님
                b = false;
            else {
                for (int j = 2; j <= pNum / 2; j++) //그게 아니면 반복한다.
                    if (pNum % j == 0) //입력받은 수 % j의 값이 0이면 소수가 아니다.
                        b = false;
            }
            if (b) //위 조건들을 다 넘어가면 b가 true이므로 
                count++;//카운트를 해준다.
            b = true; //false가 되었을 경우 다음 연산을 위해 true 바꿔주기 위해 사용
        }
 
        System.out.println(count); //출력
        sc.close();
	}

}
