package io.orilore.dk.test1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("��ӭ����д�ְ�");
boolean flag =true;
System.out.println("���������뱣����ļ�����");
String filepath = s.next();
File file = new File(filepath);
BufferedWriter writer =null;
if(file.exists()){
	try {
		boolean isexist = file.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
while(flag){
	FileOutputStream fout;
	try {
		fout = new FileOutputStream(file,true);
		writer = new BufferedWriter(new OutputStreamWriter(fout));
	
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("������һ���ı�");
	String str = s.next();
	try {
		writer.write(str);
		writer.newLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("���Ƿ������yes����");
	String userinput = s.next();
	if(!"yes".equalsIgnoreCase(userinput)){
		break;
	}
}
	}

}
