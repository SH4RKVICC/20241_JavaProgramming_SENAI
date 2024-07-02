package Matrizes;

public class NotasAlunos {

    public static void main(String[] args) {
        // Criando matriz de notas;
        int [][] notas = new int [3][2]; // 3 linhas (alunos) e 2 colunas (disciplinas)
        
        // Inicializando as notas;
        notas [0][0] = 80; // Aluno 1, Matemática
        notas [0][1] = 90; // Aluno 1, Português
        notas [1][0] = 75; // Aluno 2, Matemática
        notas [1][1] = 85; // Aluno 2, Português
        notas [2][0] = 95; // Aluno 3, Matemática
        notas [2][1] = 100; // Aluno 3, Português

        // Mostrando Notas;
        for (int i = 0; i < notas.length; i ++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(notas[i][j] + "");
            }
            System.out.println();
        }
    }
    
}
