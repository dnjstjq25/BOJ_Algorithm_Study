public class Main {

	public static void main(String[] args) {
		
		boolean[] x = new boolean[9995]; //문제의 마지막 출력값이 9993이라 그거보다 조금 더 많이 공간 줌
		int y = 0; //자리수를 지정해주기 위한 변수
		for(int i=1; i<x.length; i++)
		{
			if(i<10) //i가 10보다 작을때
			{
				y = i + i; //본인끼리 더한다
				x[y] = true; //더한 값을 x배열의 자리수로 지정하고 true값으로 전환
			}
			else if(i<100) //10의자리 숫자, 100의자리 숫자, 1000의자리 숫자까지 자리수를 나눠서 배열값을 true로 바꾼다.
			{
				y = i + i/10 + i%10;
				x[y] = true; 
			}
			else if(i<1000)
			{
				y = i + i/100 + i%100/10 + i%10;
				x[y] = true;
			}
			else if(i<10000)
			{
				y = i + i/1000 + i/100%10 + i%100/10 + i%10;
				if(y>9995) //y의 합계가 배열 크기를 벗어나면 break;
					break;
				x[y] = true;
			}
		}
		
		for(int i=1; i<x.length; i++) 
		{
			if(x[i] == false) { //배열의 자리값이 false면 셀프넘버이므로
				System.out.println(i); //출력
			}
		}
	}
}

