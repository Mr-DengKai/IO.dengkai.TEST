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
System.out.println("欢迎来到写字板");
boolean flag =true;
System.out.println("请输入您想保存的文件名称");
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
	System.out.println("请输入一行文本");
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
	System.out.println("您是否继续，yes继续");
	String userinput = s.next();
	if(!"yes".equalsIgnoreCase(userinput)){
		break;
	}
}
	}

}
