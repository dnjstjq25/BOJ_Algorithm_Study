import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int initnum = sc.nextInt();
        int count = 0;
        int x = initnum / 10;    // 십의자리
        int y = initnum % 10;    // 일의자리
        int sum = x + y;       // 두개의 합
        if(x+y!=0)            // 0일 경우 count ㄴㄴ
        	count++;
        int cal = sum % 10;    // 더한 값의 뒷자리
        
        int x1 = y;  // 처음 값의 일의자리
        int y1 = cal; // 두번째 값의 일의자리
        
        while(true){       // 처음 값인 x,y 와 x1,y1이 같아지면 종료
            sum = x1 + y1; 
            cal = sum % 10;
            x1 = y1;
            y1 = cal;
            count ++;
            
            if(x == x1 && y == y1){
                break;
            } 
        }
  
        System.out.println(count);
        
        sc.close();
	}
}
