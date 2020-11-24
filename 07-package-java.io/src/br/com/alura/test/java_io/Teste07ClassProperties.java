package br.com.alura.test.java_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Teste07ClassProperties {

	public static void main(String[] args) throws IOException {
		
		//https://cursos.alura.com.br/course/java-trabalhando-com-io/task/40034
		
		Properties props = new Properties(); 
		props.setProperty("login", "alura"); //chave, valor
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");

		props.store(new FileWriter("conf.properties"), "algum coment�rio");
		
		
		    
		props.load(new FileReader("conf.properties"));

		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");

		System.out.println(login + ", " + senha  + ", " +  endereco);
		
	}
}
