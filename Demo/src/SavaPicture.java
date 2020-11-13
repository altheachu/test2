import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;


public class SavaPicture {

	public static void main(String[] args) throws IOException {
        URL  url=new URL("https://img.ruten.com.tw/s3/994/304/kuyi5240/a/95/7c/21818983844220_274.jpg");
        URLConnection cn= url.openConnection();//開啟連線
        //System.out.println("size:"+cn.getContentLength());//看檔案有?KB
        InputStream in=cn.getInputStream();
        OutputStream out=new FileOutputStream("c:/ocp/day39/MoonBirthday.jpg");
        byte[]  bt=new byte[1024];
        int size=0;
        while((size=in.read(bt))>0) {
        	//一個個byte慢慢讀取
        	out.write(bt, 0, size);
        }
        out.close();
        in.close();
        System.out.println("Saved");

	}

}
