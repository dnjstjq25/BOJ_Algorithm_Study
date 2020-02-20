import java.util.Scanner;
 
public class java_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt(); //테스트 케이스 개수 입력받고
        for (int i = 0; i < num; i++) {
            int cnt = sc.nextInt(); //반복할 횟수 입력받고
            String str = sc.nextLine(); //문자열 입력
 
            String result = ""; //결과 출력을 위한 변수
            for (int j = 0; j < str.length(); j++) { //문자열 길이만큼 반복
                for (int k = 0; k < cnt; k++) //입력받은 반복할 횟수만큼 반복
                    result += str.charAt(j); //result에 입력받은 문자열의 자리수를 넣어주는데 k만큼 반복해서 넣어준다.
            }
            result = result.replaceAll(" ", ""); //이 함수를 사용하지 않으면 결과값 맨 앞에 공백이 반복횟수만큼 생긴다.
            System.out.println(result);//출력
        }
        sc.close();
    }
}
