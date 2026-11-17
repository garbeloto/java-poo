public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private String dataRetirada;
    private String dataDevolucao;
    private double valor;

    public Locacao(Cliente cliente, Veiculo veiculo, String dataRetirada, String dataDevolucao, double valor) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.valor = valor;
    }

    public void exibirDados(){
        System.out.println("=======LOCAÇÃO=======");
        System.out.println("=======DADOS DO CLIENTE=======");
        cliente.exibirDados();
        System.out.println("=======DADOS VEICULO=======");
        veiculo.exibirDados();
        System.out.println("=======LOCAÇÃO=======");
        System.out.println("Data retirada: " + dataRetirada);
        System.out.println("Data devolução: " + dataDevolucao);
         System.out.println("Valor: " + valor);
    }
    
}
