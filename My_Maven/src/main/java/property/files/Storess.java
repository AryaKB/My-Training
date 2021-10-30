package property.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Storess {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("C:\\Users\\user\\eclipse-workspace\\My_Maven\\src\\main\\resources\\test.properties");
         Properties p=new Properties();
         p.load(fr);
         System.out.println(p.getProperty("userid"));
         System.out.println(p.getProperty("pwd"));
         p.setProperty("email", "arya@gmail.com");
         p.store(new FileWriter("C:\\Users\\user\\eclipse-workspace\\My_Maven\\src\\main\\resources\\test.properties"), null);
         System.out.println(p.getProperty("email"));
         Properties p1=new Properties();
	    p1.setProperty("phn", "52400042");
	    p1.store(new FileWriter("info.properties"), "personal info");
	}
	

}
