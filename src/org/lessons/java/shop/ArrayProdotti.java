package org.lessons.java.shop;

public class ArrayProdotti {
        	//Campi
		private Prodotto[] vetProd;
		private int indice = 0;
		
		//Costruttore
		public ArrayProdotti() {
			this.vetProd = new Prodotto[19];
		}
		
		//Metodi
		public Prodotto[] getVetProd() {
		    return vetProd;
		 } 
		
		public void aggiungiProdotto(Prodotto p) {
			if(indice < vetProd.length) {
				vetProd[indice] = p;
				indice++;
			} 
		}
		
		public void stampaVet() {
			for(int i = 0; i < vetProd.length; i++) {
				System.out.println(
						vetProd[i].getCodice() + ", " 
						+ vetProd[i].getNome() + ", " 
						+ vetProd[i].getDescrizione() + ", " 
						+ vetProd[i].getPrezzo() + ", " 
						+ vetProd[i].getIva());
			           }
            } 
}
