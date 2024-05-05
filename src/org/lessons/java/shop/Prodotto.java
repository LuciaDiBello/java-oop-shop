package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Prodotto {
	
		//Campi
		 private int codice;
		 private String nome;
		 private String descrizione;
		 private float prezzo;
		 private int iva;
		 
		 //Costruttore
		 public Prodotto (String nome, String descrizione, float prezzo, int iva)
		 {	 //Si usa la classe Random per generare un numero intero
			 Random c = new Random();
			 this.codice = c.nextInt(19);
			 this.nome = nome;
			 this.descrizione = descrizione;
			 this.prezzo = prezzo;
			 this.iva = iva;
		   }

		 //Metodi 
		  public int getCodice() {
			    return codice;
			 } 
		  
		  public String getNome() {
			    return nome;
			 } 
		  
		  public void setNome (String nome) {
			  this.nome = nome;
			 }
		  
		  public String getDescrizione() {
			    return descrizione;
			 } 
		  
		  public void setDescrizione (String descrizione) {
			  this.descrizione = descrizione;
			 }  
		   
		  public float getPrezzo() {
			    return prezzo;
			 } 
		  
		  public void setPrezzo (float prezzo) {
			  this.prezzo = prezzo;
			 }
		    
		  public int getIva() {
			    return iva;
			 } 
		  
		  public void setIva (int iva) {
			  this.iva = iva;
			 }
		  
		  public float prezzoTot () {
			  float tot = this.prezzo + (this.prezzo * iva)/100;
			  return tot;
		     }
		  
		  public String codNome() {
			  String cn = this.codice + "-" + this.nome;
			  return cn;
		     }
		    // Bonus
	     	  // Metodo statico per la stampa del codice formattato con pad left 
		  // All'interno di un metodo statico non è possibile richiamare un campo non statico
		    // Si può istanziare all'interno del metodo statico un oggetto Prodotto oppure si può
		    // passare come parametro al metodo un oggetto Prodotto e si richiama il campo codice
			 public static void formatoCodice (Prodotto p) {
					//Con il pad left si stampano gli zeri davanti il codice fino ad un totale di 8 cifre
				    String leftpad = String.format("%08d", p.getCodice());
				    System.out.println (leftpad);
			 }
}
