package br.com.alura.test.java_io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.Writer;

public class Teste05EscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("lorem2.txt"); 
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		long ini = System.currentTimeMillis();
		
		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		
		PrintWriter pw = new PrintWriter("lorem2.txt", "utf-8");
	
		pw.println(" ���   Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	
		pw.println("aaaa");
		
		pw.close();
		

	}

}
	