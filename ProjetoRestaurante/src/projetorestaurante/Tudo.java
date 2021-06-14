package projetorestaurante;
import java.util.ArrayList;
import java.util.Scanner;


public class Tudo {
    
    //ARRAYLISTS PARA TODOS OS TIPOS DE PRODUTOS E MESAS EXISTENTES NO RESTAURANTE
        ArrayList<Mesa> mesas = new ArrayList<Mesa>();
        ArrayList<Prato> pratos = new ArrayList<Prato>();
        ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
        ArrayList<Snack> snacks = new ArrayList<Snack>();
        ArrayList<Doce> sobremesas = new ArrayList<Doce>();
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        
        
        //MESAS CRIADAS E INICIADAS TODAS COMO DISPONIVEIS PARA SEREM OCUPADAS
        Mesa mesa1 = new Mesa(1, false);
        Mesa mesa2 = new Mesa(2, true);
        Mesa mesa3 = new Mesa(3, true);
        Mesa mesa4 = new Mesa(4, true);
        
   
    //FUNÇÃO CLS QUE LIMPA O ECRÃ
    public  void clearScreen()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    //FUNÇÃO DE ERRO QUANDO ALGUEM INSERE UM PRODUTO INVALIDO
    public void erroProduto()
    {
         System.out.println("PRODUTO INVALIDO");
         showMenu();
    }
    
    //FUNÇÃO ERRO DE QUANDO ALGUEM INSERE UMA MESA NAO DISPONIVEL PARA FAZER PEDIDO 
    //OU UMA MESA NÃO EXISTENTE NO RESTAURANTE
    public void erroMesa()
    {
         System.out.println("MESA NAO DISPONIVEL OU NÃO EXISTENTE");
         showMenu();
    }
    
    //FUNÇÃO QUE CRIA OS PRODUTOS DEFAULT NO INICIO DO PROGRAMA
    public void criaProdutos()
    {
        //CASO O PROGRAMA JA ESTEJA EM RUN JA NAO SERÃO EXECUTADOS ESTES CODIGOS PORQUE 
        //O ARRAYLIST JA SE ENCONTRA PREENCHIDO
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
            Snack pao = new Snack("Pão", 6, false);
            snacks.add(pao);
            Snack manteiga = new Snack("Manteiga", 1, false);
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
    
    //FUNÇÃO RESPONSAVEL PELA MOSTRAGEM DOS PRODUTOS NO SISTEMA
    public void mostraProdutos()
    {
         
        System.out.println("PRATOS PRINCIPAIS\n");
        
        for(Prato p: pratos)
        {
            System.out.println(p.toString());
        }
        
       
        System.out.println("BEBIDAS:\n");
        for(Bebida b: bebidas)
        {
            System.out.println(b.toString());
        }
        
        System.out.println("SNACKS:\n");
        for(Snack s: snacks)
        {
            System.out.println(s.toString());
        }
        
        System.out.println("SOBREMESAS:\n");
        for(Doce d: sobremesas)
        {
            System.out.println(d.toString());
        }
    }
    
    //FUNÇÃO QUE ADICIONAR PRATOS PRINCIPAIS AO PEDIDO DA MESA
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

        //VERIFICA SE A MESA ESTA OCUPADA, SE ESTIVER ADICIONA O PEDIDO A MESA
        if(mesas.get(opcao-1).isDisponibilidade() == false)
        {
            System.out.println("Produto a Adicionar: ");
            Scanner sc2 = new Scanner(System.in);
            opcao2 = sc2.nextInt();
            
            if(opcao2>=0 || opcao2< pratos.size())
            {
             Pedido prato = new Pedido(opcao, pratos.get(opcao2).getPreco(), pratos.get(opcao2).getNomeProduto());
             pedidos.add(prato);   
            }
            else
            {
                erroProduto();  
            }
        }
        else 
        {
            erroMesa();
        }
        
    }
    
    //FUNÇÃO QUE ADICIONAR BEBIDAS AO PEDIDO DA MESA
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
        
         if(mesas.get(opcao-1).isDisponibilidade() == false)
        {
            System.out.println("Produto a Adicionar: ");
            Scanner sc2 = new Scanner(System.in);
            opcao2 = sc2.nextInt();
            
            //SE A 'OPCAO2' FOR MENOR QUE 0 OU MAIOR QUE O TAMANHO DO 'ARRAYLIST PEDIDOS O USER É REDIRECIONADO PARA O 
            //MENU INICIAL E É MOSTRADA UMA MENSAGEM DE ERRO
            if(opcao2>=0 || opcao2<= bebidas.size())
            {
            Pedido bebida = new Pedido(opcao, bebidas.get(opcao2).getPreco(), bebidas.get(opcao2).getNomeProduto());
            pedidos.add(bebida);
            }
            else
            {
                erroProduto();
            }
        }
          else 
         {
             erroMesa();
         }
        
    }
    
    //FUNÇÃO QUE ADICIONA SNACKS AO PEDIDO DA MESA
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
         if(mesas.get(opcao-1).isDisponibilidade() == false)
        {
             System.out.println("Produto a Adicionar: ");
             Scanner sc2 = new Scanner(System.in);
             opcao2 = sc2.nextInt();
        
             //SE A 'OPCAO2' FOR MENOR QUE 0 OU MAIOR QUE O TAMANHO DO 'ARRAYLIST PEDIDOS O USER É REDIRECIONADO PARA O 
            //MENU INICIAL E É MOSTRADA UMA MENSAGEM DE ERRO
            if(opcao2>=0 || opcao2<= snacks.size())
            {
            Pedido snack = new Pedido(opcao, snacks.get(opcao2).getPreco(), snacks.get(opcao2).getNomeProduto());
            pedidos.add(snack);
            }
            else
            {
                erroProduto();
            }
        }
         else 
         {
             erroMesa();
         }
    }
    
    //FUNÇÃO QUE ADICIONA SOBREMESAS AO PEDIDO DA MESA
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
        
        //VERIFICA SE A MESA ESTÁ OCUPADA, SE ESTIVER FAZ O PEDIDO PARA A MESA EM QUESTÃO. SE NAO MOSTRA MENSAGEM DE ERROE VOLTA
        //AO MENU PRINCIPAL
        
        if(mesas.get(opcao-1).isDisponibilidade() == false)
        {
         System.out.println("Produto a Adicionar: ");
         Scanner sc2 = new Scanner(System.in);
         opcao2 = sc2.nextInt();
        
         //SE A 'OPCAO2' FOR MENOR QUE 0 OU MAIOR QUE O TAMANHO DO 'ARRAYLIST PEDIDOS O USER É REDIRECIONADO PARA O 
            //MENU INICIAL E É MOSTRADA UMA MENSAGEM DE ERRO
             if(opcao2>=0 || opcao2<=sobremesas.size())
             {
                Pedido doce = new Pedido(opcao, sobremesas.get(opcao2).getPreco(), sobremesas.get(opcao2).getNomeProduto());
                pedidos.add(doce);
             }
             else
             {
                 erroProduto();
             }
        }
        else
        {
             System.out.println("MESA NAO ABERTA");
             showMenu();
        }
    }
    
    //FUNÇÃO ONDE O USER ESCOLHE QUE TIPO DE PRODUTO VAI ADICIONAR AO PEDIDO
    public void adicionarItem()
    {  
         //mostraProdutos();
         int opcao;

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
    
    public void criaMesas()
    {
      //SE FOR A PRIMEIRA VEZ QUE INICIA O PROGRAMA, ELE CRIA AS MESAS
       if(mesas.size() == 0)
       {
        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
       }
    }
    
    //FUNÇÃO QUE MOSTRA AS MESAS DISPONIVEIS E A SUA DISPONIBILIDADE ATUAK
    //É POSSIVEL TAMBEM AQUI ALTERAR A DISPONIBILIDADE DA MESA
    public void mostraMesas()
    {
        int opcao;       
        for(Mesa mesax: mesas)
        {
            System.out.println(mesax.toString());
           
        }
            System.out.println("\n");
            System.out.println("ALTERAR DISPONIBILIDADE DE QUE MESA? ");
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();


            if(opcao < mesas.size())
            {
                mesas.get(opcao-1).alteraEstado();
            }
            else
            {
                System.out.println("Opcao invalida");
                mostraMesas();
            }
           showMenu();
    }
    
    public void estadoPedido()
    {
        if(pedidos.size() ==0)
        {
            int opcao;
            do{
            System.out.println("SEM PEDIDOS A APRESNTAR: CLICAR 0 PARA SAIR");
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();
            
            }
            while(opcao != 0);
            showMenu();
        }
        else 
        {
            for(Pedido p: pedidos)
            {
                System.out.println(p.toString());
            }
                int opcao2;
                
          
               System.out.println("INSERIR NUMERO DO PEDIDO PARA ALTERAR ESTADO OU CLICAR '0' PARA VOLTAR");
               Scanner sc = new Scanner(System.in);
               opcao2 = sc.nextInt();
               
               if(opcao2 !=0 || opcao2 <= pedidos.size())
               {
                   pedidos.get(opcao2-1).alterarEstado();
                   showMenu();
               }
               else
               {
                System.out.println("OPÇÃO INVALIDA!!");
                showMenu();
               }
        }
    }
    
    public void fecharPedido()
    {
        for(Pedido p: pedidos)
        {
            if(p.getEstadoPedido() == 2)
            {
                System.out.println(p.toString());
            }
        }
        
        int opcao;
        System.out.println("QUAL PEDIDO DESEJA FECHAR?");
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();
        
        if(pedidos.get(opcao-1).getEstadoPedido() == 2)
        {
            pedidos.get(opcao-1).alterarEstado();
            showMenu();
        }
        else
        {
             System.out.println("OPCAO INVALIDA");
             showMenu();
        }
    }
    
    public void historicoPedidos()
    {
        
         for(Pedido p: pedidos)
        {
            if(p.getEstadoPedido() ==3)
            {
              System.out.println(pedidos.toString());   
            }
        }
    }
    
    //FUNÇÃO ONDE ESTÁ CONCENTRADO O MEU PRINICIPAL EM LOOP. PARA FECHAR O PROGRAMA TEM SE QUE ESTAR NO MEU PRINCIPAL E PREMIR A TECLA 0
    //CASO O UTILIZADOR CLIQUE EM UMA OPÇÃO INVÁLIDA SERÁ MOSTRADA UMA MENSAGEM DE ERRO  
    public  void showMenu()
    {
        int opcao = 0;
	do {
            criaProdutos();
            criaMesas();
            clearScreen();
		System.out.println("\n\n###           |### GESTÃO DO RESTAURANTE ###");
		System.out.println("\n                |************************************");
		System.out.println("                  | 1 - Produtos                        |");
                System.out.println("                  | 2 - Solicitação de mesa             |");
		System.out.println("                  | 3 - Novo Pedido                     |");
		System.out.println("                  | 4 - Estado Pedido                   |");
		System.out.println("                  | 5 - Fechar Pedido                   |");
                System.out.println("                  | 6 - Histórico de pedidos fechados   |");
		System.out.println("                  | 0 - Sair                            |");
		System.out.println("                  **************************************\n");

		Scanner sc = new Scanner(System.in);
                opcao = sc.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1:
                    clearScreen();
                    mostraProdutos();
			break;
		case 2:
                    clearScreen();
                    mostraMesas();
			break;
                case 3:
                    clearScreen();
                    adicionarItem();
                case 4:
                    clearScreen();
                    estadoPedido();
		case 5:
                    clearScreen();
                    fecharPedido();
			break;
                case 6:
                    clearScreen();
                    historicoPedidos();
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
