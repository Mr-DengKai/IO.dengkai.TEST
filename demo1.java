package io.orilore.dk.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("����������Ҫ�����ļ����ļ���");
			String input = s.next();

			File fint = new File(input);
			if (fint.exists()) {
				if (fint.isDirectory()) {
					File[] files = fint.listFiles();
					for (File f : files) {
						if (f.isFile()) {
							System.out.println(f.getName());
						}
					}
					System.out.println("��������Ҫ���Ƶ��ļ�����");
					String cstr = s.next();
					boolean flag1 = true;
					String cdirname = null;
					while (flag1) {
						System.out.println("��������Ҫ���Ƶ��Ǹ��ļ���");
						cdirname = s.next();
						File checkfile = new File(cdirname);
						if (checkfile.exists() && checkfile.isDirectory()) {
							break;
						} else {
							System.out.println("�����д�������������");
							continue;
						}
					}
					try {
						FileInputStream finput = new FileInputStream(input + "/" + cstr);
						FileOutputStream fout = new FileOutputStream(cdirname + "/" + cstr);
						int read = 0;
						while ((read = finput.read()) != -1) {

							fout.write(read);
						}
						fout.flush();
						fout.close();
						finput.close();
						System.out.println("���Ƿ������YES����");
						String userinput = s.next();
						if (!"YES".equalsIgnoreCase(userinput)) {
							break;
						}

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				} else {
					System.out.println("�Բ�����Ҫ�����ļ��в����ļ�����������");
					continue;
				}
			}

		}
	}
}
