package io.orilore.dk1.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	String downurl = "http://img1.mm131.com/pic/2542/1.jpg";
	URL url = new URL(downurl);
	HttpURLConnection conne=(HttpURLConnection) url.openConnection();
conne.connect();
String path = "F://new";
String type = downurl.substring(downurl.lastIndexOf("."));
Date date = new Date();
long time =date.getTime();
String filename = path+"//"+time+type;
InputStream input = conne.getInputStream();
BufferedInputStream binput = new BufferedInputStream(input);
FileOutputStream fout = new FileOutputStream(filename);
BufferedOutputStream bout = new BufferedOutputStream(fout);
long t1 = System.currentTimeMillis();
int read =0;
while((read=binput.read())!=-1){
	bout.write(read);
}
fout.flush();
fout.close();
input.close();
long t2 = System.currentTimeMillis();
System.out.println(t2-t1);





} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
