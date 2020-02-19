import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //숫자입력
        sc.close();
         
        int number = n; 
        int count = 0;
         
        do {
            number = number % 10 * 10 + (number / 10 + number % 10) % 10; //입력한 숫자를 10으로 나눈 나머지에 10을 곱한 값과 - 1
            count++;                                                      //입력한 숫자를 10으로 나눈 몫과 나머지를 더하고 - 2
        } while (n != number);                                            //1 + 2 를 해주고 다시 10으로 나눈 나머지를 구한다.
                                                                          //반복했을 때 입력했던 값과 반복한 결과값이 같아지면 종료
        System.out.println(count);//
    }
}
