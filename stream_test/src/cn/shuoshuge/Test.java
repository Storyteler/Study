package cn.shuoshuge;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Test {

	public static void main(String[] args) {
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("f:/b.txt")));
			DataInputStream dis = new DataInputStream(new FileInputStream(new File("f:/b.txt")));
			
			dos.writeInt(343043);
			dos.writeUTF("sjfendoc");
			dos.writeDouble(1);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readDouble());
			
			dos.flush();
			dos.close();
			dis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
/*		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("f:/szx.mp4")));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("f:/b.txt")));
			
			int temp = -1;
			while((temp = bis.read()) != -1) {
				bos.write(temp);
			}
			
			bos.flush();
			bos.close();
			bis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
	}

		//			FileInputStream fis = new FileInputStream("f:/a.txt");
		
/*		FileInputStream fis;
		FileOutputStream fos;
		File file = new File("f:/szx.mp4");
		try {
			 fis = new FileInputStream(file);
			 fos = new FileOutputStream(new File("f:/b.txt"));
			 
			 byte[] buffer = new byte[1024];
			 int len = -1;
			 while((len = fis.read(buffer)) != -1) {
				 fos.write(buffer, 0, len);
			 }
			 
				fos.flush();
				fos.close();
				fis.close();
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		 
		
	}*/

	
}
