package br.com.alura.test.java_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Teste01Leitura {

	public static void main(String[] args) throws IOException {
		
		
		//Fluxo de entrada com arquivo
	
		InputStream fis = new FileInputStream("lorem.txt"); // Cria fluxo de entrada em binários
		Reader isr = new InputStreamReader(fis, "utf-8");  //Traduz os valores binários para caracteres
//		char[] caracteres = new char[2000];
//		System.out.println(isr.read(caracteres));
		
		BufferedReader br = new BufferedReader(isr); //Faz a leitura do InputStreamReader
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
	}

}
