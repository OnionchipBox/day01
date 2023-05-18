package day01;
import java.util.Calendar;

public class mytest {
	static int value = 10; // static 스태틱
	public static void main(String[] args) {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY); //캘린더
        String ampm;
        
        ampm = hour < 12 ? "오전" : "오후"; // 조건식 ? "true값" : "false값"
        System.out.println("지금시간은 "+hour+" 시이고 "+ampm+" 입니다");
        
        System.out.println(value);
	}
}
