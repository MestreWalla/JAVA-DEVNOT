package POOHeranca16052023;

import POOHeranca16052023.Pessoas.Alunos;
import POOHeranca16052023.Pessoas.Funcionarios;
import POOHeranca16052023.Pessoas.Professores;

public class App {
    public static void main(String[] args) {
        Alunos aluno01 = new Alunos();
        Funcionarios func01 = new Funcionarios();
        Professores prof01 = new Professores();

        // Atributos (set)
        aluno01.setNome("Maycon Vitor Correa");
        aluno01.setnCPF("123.123.123.12");
        aluno01.setIdade(30);
        aluno01.setEndereco("Rua José Bonifacio, 123");
        aluno01.setCurso("Tecnico em Desenvolvimento de Sistemas");
        aluno01.setnMatricula(12341234);
        aluno01.setTurma("A01");

        func01.setNome("José Antonio dos Bigodes");
        func01.setnCPF("123.123.123.12");
        func01.setIdade(76);
        func01.setEndereco("Rua Grande Estrada, 123");
        func01.setCtps("12345678SÉRIE 12345UF");
        func01.setPeriodo("Manhã");
        func01.setCargo("Zelador");

        prof01.setNome("Maria Antonia dos Cachos");
        prof01.setnCPF("123.123.123.12");
        prof01.setIdade(79);
        prof01.setEndereco("Rua Antiga Viela, 123");
        prof01.setMateria("Costura");
        prof01.setContrato("123123123");
        prof01.setCtps("12345678SÉRIE 12345UF");
        prof01.setPeriodo("Noite");
        prof01.setCargo("Professor(a)");
        prof01.setNinf(1231231230);
        
        // Acessar os atributos (get)
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("CPF: " + aluno01.getnCPF());
        System.out.println("Idade: " + aluno01.getEndereco());
        System.out.println("Endereço: " + aluno01.getIdade());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Matricula: " + aluno01.getnMatricula());
        System.out.println("Turma: " + aluno01.getTurma());
        System.out.println();
        System.out.println("Nome: " + func01.getNome());
        System.out.println("CPF: " + func01.getnCPF());
        System.out.println("Idade: " + func01.getIdade());
        System.out.println("Endereço: " + func01.getEndereco());
        System.out.println("CTPS: " + func01.getCtps());
        System.out.println("Periodo: " + func01.getPeriodo());
        System.out.println("Cargo: " + func01.getCargo());
        System.out.println();
        System.out.println("Nome: " + prof01.getNome());
        System.out.println("CPF: " + prof01.getnCPF());
        System.out.println("Idade: " + prof01.getIdade());
        System.out.println("Endereço: " + prof01.getEndereco());
        System.out.println("Materia: " + prof01.getMateria());
        System.out.println("Contrato: " + prof01.getContrato());
        System.out.println("CTPS: " + prof01.getCtps());
        System.out.println("Periodo: " + prof01.getPeriodo());
        System.out.println("Cargo: " + prof01.getCargo());
        System.out.println("Ninf: " + prof01.getNinf());
    }
}
