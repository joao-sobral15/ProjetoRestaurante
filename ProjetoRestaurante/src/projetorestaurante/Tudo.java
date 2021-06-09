package projetorestaurante;


import java.util.ArrayList;
import java.util.Scanner;


public class Tudo {
    
        ArrayList<Mesa> mesas = new ArrayList<Mesa>();
        ArrayList<Prato> pratos = new ArrayList<Prato>();
        ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
        ArrayList<Snack> snacks = new ArrayList<Snack>();
        ArrayList<Doce> sobremesas = new ArrayList<Doce>();
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        //ProjetoRestaurante projeto = new ProjetoRestaurante();
        
        Mesa mesa1 = new Mesa(1, true);
        Mesa mesa2 = new Mesa(2, true);
        Mesa mesa3 = new Mesa(3, true);
        Mesa mesa4 = new Mesa(4, true);
        
   
    public  void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    public void criaProdutos()
    {
        if(pratos.size() == 0)
        {
            Prato bife = new Prato("bife",5, "Bem passado");
            pratos.add(bife);
            Prato lasanha = new Prato("lasanha", 8, "De bacalhau");
            pratos.add(lasanha);
        }
        
        if(bebidas.size() == 0)
        {
            Bebida cocaCola = new Bebida("Coca-Cola", 2, 1, true);
            bebidas.add(cocaCola);
            Bebida sumol = new Bebida("Sumol de Ananás", 2, 1, true);
            bebidas.add(sumol);
        }
        
        if(snacks.size() == 0)
        {
            Snack pao = new Snack("Pão", 2, 6, false);
            snacks.add(pao);
            Snack manteiga = new Snack("Manteiga", 1, 1, false);
            snacks.add(manteiga);
        }
        
        if(sobremesas.size() == 0)
        {
            Doce babaCamelo = new Doce("Baba de Camelo", 2.5, "Leite condesado com natas", false);
            sobremesas.add(babaCamelo);
            Doce boloBolacha = new Doce("Bolo de Bolacha", 2.5, "Bolacha com café e natas", true);
            sobremesas.add(boloBolacha);
        }
       
    }
    
    public void mostraProdutos()
    {
        System.out.println("Produtos: \n");
        
        for(Prato p: pratos)
        {
            System.out.println(p.toString());
        }
        
        for(Bebida b: bebidas)
        {
            System.out.println(b.toString());
        }
        
        for(Snack s: snacks)
        {
            System.out.println(s.toString());
        }
        
        for(Doce d: sobremesas)
        {
            System.out.println(d.toString());
        }
    }

    public void adicionarPratoPrincipal()
    {
        for(Prato p : pratos)
        {
           System.out.println(p.toString());
         }
        int opcao, opcao2;
        System.out.println(pedidos.size());
        System.out.println("MESA A ADICIONAR: ");
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        System.out.println("Produto a Adicionar: ");
        Scanner sc2 = new Scanner(System.in);
        opcao2 = sc2.nextInt();
       
        Pedido prato = new Pedido(opcao, pratos.get(opcao2).getPreco(), pratos.get(opcao2).getNomeProduto());
        pedidos.add(prato);
    }
    
    public void adicionarBebida(){
        for(Bebida b: bebidas)
        {
            System.out.println(b.toString());
        }
        
        int opcao, opcao2;
        System.out.println(pedidos.size());
        System.out.println("MESA A ADICIONAR: ");
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        System.out.println("Produto a Adicionar: ");
        Scanner sc2 = new Scanner(System.in);
        opcao2 = sc2.nextInt();
        
        Pedido bebida = new Pedido(opcao, bebidas.get(opcao2).getPreco(), bebidas.get(opcao2).getNomeProduto());
        pedidos.add(bebida);
    }
    
    public void adicionarSnack()
    {
        for(Snack s: snacks)
        {
            System.out.println(s.toString());
        }
        
        int opcao, opcao2;
        System.out.println(pedidos.size());
        System.out.println("MESA A ADICIONAR: ");
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        System.out.println("Produto a Adicionar: ");
        Scanner sc2 = new Scanner(System.in);
        opcao2 = sc2.nextInt();
        
        Pedido snack = new Pedido(opcao, snacks.get(opcao2).getPreco(), snacks.get(opcao2).getNomeProduto());
        pedidos.add(snack);
        
    }
    
    public void adicionarSobremesa()
    {
        for(Doce d: sobremesas)
        {
            System.out.println(d.toString());
        }
        
        int opcao, opcao2;
        System.out.println(pedidos.size());
        System.out.println("MESA A ADICIONAR: ");
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        System.out.println("Produto a Adicionar: ");
        Scanner sc2 = new Scanner(System.in);
        opcao2 = sc2.nextInt();
        
        Pedido doce = new Pedido(opcao, sobremesas.get(opcao2).getPreco(), sobremesas.get(opcao2).getNomeProduto());
        pedidos.add(doce);
        
    }
    
    public void adicionarItem()
    {  
         //mostraProdutos();
         int opcao, opcao2;

                System.out.println("\n\n###           |  CATEGORIAS DE PRODUTOS A ADICIONAR###");
		System.out.println("\n                |  =========================");
                System.out.println("                  | 1 - Prato Principal             |");
		System.out.println("                  | 2 - Bebidas                     |");
		System.out.println("                  | 3 - Snacks                      |");
                System.out.println("                  | 4 - Sobremesas                  |");
		System.out.println("                  =========================\n");

                Scanner sc = new Scanner(System.in);
                opcao = sc.nextInt();

                if (opcao == 1)
                {
                    adicionarPratoPrincipal();
                }
                else if(opcao == 2)
                {
                    adicionarBebida();

                }
                else if(opcao ==3)
                {
                    adicionarSnack();
                }
                else if(opcao ==4)
                {
                    adicionarSobremesa();
                }
   
                showMenu();
        
                for(Pedido p: pedidos)
                {
                    System.out.println(p.toString());
                }
    }
    
    public void mostraMesas()
    {
        int opcao;
       
       //SE FOR A PRIMEIRA VEZ QUE INICIA O PROGRAMA, ELE CRIA AS MESAS
       if(mesas.size() == 0)
       {
        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
       }

       
        for(Mesa mesax: mesas)
        {
            System.out.println(mesax.toString());
           
        }
                System.out.println("\n");
                System.out.println("ALTERAR DISPONIBILIDADE DE QUE MESA? ");
                Scanner sc = new Scanner(System.in);
                opcao = sc.nextInt();
                
                if(opcao == 1)
                {
                    mesa1.alteraEstado();
                }
                else if (opcao ==2)
                {
                    mesa2.alteraEstado();
                }
                else if (opcao ==3)
                {
                    mesa3.alteraEstado();
                }
                else
                {
                    mesa4.alteraEstado();
                }
               showMenu();
    }
    
    
     public  void showMenu()
    {
        int opcao = 0;
	do {
            criaProdutos();
            clearScreen();
		System.out.println("\n\n###           |  GESTÃO DO RESTAURANTE ###");
		System.out.println("\n                |  =========================");
		System.out.println("                  | 1 - Produtos                    |");
                System.out.println("                  | 2 - Solicitação de mesa         |");
		System.out.println("                  | 3 - Adicionar Items a um pedido |");
		System.out.println("                  | 4 - Estado Pedido               |");
		System.out.println("                  | 5 - Fechar Pedido               |");
		System.out.println("                  | 0 - Sair                        |");
		System.out.println("                  =========================\n");

		Scanner sc = new Scanner(System.in);
                opcao = sc.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1:
                    clearScreen();
                    criaProdutos();
			break;
		case 2:
                    clearScreen();
                    mostraMesas();
			break;
                case 3:
                    clearScreen();
                    adicionarItem();
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
}
