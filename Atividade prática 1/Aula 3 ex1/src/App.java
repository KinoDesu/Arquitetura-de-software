import modelo.Funcionario;
import strategy.EnumDepartamento;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario(EnumDepartamento.DESENVOLVIMENTO, 2500);
        Funcionario f2 = new Funcionario(EnumDepartamento.GERENCIA, 3000);
        Funcionario f3 = new Funcionario(EnumDepartamento.SUPORTE, 5350);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
