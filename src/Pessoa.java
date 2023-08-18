public class Pessoa {
    private int matricula;
    private String nome;
    private String cpf;
    private boolean devedor;
    private int livrosEmprestados;
    private float valorDevedor;

    public Pessoa(String nome, String cpf, int matricula) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.devedor = false;
        this.livrosEmprestados = 0;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean isDevedor() {
        return devedor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }

    public void setValorDevedor(float valorDevedor) {
        this.valorDevedor = valorDevedor;
    }

    public float getValorDevedor() {
        return valorDevedor;
    }
}
