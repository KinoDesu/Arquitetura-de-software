package modelo;

import strategy.EnumDepartamento;

public class Funcionario {
    private EnumDepartamento departamento;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(EnumDepartamento departamento, double salario) {
        this.departamento = departamento;
        this.salario = salario;
    }

    public EnumDepartamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(EnumDepartamento departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario {\n\tdepartamento = " + departamento + ",\n\tsalario = " + salario + ",\n\tsalário com bûnus = "+ departamento.calcularSalario(salario)+"\n}";
    }


}
