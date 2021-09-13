package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class aquecimentoEx01M2 {
    //1. Crie um programa para gerenciar uma lista de produtos
// de um estabelecimento, cada produto tem um nome e um preço.
// No final do programa, o usuário deve decidir se irá adicionar
// mais de um produto, exibir todos os produtos cadastrados ou
// excluir um produto pelo nome.
    public static void main(String[] args) {
        //Scanner, hashMap
        Scanner leitor = new Scanner(System.in);
        Map<String, Double> productos = new HashMap<String, Double>();
        //variaveis

        int menuPrincipal = 0;


        while (menuPrincipal != 4) {
            //menu
            System.out.println("***** Mercado Real *****");
            System.out.println("** Cadastro de Productos **");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Exivir");
            System.out.println("[3] Excluir");
            System.out.println("[4] Salir");

            System.out.println("Marque uma opcão: ");
            menuPrincipal = leitor.nextInt();
            leitor.nextLine();
            switch (menuPrincipal) {
                case 1:
                    //Entrada de dados
                    System.out.println("[1] Cadastro de produtos");
//                    System.out.println("Quantos produtos desea cadastrar");
//                    int cadastro = leitor.nextInt();
//                    leitor.nextLine();
                    System.out.println("Indique o nome do produto");
                    String nomeProduto = leitor.nextLine();
                    System.out.println("Indique o valor do produto");
                    Double precoProducto = leitor.nextDouble();

                    //Cadastro
                    productos.put(nomeProduto, precoProducto);
                    System.out.println("cadastrado com suceso");
                    break;
                case 2:
                    if (productos.isEmpty()) {
                        System.out.println("Não tem elementos cadastrados");
                    } else {
                        for (String referencia : productos.keySet()) {
                            System.out.println(referencia + "\t" + productos.get(referencia));
                        }
                    }
                    break;
                case 3:

                    if (productos.isEmpty()) {
                        System.out.println("Não tem produtos cadastrados");

                    } else {
                        System.out.println("Digite o produto a excluir: ");
                        String excluir = leitor.nextLine();
                        if (productos.containsKey(excluir)) {
                            productos.remove(excluir);
                            System.out.println(excluir+" Foi excluido com sucesso");
                        }else{
                        System.out.println("************  Digite um nome valido  ************");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Volte Sempre");
                    menuPrincipal = 4;
                    break;

                default:
                    System.out.println("Digite uma opção valida");
            }

        }


    }
}
