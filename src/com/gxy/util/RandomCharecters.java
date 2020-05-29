package com.gxy.util;

import java.util.Random;

public class RandomCharecters {

	//length用户要求，随机产生字符串的长度
	public static String getRandomString(int length){
	    String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    Random random=new Random();
	    StringBuffer sb=new StringBuffer();
	    for(int i=0;i<length;i++){
	      int number=random.nextInt(62);
	      sb.append(str.charAt(number));
	    }
	    return sb.toString();
	}

}
