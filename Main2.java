package io.orilore.dk.test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fout = new FileOutputStream("F://a.txt");
	OutputStreamWriter writer = new OutputStreamWriter(fout, "UTF-8");
	writer.write("���");
	writer.write("java");
	writer.write("��Һ������ַ���");
	writer.close();
	fout.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
