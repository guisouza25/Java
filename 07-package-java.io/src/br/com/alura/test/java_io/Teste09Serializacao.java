package br.com.alura.test.java_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Teste09Serializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setCpf("2222222");
//		cliente.setNome("Guilherme");
//		cliente.setProfissao("Dev");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();		
				
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente2 = (Cliente) ois.readObject();
		System.out.println(cliente2.getNome());		
				
		
//		String nome = "Guilherme";
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
//		
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//		String nome2 = (String) ois.readObject();
//		System.out.println(nome2);
		
		
	}
}