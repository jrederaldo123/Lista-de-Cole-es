package com.execicios.Exercicios03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjunto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        int fim = -1 ;
        int numero;
        System.out.println("================ Conjunto de Inteiros ==============");
        System.out.println("Entre com os numeros inteiros: ");
        System.out.println();
        while (fim != 0){
            numero = sc.nextInt();
            if(numero != 0){
                if(numeros.add(numero)) {
                    System.out.println(numero +  " Adicioando com sucesso!");
                } else {
                    System.out.println(numero +  " Não Adicioando, repetido!");
                }

            } else {
                fim = 0;
                System.out.print("Exibindo os elementos do conjunto: ");
                System.out.println(numeros);
                System.out.println("Encerrando o programa...");
            }
        }
        sc.close();
    }
}
