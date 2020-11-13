
public class StringDemo {

	public static void main(String[] args) {
		//從這個例子可以看出String跟StringBuilder的效率差異
		
		String s = "hello";
		long start = System.currentTimeMillis();
		for(int i=1;i<=20000;i++)
			s+="Test";//s=s+"Test" 反覆重新指向
		long end = System.currentTimeMillis();
		System.out.println("Time:"+(end-start)*1.0/1000);//Time: 0.388
		
		
		StringBuilder sb = new StringBuilder("hello");
		long start1 = System.currentTimeMillis();
		for(int i=1;i<=20000;i++)
			sb.append("Test");
		long end1 = System.currentTimeMillis();
		System.out.println("Time:"+(end1-start1)*1.0/1000);//Time: 0.002
	}

}

