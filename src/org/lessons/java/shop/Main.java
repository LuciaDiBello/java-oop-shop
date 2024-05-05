package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			ArrayProdotti vp = new ArrayProdotti();
			
			for (int i = 0; i < 19 ; i++) {
				
				System.out.println("Inserire il nome");
				String nome = input.nextLine();
		 
				System.out.println("Inserire la descrizione");
				String descrizione = input.nextLine();
				
				System.out.println("Inserire il prezzo");
				float prezzo = input.nextFloat();

				System.out.println("Inserire l'iva");
				int iva = input.nextInt();
				
				input.nextLine();
				
				//Si istanzia un oggetto della classe Prodotto con i dati acquisiti da tastiera
				Prodotto p = new Prodotto (nome, descrizione, prezzo, iva);
				
				//Si aggiunge il prodotto in coda al vettore
				vp.aggiungiProdotto(p);
			   }
			
			//Si richiama il metodo per stampare il vettore
			vp.stampaVet();
			
			//Si richiamano i metodi della classe Prodotto sul primo elemento dell'array
			float pb = vp.getVetProd()[0].getPrezzo();
			System.out.printf("Prezzo base: %.2f \n", pb);
			      
			float pt = vp.getVetProd()[0].prezzoTot();
			System.out.printf("Prezzo totale: %.2f \n", +  pt);
			    
			String codNome = vp.getVetProd()[0].codNome();
			System.out.println("Il nome esteso è: " + codNome);
			   					  
			//Bonus
			//Stampa il codice formattato del prodotto
			vp.getVetProd()[0].formatoCodice(vp.getVetProd()[0]);
		}
}
