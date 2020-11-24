package br.com.alura.test.java_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.util.Scanner;

public class Teste03CopiaArquivo2 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("lorem.txt"));
		
		PrintWriter pw = new PrintWriter("lorem2.txt");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			pw.println(linha);
			
		}
		
		scanner.close();
		pw.close();
	}

}
