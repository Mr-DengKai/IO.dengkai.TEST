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
			System.out.println("请输入您想要复制文件的文件夹");
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
					System.out.println("请输入您要复制的文件名字");
					String cstr = s.next();
					boolean flag1 = true;
					String cdirname = null;
					while (flag1) {
						System.out.println("请输入您要复制到那个文件夹");
						cdirname = s.next();
						File checkfile = new File(cdirname);
						if (checkfile.exists() && checkfile.isDirectory()) {
							break;
						} else {
							System.out.println("输入有错误请重新输入");
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
						System.out.println("您是否继续，YES继续");
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
					System.out.println("对不起我要的是文件夹不是文件请重新输入");
					continue;
				}
			}

		}
	}
}
