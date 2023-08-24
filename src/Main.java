public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Amanda Hammes", "222.222.222-22", 1234);
        Pessoa pessoa2 = new Pessoa("Joaquim Ferreira", "123.456.789-00", 1233);

        Livro livro1 = new Livro("001", "Morro dos ventos uivantes", "Emily Bronte", 484);
        Livro livro2 = new Livro("002", "Orgulho e Preconceito", "Jane Austin", 456);

        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.fazerEmprestimo(pessoa1, livro1);
        emprestimo1.mostrarEmprestimo();
        System.out.println(emprestimo1.getDataEmprestimo());
        emprestimo1.devolverLivro(pessoa1, livro1);
        System.out.println(emprestimo1.isEmprestado());

     }
}