package strategy;

public enum EnumDepartamento implements ISalario {
    GERENCIA{

        @Override
        public double calcularSalario(double salarioBase) {
            double salario = salarioBase*0.06 + salarioBase;
            return salario;
        }
    },
    DESENVOLVIMENTO{
        @Override
        public double calcularSalario(double salarioBase) {
            double salario = salarioBase*0.05+ salarioBase;
            return salario;
        }
    },
    SUPORTE{
        @Override
        public double calcularSalario(double salarioBase) {
            double salario = salarioBase*0.04+ salarioBase;
            return salario;
        }
    },
    DEMAIS{
        @Override
        public double calcularSalario(double salarioBase) {
            double salario = salarioBase*0.03+ salarioBase;
            return salario;
        }
    }
}
