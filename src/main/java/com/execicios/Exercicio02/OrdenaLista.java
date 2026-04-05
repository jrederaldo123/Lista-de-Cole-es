package com.execicios.Exercicio02;

import java.util.*;

public class OrdenaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Criando uma lista de double
        List<Double> numeros = new ArrayList<>();

        // Populando a lista

        System.out.println("======================= Ordenando uma lista =====================");
        System.out.println();
        System.out.println("Entre com os 10 números: ");
        System.out.println();

        int j = 0;
        for (int i = 0; i < 10; i++){
            j = i + 1;
            System.out.print("Entre com o numero[" + j +"]: ");
            numeros.add(sc.nextDouble());
        }

        System.out.println();
        System.out.println("Imprimir a lista: " + numeros);
        System.out.println();

        Collections.sort(numeros);
        System.out.println("Imprimir a lista ordenada crescente: " + numeros);

        Collections.sort(numeros,Collections.reverseOrder());
        System.out.println("Imprimir a lista ordenada decrescente: " + numeros);

        //System.out.println(numeros);









        sc.close();
    }
}
