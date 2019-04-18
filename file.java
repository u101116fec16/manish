import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class file {
	public static void main(String[] args) throws IOException {
		File dir = new File(".");
 
		//String source = dir.getCanonicalPath() + File.separator + "Code.txt";
		//String dest = dir.getCanonicalPath() + File.separator + "Dest.txt";
 
		File fin = new File("C:/Users/Praveen Chandanala/Desktop/apk/calc/AndroidManifest.xml");
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
 
		FileWriter fstream = new FileWriter("C:/Users/Praveen Chandanala/Desktop/apk/calc/kaki.txt");
		BufferedWriter out = new BufferedWriter(fstream);
 
		String aLine = null;
		while ((aLine = in.readLine()) != null) {
			//Process each line and add output to Dest.txt file
			if(aLine.startsWith("    <uses-permission"))
			{
				out.write(aLine);
				out.newLine();
			}
			
		}
 
		// do not forget to close the buffer reader
		in.close();
 
		// close buffer writer
		out.close();
	}
}