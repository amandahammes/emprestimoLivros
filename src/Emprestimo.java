import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private String pessoa;
    private String livro;
    private boolean emprestado;

    public Emprestimo() {
        this.emprestado = false;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = LocalDate.parse(dataEmprestimo);
    }

    public String getPessoa() {
        return pessoa;
    }

    public String getLivro() {
        return livro;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void fazerEmprestimo (Pessoa pessoa, Livro livro){
        if (pessoa.getLivrosEmprestados() <=2 && pessoa.isDevedor() == false && pessoa.isDevedor() == false){
            livro.setEmprestado(true);
            pessoa.setLivrosEmprestados(pessoa.getLivrosEmprestados()+1);
            LocalDate dataEmprestimo = LocalDate.now();
            this.dataEmprestimo = dataEmprestimo;
            this.pessoa = pessoa.getNome();
            this.livro = livro.getTitulo();
        } else {
            System.out.println("Não é possível realizar o empréstimo.");
        }
    }

    public void devolverLivro (Pessoa pessoa, Livro livro){
        if (livro.getEmprestado() == true){
            livro.setEmprestado(false);
            pessoa.setLivrosEmprestados((pessoa.getLivrosEmprestados())-1);
            pessoa.setDevedor(false);
        } else {
            System.out.println("Livro já está no nosso acervo.");
        }
    }

    public void mostrarEmprestimo(){
        System.out.printf("O livro %s foi emprestado por %s", getLivro(), getPessoa());
        System.out.println(" na data: " + dataEmprestimo);
    }

}
