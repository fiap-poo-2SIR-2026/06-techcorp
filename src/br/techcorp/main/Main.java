package br.techcorp.main;

import br.techcorp.departamento.Departamento;
import br.techcorp.funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("f01", "Roberto", "Gerente", 35000);
        Funcionario f2 = new Funcionario("f02", "Ana", "Diretora", 95000);
        Funcionario f3 = new Funcionario("f03", "Enzo", "Estagiário", 2000);

        Departamento departamento = new Departamento("TI01", "TI", 20);
        departamento.adicionarFuncionario(f1);
        departamento.adicionarFuncionario(f2);
        departamento.adicionarFuncionario(f3);

        System.out.println(departamento.buscarFuncionario("f02"));
    }
}
