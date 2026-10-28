public class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email) {
        setNome(nome);
        this.cpf = cpf;
        setEmail(email);
    }

    public void setEmail(String email) {
        if (email== null || email.isBlank()) {
            System.out.println("O e-mail não pode ser vazio.");
        } else {
            this.email = email;
        }
    }

    public void setNome(String nome) {
        if (nome==null || nome.isBlank()) {
            System.out.println("O nome não pode ser vazio.");
        } else {
            this.nome = nome;
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}
