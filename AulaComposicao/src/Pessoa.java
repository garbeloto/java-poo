public class Pessoa {
    private String nome;
    private String cpf;
    private String dt_nasc;
    
    public Pessoa(String nome, String cpf, String dt_nasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dt_nasc = dt_nasc;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDt_nasc() {
        return dt_nasc;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nascimento: " + dt_nasc);

    }
}
