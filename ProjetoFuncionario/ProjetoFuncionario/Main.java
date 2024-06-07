package ProjetoFuncionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionarioCLT = new CLT("Mariana", 3000);
        Double salLiquidoCLT = funcionarioCLT.calcularSalLiquido();
        System.out.println("Salário Líquido CLT: R$"+salLiquidoCLT);

        Funcionario funcionarioPJ = new PJ("Pietro", 5000.0);
        Double salLiquidoPJ = funcionarioPJ.calcularSalLiquido();
        System.out.println("Salário Líquido PJ: R$"+salLiquidoPJ);
    }
    
}
