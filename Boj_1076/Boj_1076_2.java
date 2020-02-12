import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String color[] = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		
		int index1=0; //값 1
		int index2=0; //값 2
		int index3=0; //곱이 들어갈 변수
		
		long mul = 0; //곱을 연산할 때 사용하는 변수
		
		String n1= sc.next(); //입력1~3 ex) yellow, violet, red로 받았다.
		String n2= sc.next();
		String n3= sc.next();
		
		for(int i=0; i<color.length; i++) { //color 배열의 길이만큼 반복문을 돌린다.
			if(color[i].equals(n1)) { //color[i]와 n1~n3이 일치하면 i의 값을 각각 index 1~3에 넣어준다.
				index1=i; //yellow = 4 --> i = 4
			}
			if(color[i].equals(n2)) {
				index2=i; //violet = 7 --> i = 7
			}
			if(color[i].equals(n3)) {
				index3=i; //red = 3 --> i = 2
				mul = ((int)Math.pow(10, index3)); //index3의 값은 값이 아닌 곱이 들어가야하기 때문에 자리수만큼 제곱을 해준다. 10^2 = 100
			}
		}
		System.out.println(((index1*10)+index2)*mul); // (4*10 + 7) * 100 = 4700
	}
}
