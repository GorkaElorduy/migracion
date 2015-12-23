package com.ipartek.migracion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Migracion {

	public final static String FICHERO_DEFINITIVO = "ficheros/personas.txt";
	public final static String FICHERO_PRUEBAS = "ficheros/pruebas.txt";

	public static void main(String[] args) {
		System.out.println("Comenzamos migracion.....");

		try {
			FileReader archivo = new FileReader(FICHERO_PRUEBAS);
			String linea = "";
			BufferedReader bfr = new BufferedReader(archivo);
			while((linea=bfr.readLine())!=null){
				System.out.println(linea);
			}
			bfr.close();
		} catch (Exception e) {
			
			System.out.println("Parece que ha habido problemas");

		}

	}

}
