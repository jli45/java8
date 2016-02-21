package java8;

import java.io.UnsupportedEncodingException;

public class EncodingTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String str = "I am 我汤泉！";
		char[] charArr = str.toCharArray();
		System.out.println(charArr.length);
		for(int i=0;i<charArr.length;i++)
			{
			printChar2(charArr[i]);
			System.out.println("");
			}
		
		byte[] b = "！!".getBytes("GBK"); // ！ and ! is different, ☃
		printBytes(b);
		
		String snowman = new String(new byte[]{0x26,0x03}, "UTF-16BE"); //Unicode, UTF-16 have the same output
		String not_snowman = new String(new byte[]{0x26,0x03}, "UTF-8");
		System.out.println(snowman);
		System.out.println(not_snowman);
		
		//€ 	U+20AC 	0010 0000 1010 1100 	11100010 10000010 10101100 	E2 82 AC
		String euro = new String(new byte[]{(byte)0xE2,(byte)0x82,(byte)0xAC}, "UTF-8");
		System.out.println(euro);
	}
	
	static void printChar(char c)
	{
		byte a1 = (byte) (c & 0x00ff);
		byte a2 = (byte) ((c & 0xff00)>>8);
		printByte(a2);
		printByte(a1);
	}
	
	static void printByte(byte b)
	{
		System.out.print(String.format("%02X ", b));
		
	}
	
	static void printBytes(byte[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			printByte(b[i]);
		System.out.println("");
		}
		
	}
	
	static void printChar2(char c)
	{
		System.out.print(String.format("%04X ", (int)c));
		
	}

}
