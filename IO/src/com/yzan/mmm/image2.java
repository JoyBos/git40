package com.yzan.mmm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class image2 {
//	拷贝一个图片文件到另一个目录下。
	public static void copyimage(String path1, String path2) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File file1 = new File(path1);
			File file2 = new File(path2);
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			byte[] bs = new byte[10 * 1024 * 1024];
			int n = 0;
			while ((n = fis.read(bs)) != -1) {
				fos.write(bs, 0, n);//
			}
			fos.flush();
			System.out.println("拷贝成功");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fos) {
					fos.close();
				}
				if (null != fis) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		String path1 = "F:\\电视剧";
		String path2 = "F:\\电视剧副本";
		image2.copyimage(path1, path2);
	}
}
