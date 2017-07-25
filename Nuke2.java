import java.net.*;
import java.io.*;

public class Nuke2 {
	public static void main(String[] arg) throws Exception {
		BufferedReader typedIn = new BufferedReader(new InputStreamReader(System.in));
	    String line = typedIn.readLine();
		String newLine = line.substring(0, 1) + line.substring(2);
		System.out.println(newLine);
		}
	
}