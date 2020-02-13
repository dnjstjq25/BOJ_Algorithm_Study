import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();	//캔디
		int a=1;	//택희
		int b=0;	//영훈
		int c=0;	//남규
		int count=0;
		
		//사탕의 개수가 6미만이면 규칙에 맞게 나눠줄 방법이 없다.
		//고로 규칙에 맞게 나눠줄 수 있는 사탕의 개수는 6부터다
		//주어진 사탕의 개수가 6개라고 가정을하면
		for(c=3; c<=(n-3) && c>0; c++) { //남규에게 3개를 주고
			for(b=1; b<=(c-2) && b>0; b++) {//영훈이에게 1개를 준다
					a=(n-(b+c)); //그리고 택희는 사탕의 개수 - (남규 + 영훈)을 한 값을 가져간다.
					if(a%2==0 && a>0)//그것이 0보다 크고 짝수일 경우에만
					count++; //카운트 한다.
			}
		}
		System.out.println(count);
	}
}
