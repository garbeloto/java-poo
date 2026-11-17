public class Funcionario2 extends Pessoa{
    private String cargo;
    
    public Funcionario2(String nome, String cpf, String dt_nasc) {
        super(nome, cpf, dt_nasc);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
    }

    
    
}
