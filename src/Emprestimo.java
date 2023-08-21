public class Emprestimo {
    private int codigo;
    private String dataEmprestimo;
    private Pessoa pessoa;
    private Livro livro;

    public Emprestimo(String dataEmprestimo, Pessoa pessoa, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.pessoa = pessoa;
        this.livro = livro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void fazerEmprestimo (Pessoa pessoa, Livro livro){
        if (pessoa.getLivrosEmprestados() <=2 && pessoa.isDevedor() == false && pessoa.isDevedor() == false){
            livro.setEmprestado(true);
            pessoa.setLivrosEmprestados(pessoa.getLivrosEmprestados()+1);
        } else {
            System.out.println("Você já emprestou o máximo de livros possíveis por vez. Devolva algum para fazer novo empréstimo.");
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

}
