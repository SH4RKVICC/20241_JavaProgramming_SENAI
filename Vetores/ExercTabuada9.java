package Vetores;

public class ExercTabuada9 {
    
    public static void main(String[] args) {
        int []tabuada = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int mult;

        for (int i = 0; i < tabuada.length; i++){
            mult = i * 9;
            System.out.println("9x"+i+": "+mult);
        }
    }
}
