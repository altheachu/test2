import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalaryCal {
	
	int H;
	int M;
	int h;
	int m;
	int sperhr;
	int wday;
	int wkhr;
	int total;
	
	public SalaryCal(int h, int m, int h2, int m2, int sperhr, int wday) {
		super();
		H = h;
		M = m;
		h = h2;
		m = m2;
		this.sperhr = sperhr;
		this.wday = wday;
		this.wkhr = ((h*60+m)-(H*60+M))/60+1;
		this.total = wkhr*sperhr*wday;
	}

	public static void main(String[] args) {
		List<SalaryCal> s = new ArrayList<>();
		
		System.out.println("請輸入領薪人數:");
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		
		for(int a=0;a<i;a++)
		{
		System.out.println("請輸入"
				+ "上班時間(H)"+"上班時間(M)"+
				"下班時間(h)"+"下班時間(m)"+
				"時薪(wagePerHour)"+"Work Day");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int H = Integer.parseInt(x.substring(0,2));
		int M = Integer.parseInt(x.substring(3,5));
		int h = Integer.parseInt(x.substring(6,8));
		int m= Integer.parseInt(x.substring(9,11));
		int sperhr = Integer.parseInt(x.substring(12,15));
		int wday = Integer.parseInt(x.substring(16,18));
		SalaryCal p = new SalaryCal(H, M, h, m, sperhr, wday);
		s.add(p);
		}
		
		int[] q = new int[i];
				
		for(int k=0;k<s.size();k++)
		{
			q[k]=s.get(k).total;
			System.out.println(q[k]);
		}
	}
}
