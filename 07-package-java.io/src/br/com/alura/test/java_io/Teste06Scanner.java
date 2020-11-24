package br.com.alura.test.java_io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste06Scanner {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "utf-8");
	
		while(scanner.hasNextLine()) {	
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt","BR"), "%s %d %d %s %.2f %n", 
							tipoConta,agencia,numero,titular,saldo);
			
			
			linhaScanner.close();	
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.asList(valores));
		}
		
		scanner.close();
		

		
	}
}
