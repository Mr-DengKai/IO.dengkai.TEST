package io.orilore.dk.test1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fint = new FileInputStream("F:\\kk.txt");
	InputStreamReader read = new InputStreamReader(fint,"UTF-8");
	BufferedReader  read1 = new BufferedReader(read);
	String strline = "";
	while((strline=read1.readLine())!=null){
		System.out.println(strline);
	}
		read.close();
		read1.close();
		fint.close();
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
