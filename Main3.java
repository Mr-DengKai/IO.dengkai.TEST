package io.orilore.dk.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) {
		// TOD Auto-generated method stub
try {
	FileInputStream fint = new FileInputStream("F:\\a.txt");
	InputStreamReader read = new InputStreamReader(fint,"UTF-8");
	char [] kk = new char[fint.toString().length()];
	int k1 = 0;
	while((k1=read.read(kk))!=-1){
		String str = new String(kk,0,k1);
		System.out.println(str);
	
	
	}
	read.close();
	fint.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
