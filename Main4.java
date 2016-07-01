package io.orilore.dk.test1;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fout = new FileOutputStream("F:\\kk.txt");
	
		OutputStreamWriter read = new OutputStreamWriter(fout, "UTF-8");
		
	BufferedWriter dread = new BufferedWriter(read);
	
	
			dread.write("java—ßœ∞∞°");
			dread.newLine();
			dread.write("æ»√¸∞°");
			dread.flush();
			dread.close();
}
		
catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
