import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
         
        int[] counts = new int[10];
        int number = A * B * C;
        while (number > 0) { //number가 0보다 크면 돌린다.
            counts[number % 10]++; //카운트 배열안에(곱한 값을 10으로 나눈 나머지 자리를 증가시킨다)
            number /= 10; //다음 계산을 위해 나눠주기
        }
         
        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }
    }
}
