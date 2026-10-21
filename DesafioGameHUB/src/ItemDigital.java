public class ItemDigital {
    private String nome;
    private double valor;
    private int estoque;
    private boolean disponivel;
    private boolean exclusivo;
    private boolean jaComprado;
    private boolean isBloquado;


    public ItemDigital(String nome, double valor, int estoque, boolean disponivel, boolean exclusivo) {
        setNome(nome);
        setValor(valor);
        setEstoque(estoque);
        setDisponivel(disponivel);
        this.exclusivo = exclusivo;
        this.jaComprado= false;
    }




    public boolean iSDisponivelParaVenda(){
        if (disponivel == true && estoque > 0 ) {
            return true;
        } else {
            return false;
        }
    }


    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("O nome é obrigatório");
        } else {
            this.nome = nome;
        }
    }


    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            System.out.println("Valor deve ser maior que zero.");
        }
    }


    public void setEstoque(int estoque) {
        if (estoque < 0) {
            System.out.println("O estoque não pode ser negativo");
        } else if (estoque == 0) {
            System.out.println("O estoque não pode ser vendido");
        } else {
            this.estoque = estoque;
        }
    }


    public void setDisponivel(boolean disponivel) {
        if (estoque >= 0) {
            this.disponivel = disponivel;
        }
    }


    public void reduzirEstoque() {
        if (this.estoque > 0) {
            this.estoque--;
        }
    }


    public String getNome() {
        return nome;
    }


    public double getValor() {
        return valor;
    }


    public int getEstoque() {
        return estoque;
    }


    public boolean getDisponivel() {
        return disponivel;
    }


    public boolean getExclusivo() {
        return exclusivo;
    }


    public void setExclusivo(boolean exclusivo) {
        this.exclusivo = exclusivo;
    }




    public boolean getJaComprado() {
        return jaComprado;
    }




    public void setJaComprado(boolean jaComprado) {
        this.jaComprado = jaComprado;
    }


   


   
}

