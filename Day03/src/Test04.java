import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入（空格分开）：");
		int month = sc.nextInt();
		int day = sc.nextInt();
		int days = day;
		switch(month){
		case 12:
			//前面11个月的总天数
			//days += 第11月的天数;
			days += 30;
		case 11:
			//前面10个月的总天数
			//days += 第10月的天数;
			days += 31;
		case 10:
			days += 30;//九月
		case 9:
			days += 31;//八月
		case 8:
			days += 31;//七月
		case 7:
			days += 30;//六月
		case 6:
			days += 31;//五月
		case 5:
			days += 30;//四月
		case 4:
			days += 31;//三月
		case 3:
			days += 29;//二月
		case 2:
			days += 31;//一月
			}
		System.out.println("2020年的"+month+"月"+day+"日是第"+days+"天");
	}
}
