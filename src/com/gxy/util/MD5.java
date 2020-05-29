package com.gxy.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	/**
	 * main method
	 * @param args
	 */
	/*public static void main(String[] args) {
		System.out.println(getMD5Digest("admin2"));//d033e22ae348aeb5660fc2140aec35850c4da997密文结果采用MD5算法
		
		
	}*/
	
	/**
		1.开发中,数据库密码以密文的方式存在
		2.JDK Base64加密算法,可逆算法;不可逆MD5算法
		
		
		登录:以同样的加密算法,加密处理之后,跟数据库数据对比
	
	*/
	
	
	/**
	 * MD5算法或者SHA-1算法要用到的加密算法
	 * 二进制数据转换成十六进制字符串
	 * @author Carry
	 * @param b byte[] 字节流
	 * @return String 十六进制字符串
	 */
	private static String byteToHexString(byte[] b) {

		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1) {
				hs = hs + "0" + stmp;
			} else {
				hs = hs + stmp;
			}
			if (n < b.length - 1)
				hs = hs + "";
		}
		return hs;
	}

	/**
	 * 对源字符串进行md5/SHA-1编码
	 * @author Carry
	 * @param sourceData
	 * @return 密文
	 */
	public static String getMD5Digest(String sourceData) {
		try {
			//此句话是采用MD5算法加密
			MessageDigest alga = MessageDigest.getInstance("MD5");
			
			//此句话是采用SHA-1算法
			//MessageDigest alga=MessageDigest.getInstance("SHA-1");
			alga.update(sourceData.getBytes());
			byte[] digesta = alga.digest();
			return byteToHexString(digesta);
		} catch (NoSuchAlgorithmException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	
	/**
	 * reversible encryption technique
	 * 这个方法是可逆的加密解密算法，传过去明文，得到的是密文；传过去密文，得到的是明文
	 * 自定义方法，可以稍微了解一下
	 * @author Carry
	 * @param inStr
	
	 
	 
	 * @return
	 *//*
	public static String ReversibleW(String inStr) {
		// String s = new String(inStr);
		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 'w');//w可以换成任一字母，加密后结果不同*********解密时要用加密的同一个字母
		}
		String s = new String(a);
		return s;
	}
	
	*//**
	 * Base64加密算法
	 * @param sourceData 明文
	 * @return 密文
	 *//*
	public static String encode(String sourceData) {
		String str = Base64.encode(sourceData.getBytes(), 0);
		return str;
	}
	
	*//**
	 * Base64解密算法
	 * @param str 密文
	 * @return 明文
	 *//*
	public static String decode(String str) {
		try {
			byte[] sourceData = Base64.decode(str);
			return new String(sourceData);
		} catch (Base64DecodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	*/

}
