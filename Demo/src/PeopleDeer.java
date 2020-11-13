import java.util.Scanner;

public class PeopleDeer {

	public static void main(String[] args) {
		
		//克拉瑪定理
		Scanner sc= new Scanner(System.in);
		//System.out.println("請輸入人鹿合計數量");
		String x = sc.nextLine();
		int n = Integer.parseInt(x.substring(0, 2));
		int m = Integer.parseInt(x.substring(3, 5));
		
		int deer=(m - 2*n)/2;
		int people = n - deer;
		
		System.out.println(people+" "+deer);

	}

}
