package io.orilore.dk.test1;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.xml.crypto.Data;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("F://test.txt");
DataOutputStream dout = new DataOutputStream(fout);

			dout.writeUTF("ÄãºÃ°¡£¬java");
			dout.writeUTF("hello java world");
			dout.writeByte(12);
			dout.writeLong(123456789l);
			dout.writeBoolean(true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream finput = new FileInputStream("F://test.txt");

			DataInputStream dinput = new DataInputStream(finput);
		String d=	dinput.readUTF();
		String d1=	dinput.readUTF();
			
			byte str = dinput.readByte();
			long str1 = dinput.readLong();
			System.out.println(d);
			System.out.println(d1);
			System.out.println(str);
			System.out.println(str1);
			dinput.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
