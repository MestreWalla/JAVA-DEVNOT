package POOIntroducao16052023;

public class App {
    public static void main(String[] args) {
        // Criar o objeto
        RegistraAluno aluno1 = new RegistraAluno(); // Objeto 01
        RegistraAluno aluno2 = new RegistraAluno(); // Objeto 02

        // Modificar o objeto (set)
        aluno1.setNome("Ana Clara Pereira");
        aluno1.setEndereco("Rua José Mario, 345");
        aluno1.setIdade(29);
        aluno1.setNotaCiencias(5);
        aluno1.setNotaMatematica(5);
        aluno1.setNotaPortugues(5);

        aluno2.setNome("Maycon Vitor Correa");
        aluno2.setEndereco("Rua Joao Ometto, 345");
        aluno2.setIdade(30);
        aluno2.setNotaCiencias(5);
        aluno2.setNotaMatematica(5);
        aluno2.setNotaPortugues(5);

        // Acessar os atributos (get)
        System.out.println("nome: " + aluno1.getNome());
        System.out.println("endereco: " + aluno1.getEndereco());
        System.out.println("idade: " + aluno1.getIdade());
        System.out.println("media: " + aluno1.getMedia());

        System.out.println("nome: " + aluno2.getNome());
        System.out.println("endereco: " + aluno2.getEndereco());
        System.out.println("idade: " + aluno2.getIdade());
        System.out.println("media: " + aluno2.getMedia());
    }
}
