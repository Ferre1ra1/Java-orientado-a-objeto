package ExemploDeComposicao;

import java.util.List;

public class MainPOO {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Gustavo", 2500);
        Funcionario f2 = new Funcionario("André", 1500);
        Funcionario f3 = new Funcionario("Anna", 4000);

        List<Funcionario> funcionario = List.of(f1, f2, f3);

        Departamento dp = new Departamento("RH", funcionario);
        Empresa empresa = new Empresa("Foundever", "23231231-11", dp);

        System.out.println("Nome da empresa: " + empresa.getName());
        System.out.println("CNPJ da empresa: " + empresa.getCnpj());
        System.out.println("Setor: " + empresa.getDepartamento().getName());
        System.out.println("Funcionários");
        for (Funcionario funcionarios : empresa.getDepartamento().getFuncionario()) {
            System.out.println(funcionarios.getName() + "- Salário " + funcionarios.getSalario() + "R$");
        }

    }
}
