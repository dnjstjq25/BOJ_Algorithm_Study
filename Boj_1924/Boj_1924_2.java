import java.util.Scanner;
 
public class Main {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(); //월 입력
        int day = sc.nextInt(); //일 입력
        sc.close();
         
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //1~12월의 일 수 저장
        String[] dayOfTheWeeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};//일~토 요일 저장
         
        int totalDays = day; //입력한 일로 초기화
        for (int i = 0; i < month - 1; ++i) { //입력한 월 - 1까지의 일수를 다 더해준다.
            totalDays += daysInMonth[i]; //만약 3월 18일 입력했다면 1~2월의 일수를 더한다.
        }								// 18 += 31 + 28 
        System.out.println(dayOfTheWeeks[totalDays % 7]); //그 결과값을 7로 나눈 나머지를 요일 배열의 자리수로 사용한다.
    }
}
