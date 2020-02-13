public class Main {
 
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[10001];
         
        for (int i = 1; i <= 10000; ++i) { //1부터 10000까지 반복한다.
            int dn = getDn(i); //getDn()메소드의 리턴값을 받는다.
            if (dn <= 10000) { //리턴값이 10000보다 작거나 같으면 
                isNotSelfNumber[dn] = true; //true값으로 전환
            }
        }
         
        for (int i = 1; i < isNotSelfNumber.length; ++i) {
            if (!isNotSelfNumber[i]) { //true값이 아니면 
                System.out.println(i); //출력
            }
        }
    }
     
    private static int getDn(int n) {
        int dn = n; //1~10000까지 받음
        while(n > 0) { //받은 값이 0보다 크면 반복문 실행
            dn += n % 10; //dn = dn + n%10;
            n /= 10;      //n 값을 나눠서 자리수를 하나빼고 다시 반복을하고 더해준다.
        }
        return dn; //반복문을 빠져나갔을 때 값을 리턴
    }
 
}
