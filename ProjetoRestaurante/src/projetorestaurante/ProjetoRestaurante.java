/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorestaurante;
import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

/**
 * 
 *
 * @author User
 */
public class ProjetoRestaurante {
      /*ArrayList<Prato> prato = new ArrayList<Prato>();
        Prato prato2 = new Prato("Prato1",5,5,"desc");*/
    
    public static void clearScreen() 
    {  

        System.out.print("\033[H\033[2J");  
        System.out.flush();  

    }
    
    public static void Produtos()
    {
        String nome;
        System.out.println("CATEGORIA DO PRODUTO A INSERIR:");
        Scanner sc = new Scanner(System.in);
        nome = sc.next();
        System.out.println(nome);
        
    }
    
    public static void ShowMenu()
    {
         int opcao = 0;
	do {
            clearScreen();
		System.out.println("\n\n### GESTÃO DO RESTAURANTE ###");
		System.out.println("\n                  =========================");
		System.out.println("                  | 1 - Produtos                    |");
                System.out.println("                  | 2 - Solicitação de mesa         |");
		System.out.println("                  | 3 - Adicionar Items a um pedid  |");
		System.out.println("                    4 - Estado Pedido               |");
		System.out.println("                    5 - Fechar Pedido               |");
		System.out.println("                  | 6 - Cliente                     |");
		System.out.println("                  | 7 - Fornecedor                  |");
		System.out.println("                  | 0 - Sair                        |");
		System.out.println("                  =========================\n");

		Scanner sc = new Scanner(System.in);
                opcao = sc.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1:
                    clearScreen();
                        Produtos();
			break;
		case 2:
			break;
		case 5:
			break;
		case 0:
			break;
		default:
            	System.out.println("Opção Inválida!");
			break;
		}
	} while (opcao != 0);
    }
    
    public static void main(String[] args) {
        ShowMenu();
    
    }
}
