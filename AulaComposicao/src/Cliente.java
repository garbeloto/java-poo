public class Cliente extends Pessoa{
    private int cnh;

    
    public Cliente(String nome, String cpf, String dt_nasc, int cnh) {
        super(nome, cpf, dt_nasc);
        this.cnh = cnh;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("N° cnh: " + cnh);
    }

}
