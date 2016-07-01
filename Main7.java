package io.orilore.dk1.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream input = new FileInputStream("F://new//a.txt");
     String hello = "ฤ๚บร";
     byte [] bs = hello.getBytes();
     byte [] newbs = new byte[bs.length];
     input.read(newbs);
     String str = new String(newbs);
System.out.println(str);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
