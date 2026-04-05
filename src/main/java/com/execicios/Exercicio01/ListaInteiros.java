package com.execicios.Exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListaInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando a lista de inteiros

        List<Integer> numeros = new ArrayList<>();

        System.out.println("============= Lista de Inteiros ====================");
        System.out.println();

        // Populando  a Lista
        int j = 0;

        for (int i = 0; i < 5; i++){
            j = i + 1;
            System.out.print("Entre com o numero[" + j + "]: ");
            numeros.add(sc.nextInt());
        }

        System.out.println();
        System.out.println("Imprimindo a lista de inteiros");
        System.out.println();
        for (Integer nu:numeros){
            System.out.print(nu + " ");
        }

        numeros.remove(2);
        System.out.println();
        System.out.println("Imprimindo a lista de inteiros sem o numero do indice 2");
        System.out.println();
        for (Integer nu:numeros){
            System.out.print(nu + " ");
        }


        sc.close();

    }
}
