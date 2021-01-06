//ÎÄ¼þ¸´ÖÆFileInputStream
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class Text1 {
	static File source = new File("C:\\Users\\sourse.txt");
	static File dest = new File("C:\\Users\\dest.txt");
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream input = null;    
	    OutputStream output = null;    
	    try {
	           input = new FileInputStream(source);
	           output = new FileOutputStream(dest);        
	           byte[] buf = new byte[1024];        
	           int bytesRead;        
	           while ((bytesRead = input.read(buf)) > 0) {
	               output.write(buf, 0, bytesRead);
	           }
	    } finally {
	        input.close();
	        output.close();
	    }
	}
}
