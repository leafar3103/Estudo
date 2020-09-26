package com.fatec;

public class Vetor {

	public static void main(String[] args) {
		int [] posicao = new int [10];
		int soma= 0;
		//for (int c=0; c<posicao.length;c++) {
		for (int i=0 ; i<posicao.length;i++) {
			System.out.println("A posicao do vetor " + i);
			posicao[i] = (int)Math.round(Math.random()*10);
			System.out.println(posicao[i]+" ");
		
			soma += posicao[i];
			
		
				}
		System.out.println("o total é ="+ soma);
		

			}

}
