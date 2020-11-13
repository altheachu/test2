import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadBig5 {

	public static void main(String[] args) throws IOException {
        InputStream ins=new FileInputStream("c:/ocp/day39/chinese.txt");
        InputStreamReader isr=new InputStreamReader(ins,"utf-8");
        //InputStreamReader isr=new InputStreamReader(ins,"big5");
        //txt檔預設utf-8編碼
        BufferedReader br=new BufferedReader(isr);
        System.out.println(br.readLine());
        ins.close();
	}
}
