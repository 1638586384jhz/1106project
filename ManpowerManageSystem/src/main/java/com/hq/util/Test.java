package com.hq.util;

import java.io.File;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;






public class Test {

	public static void main(String[] args) {
		//验证码测试
		valCodeTest();

		
	}
	/**
	 * 验证码测试
	 */
	public static void valCodeTest(){
		
	File f = new File("f:2.png");
		
		try {
			//创建输出流对象
			OutputStream os = new FileOutputStream(f);
			//创建生成验证码对象
			ValCode v = new ValCode();
			//生成验证码
			v.createCode();
			//生成图片
			v.write(os);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	

}
