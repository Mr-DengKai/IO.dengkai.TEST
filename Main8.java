package io.orilore.dk1.test;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//try {
//	FileOutputStream fout = new FileOutputStream("F://a");
//DataOutputStream dout = new DataOutputStream(fout);
//dout.writeInt(666);
//dout.writeUTF("  hellojava");
//dout.flush();
//dout.close();
//
//} catch (Exception e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
try {
	FileInputStream finput =new FileInputStream("F://a.txt");
	BufferedInputStream binput = new BufferedInputStream(finput);
	DataInputStream dinput = new DataInputStream(binput);
	int t1 = dinput.readInt();
	String t2 = dinput.readUTF();
	boolean t3 = dinput.readBoolean();
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	dinput.close();
	
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
