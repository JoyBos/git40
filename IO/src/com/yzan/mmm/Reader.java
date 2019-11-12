package com.yzan.mmm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Reader {
	public static void ud() {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			File file1 = new File("txt\\a.txt");
			File file2 = new File("txt\\b.txt");
//		字节》字节流》字节字符转化流》字符流
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
			String temp = "";
			while ((temp = br.readLine()) != null) {
				int index = temp.indexOf("=");
				String key = temp.substring(0,index);
				if (key.equals("sd")) {
					temp = key +"=5274128419283963665328263267632236";
				}
				bw.write(temp + "\r\n");
			}
			bw.flush();
			System.out.println("ok");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != bw) {
					bw.close();
				}
				if (null != br) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Reader.ud();
	}
}
