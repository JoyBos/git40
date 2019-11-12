package com.yzan.mmm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class start {
//	将一个java的源文件中的信息
//	写入到新创建的一个目标的java源文件中。
	public static void Strat (String path1,String path2) {
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
			System.out.println("ok");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
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
			String path1="src\\com\\yzan\\mmm\\image.java";
			String path2="src\\com\\yzan\\mmm\\image58.java";
			start.Strat(path1,path2);
		}
		
		
		
		
		
}
