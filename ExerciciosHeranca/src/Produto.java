public class Produto {
    private String codigo;
    private String nome;
    private double preco;

    public Produto(String codigo, String nome, double preco) {
        setCodigo(codigo);
        setNome(nome);
        setPreco(preco);
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("O nome não pode ser vazio.");
        } else {
            this.nome = nome;
        }
    }

    public void setCodigo(String codigo) {
        if (codigo == null ||  codigo.isBlank()) {
            System.out.println("O código não pode ser vazio.");
        } else {
            this.codigo = codigo;
        }
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido.");
        } else {
            this.preco = preco;
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("preco: " + preco);
        
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
