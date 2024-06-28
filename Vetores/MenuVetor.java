package Vetores;

import java.util.Scanner;

public class MenuVetor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Opção do menu (armazenadas em um vetor);
        String[] opcoes = {"Calcular Média.", "Exibir Maior Número.", "Sair."};

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
                int soma = 0;
                for (int nota : notas) {
                    soma += nota;
                }
                double media = (double) soma / notas.length;
                System.out.println("Média: "+media);
                break;
            case 2:
                // Código para calcular a média (como no ex. 1);
                break;
            case 3:
                System.out.println("Saindo do menu... ");
                break;
            default:
                System.out.println("Opção Invalida!");
        }
    }
    
}
