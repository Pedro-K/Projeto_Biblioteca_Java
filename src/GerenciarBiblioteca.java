import Model.ControleEmprestimo;
import Model.Livro;
import Model.Extends.Aluno;
import Model.Extends.Funcionario;
import Model.Extends.Professor;

public class GerenciarBiblioteca {
    public static void main(String[] args) throws Exception {

       
     
          Aluno aluno = new Aluno();
        aluno.setIdUsuario(1);
        aluno.setNome("Thomas Toledo");
        aluno.setEmail("thomas.toledo@email.com");
        aluno.setMatricula("00012024");
        aluno.setCurso("Analise e desenvolvimento de sistemas");

        Professor professor = new Professor();
        professor.setIdUsuario(2);
        professor.setNome("Jose Silva");
        professor.setEmail("Jose.silva@email.com");
        professor.setDepartamento("Matemática");
        professor.setTitulacao("Doutor");

        Funcionario funcionario = new Funcionario();
        funcionario.setIdUsuario(3);
        funcionario.setNome("Vitor Pereira");
        funcionario.setEmail("vitor.pereira@email.com");
        funcionario.setCargo("Bibliotecário");
        funcionario.setSetor("Empréstimos");

        // Instanciando livros
        Livro livro1 = new Livro();
        livro1.setIdLivro(1);
        livro1.setTitulo("Java: Como Programar");
        livro1.setAutor("Deitel");
        livro1.setDisponivel(true);

        Livro livro2 = new Livro();
        livro2.setIdLivro(2);
        livro2.setTitulo("Introdução ao Algoritmo");
        livro2.setAutor("Cormen");
        livro2.setDisponivel(true);

        Livro livro3 = new Livro();
        livro3.setIdLivro(3);
        livro3.setTitulo("Padrões de Projetos");
        livro3.setAutor("Gamma");
        livro3.setDisponivel(true);

        // Controlador de empréstimos
        ControleEmprestimo controleEmprestimo = new ControleEmprestimo();

      // Registrando empréstimos e imprimindo o retorno
      System.out.println(controleEmprestimo.registraEmprestimo(aluno, livro1));
      System.out.println(controleEmprestimo.registraEmprestimo(professor, livro2));
      System.out.println(controleEmprestimo.registraEmprestimo(funcionario, livro3));

      // Registrando devoluções e imprimindo o retorno
      System.out.println(controleEmprestimo.registraDevolucao(aluno, livro1));
      System.out.println(controleEmprestimo.registraDevolucao(professor, livro2));
      System.out.println(controleEmprestimo.registraDevolucao(funcionario, livro3));        
    }
    
}
