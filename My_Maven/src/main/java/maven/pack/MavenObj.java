package maven.pack;
import java.io.IOException;
public class MavenObj {
	public static void main(String[] args) throws IOException {
		 MavenClass obj=new  MavenClass();
		 obj.read();
		System.out.println(obj.readData(0, 1));
	}
}
