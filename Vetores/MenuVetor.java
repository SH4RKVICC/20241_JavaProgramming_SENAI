package Vetores;

import java.util.Scanner;

public class MenuVetor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Opção do menu (armazenadas em um vetor);
        String[] opcoes = {"Calcular Média.", "Exibir Maior Número.", "Sair."};

        // Criando Novo Vetor;
        int []num = new int[4];

        // Apresentação do Menu;
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((i + 1) + " - " + opcoes[i]);
        }

        // Seleção da Opção Pelo Usúario;
        System.out.print("Digite sua opção: ");
        int opcao = entrada.nextInt();

        // Execução da ação escolhida;
        switch (opcao) {
            case 1:
                try (Scanner ler = new Scanner(System.in)) {
                    for (int i = 0; i < num.length; i++) {
                        System.out.println("Digite o número desejado: ");
                        num[i] = ler.nextInt();
                    }
                }
                int soma = 0;
                for (int n : num) {
                    soma += n;
                }
                double media = (double) soma / num.length;
                System.out.println("Média: "+media);
                break;
            case 2:
                try (Scanner ler = new Scanner(System.in)) {
                    for (int i = 0; i < num.length; i++) {
                        System.out.println("Digite o número desejado: ");
                        num[i] = ler.nextInt();
                    }
                }

                if (i > i):
                    System.out.println("O maior número é "+i);

                // Código para calcular o maior número
                break;
            case 3:
                System.out.println("Saindo do menu... ");
                break;
            default:
                System.out.println("Opção Invalida!");
        }
    }
    
}
