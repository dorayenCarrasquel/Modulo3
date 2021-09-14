package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//2. Crie um programa para gerenciar uma lista de candidatos de um
// vestibular, cada candidato tem número de matrícula e uma nota.
// No final do programa, o usuário deve decidir se irá adicionar
// mais de um candidato, exibir todos os candidatos cadastrados ou
// excluir um candidato pelo número de matrícula.
public class aquecimentoEx02M2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<Integer, Double> candidatos = new HashMap<Integer,Double>();
        boolean chave = true;
        do {
            System.out.println("********** VESTIBULAR ********** ");
            System.out.println("[1] Adicionar Candidato");
            System.out.println("[2] Exibir Lista de Candidatos");
            System.out.println("[3] Excluir Candidato");
            System.out.println("[4] Saida");
            System.out.println("Marque uma opção: ");
            int opcao = leitor.nextInt();

            if ()
            System.out.println("********** Candidatos Vestibular  **********" );
            System.out.println("Digite Código da Matrícula");
            int codigoMatricula = leitor.nextInt();
            System.out.println("Digite a nota alcanzada no Vestibular do candidato "+codigoMatricula);
            double notaVestivular = leitor.nextDouble();
            //Registrar
            candidatos.put(codigoMatricula,notaVestivular);

            while (chave == true);
        }

    }
}
