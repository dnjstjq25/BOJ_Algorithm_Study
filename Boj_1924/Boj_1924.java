import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		int mm = sc.nextInt(); //월
		int dd = sc.nextInt(); //일
		
		String inputDate; //년월일을 합치기 위한 변수
		
		if(mm<10) //월이 10월 아래면
		{
			inputDate = "20070"+mm+""+dd; //2007 0mm dd로 저장
		}
		else //아니면
			inputDate = "2007"+mm+""+dd; //2007 mm dd로 저장
		
		
		DateFormat df = new SimpleDateFormat("yyyyMMdd"); //날짜 형식을 yyyyMMdd로 설정
		Date date = df.parse(inputDate);//날짜형식에 맞게 inputDate를 날짜 변수에 저장
		
		Calendar calendar = Calendar.getInstance(); //캘린더 클래스의 인스턴스를 받아옴
		calendar.setTime(date); // 날짜를 계산한다.
		
		switch (calendar.get(Calendar.DAY_OF_WEEK)) { //해당 날짜의 요일을 구한다.
		case 1:
			System.out.println("SUN");
			break;
		case 2:
			System.out.println("MON");
			break;
		case 3:
			System.out.println("TUE");
			break;
		case 4:
			System.out.println("WED");
			break;
		case 5:
			System.out.println("THU");
			break;
		case 6:
			System.out.println("FRI");
			break;
		case 7:
			System.out.println("SAT");
			break;
	
		default:
			break;
		}
	}
}
