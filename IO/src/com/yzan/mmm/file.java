package com.yzan.mmm;

import java.io.File;
import java.io.IOException;

public class file {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Ѹ������");
		File f = new File("F:\\Ѹ�����ظ���");
		if (!f.exists()) {
			f.mkdirs();
		}
		for (File auto : file.listFiles()) {
			File lie =new File (f.getAbsoluteFile()+"\\"+auto.getName());
			if (auto.isDirectory()) {
				lie.mkdirs();
				System.out.println(lie);
			} else {
				lie.createNewFile();
				System.out.println(lie);
			}

		}
	}

}
