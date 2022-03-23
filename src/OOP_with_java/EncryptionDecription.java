package OOP_with_java;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Encryption{
	private static SecretKeySpec secretKey;
	private static byte[] key;
	
	public static void setKey(String myKey) {
		MessageDigest sha = null;
		try {
			key = myKey.getBytes("UTF-8");
			sha = MessageDigest.getInstance("SHA-1");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 16);
			secretKey = new SecretKeySpec(key, "AES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public static String encrypt(String strToEncrypt, String secret) {
		if (strToEncrypt == null) {
			Long zero = 0L;
			strToEncrypt = zero.toString();
		}	 
		try {
			setKey(secret);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
		} catch (Exception e) {
			System.out.println("Error while encrypting : "+e.toString());
		}
		return null;
	}
}

class Decryption{
	private static SecretKeySpec secretKey;
	private static byte[] key;
	public static void setKey(String myKey) {
		MessageDigest sha = null;
		try {
			key = myKey.getBytes("UTF-8");
			sha = MessageDigest.getInstance("SHA-1");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 16);
			secretKey = new SecretKeySpec(key, "AES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	public static String decrypt(String strToDecrypt, String secret) {
		try {
			setKey(secret);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
		} catch (Exception e) {
			System.out.println("Error while decrypting : "+e.toString());
		}
		return null;
	}
}

public class EncryptionDecription {

	public static void main(String[] args) {
//		Encryption encryption = new Encryption();
//		Decryption decryption = new Decryption();
		
		String encrypted= Encryption.encrypt("22500", "nsl");
		System.out.println("Encrypted String : "+ encrypted);
		
		String str="OY55xpDgyvHolJcOAbkbfA==";
		String decrypted= Decryption.decrypt(str, "nsl");
		System.out.println("Decrypted String : "+ decrypted);
		

	}

}
