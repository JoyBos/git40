package com.yzan.mmm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Scanner {
//	ָ��һ��java��Դ�ļ�������Ϣԭ�����������̨��
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
		System.out.println(information("E:\\��ҵ�ļ�\\������\\�߼�˼ά.txt"));
	}
}
