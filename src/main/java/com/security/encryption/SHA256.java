package com.security.encryption;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHA256 {

	public byte[] getByte(String data) throws Exception {
		MessageDigest msgDigest= MessageDigest.getInstance("SHA-256");
		return msgDigest.digest(data.getBytes(StandardCharsets.UTF_8));
	}
	
	public String getHexString(byte[] hash) throws Exception{
		StringBuilder hexStr	 = new StringBuilder(2*hash.length);
		for (int i=0;i<hash.length;i++) {
			String hex=Integer.toHexString(0xff&hash[i]);
			if (hex.length()==1) {
				hexStr.append('0');
			}			
			hexStr.append(hex);
		}
		return hexStr.toString();
	}
	
}
