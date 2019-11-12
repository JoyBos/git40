package com.yzan.mmm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Scanner {
//	指定一个java的源文件，将信息原样输出到控制台。
	public static String information(String path1) {
		String result="";
		FileInputStream fis=null;
		try {
			File file1=new File(path1);
			fis =new FileInputStream(file1);
			byte[] bs=new byte[fis.available()];
			fis.read(bs);
			result=new String(bs,"utf-8");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=fis) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(information("E:\\作业文件\\测试题\\逻辑思维.txt"));
	}
}
