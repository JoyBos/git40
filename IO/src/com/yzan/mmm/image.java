package com.yzan.mmm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class image {
//	����һ��ͼƬ�ļ�����һ��Ŀ¼�¡�
	public static void copyimage(String path1,String path2){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			File file1=new File(path1);
			File file2=new File(path2);
			fis=new FileInputStream(file1);
			fos=new FileOutputStream(file2);
			byte[] bs=new byte[fis.available()];
			fis.read(bs);
			fos.write(bs);
			fos.flush();
			System.out.println("�����ɹ�");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(null!=fos) {
					fos.close();
				}
				if(null!=fis) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		copyimage("F:\\ͼƬ\\null3eb12c8952aa32b1.jpg","F:\\Temp\\1234.jpg");
	}
}
