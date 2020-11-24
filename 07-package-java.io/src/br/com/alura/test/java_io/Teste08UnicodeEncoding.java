package br.com.alura.test.java_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Teste08UnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {

		String s = "Ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		
		byte[] bytes = s.getBytes("utf-8");
		System.out.print(bytes.length + ", utf-8, ");
		String sNovo = new String(bytes, "utf-8");
		System.out.println(sNovo);
		
		bytes = s.getBytes("utf-16");
		System.out.print(bytes.length + ", utf-16, ");
		sNovo = new String(bytes, "utf-16");
		System.out.println(sNovo);	
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US_ASCII, ");
		sNovo = new String(bytes, "utf-8");
		System.out.println(sNovo);
	}
}
