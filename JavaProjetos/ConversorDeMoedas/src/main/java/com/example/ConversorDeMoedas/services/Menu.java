package com.example.ConversorDeMoedas.services;

import java.util.Scanner;

public class Menu {
    private static final String menu = """
    
    ***********************************************
    Selecione uma dentre essas opções de conversões,
    digitando seu respectivo valor numérico:
    
    [1] Real => Dólar americano
    [2] Real => Peso Argentino
    [3] Real => Euro
    [4] Real => Renmimbi (Yuan)
    [5] Real => Yen
    [6] Pesquisa personalizada
    [7] Sair
    ***********************************************
    
    """;
    private static final Scanner read = new Scanner(System.in);

    public static void menuLoop() {
        int option = 0;
        do {
            System.out.println(menu);
            option = read.nextInt();
            read.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Insira o valor para conversão: ");
                    new SearchOnAPI("BRL", "USD", read.nextDouble()).search();
                    read.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    read.nextLine();
                    break;
                case 2:
                    System.out.println("Insira o valor para conversão: ");
                    new SearchOnAPI("BRL", "ARS", read.nextDouble()).search();
                    read.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    read.nextLine();
                    break;
                case 3:
                    System.out.println("Insira o valor para conversão: ");
                    new SearchOnAPI("BRL", "EUR", read.nextDouble()).search();
                    read.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    read.nextLine();
                    break;
                case 4:
                    System.out.println("Insira o valor para conversão: ");
                    new SearchOnAPI("BRL", "CNY", read.nextDouble()).search();
                    read.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    read.nextLine();
                    break;
                case 5:
                    System.out.println("Insira o valor para conversão: ");
                    new SearchOnAPI("BRL", "JPY", read.nextDouble()).search();
                    read.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    read.nextLine();
                    break;
                case 6:
                    System.out.println("Insira o código ISO da moeda que deseja converter: ");
                    String codeBase = read.nextLine();
                    System.out.println("Insira o código ISO da moeda para base do valor de conversão: ");
                    String codeSecondBase = read.nextLine();
                    System.out.println("Insira o valor para conversão: ");
                    new SearchOnAPI(codeBase, codeSecondBase, read.nextDouble()).search();
                    read.nextLine();
                    System.out.println("Pressione Enter para continuar...");
                    read.nextLine();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.out.println("Pressione Enter para continuar...");
                    read.nextLine();
                    break;
            }
        } while (option != 7);
        read.close();
    }
}
