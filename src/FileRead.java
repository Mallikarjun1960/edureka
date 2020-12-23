import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("F:\\example.txt"));
		while(br.readLine() != null) {
			String line1=br.readLine();
			System.out.println(line1);
			
		}

	}
	

}
