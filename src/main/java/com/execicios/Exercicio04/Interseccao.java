package com.execicios.Exercicio04;

import java.util.*;

public class Interseccao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numero1 = new HashSet<>();
        Set<Integer> numero2 = new HashSet<>();

        System.out.println("Digite os elementos do 1º Conjunto: 1 2 3 4 5");
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o numero: ");
            numero1.add(sc.nextInt());
        }

        System.out.print("Imprimindo o vetor 1: ");
        System.out.println(numero1);
        System.out.println();

        System.out.println("Digite os elementos do 2º Conjunto: 4 5 6 7 8");
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o numero: ");
            numero2.add(sc.nextInt());
        }

        System.out.print("Imprimindo o vetor 2: ");
        System.out.println(numero2);

        // Criando o vetor interserccao como copia de numero1

        Set<Integer> interserccao = new HashSet<>(numero1);

        //criando a intersecccao

        interserccao.retainAll(numero2);
        System.out.print("Imprimindo o vetor Interserccao: ");
        System.out.println(interserccao);
        sc.close();


    }
}
