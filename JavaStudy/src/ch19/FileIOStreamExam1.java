package ch19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExam1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = 
				new FileInputStream("c:/dev/big.bin");
			fos = 
				new FileOutputStream("c:/dev/big2.bin");
			BufferedInputStream bis = 
					new BufferedInputStream(fis);
			BufferedOutputStream bos =
					new BufferedOutputStream(fos);
			int data = 0;
			
			while(true) {
				data = bis.read();
				if(data == -1) break;
				bos.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}







