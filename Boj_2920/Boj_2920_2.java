import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[8];
        for (int i = 0; i < inputs.length; i++) { //배열을 입력받는다.
            inputs[i] = sc.nextInt();
        }
        sc.close();
         
        String output = "";
        for (int i = 0; i < inputs.length - 1; i++) { // 0 == 1 - 1)
            if (inputs[i] == inputs[i + 1] - 1) { //원래 배열과 원래 배열의 다음 자리에 -1을 하면 0의 차이가 나온다. 
                output = "ascending"; //차가 계속 0이면 ascending을 output에 저장 
            } else if (inputs[i] == inputs[i + 1] + 1) { //원래 배열과 원래 배열의 다음 자리에 +1을 하면 0의 차이가 나온다. //8 == 7 + 1
                output = "descending"; //차가 계속 0이면 descending을 output에 저장
            } else { //둘 다 아니면 mixed
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
    }
}
