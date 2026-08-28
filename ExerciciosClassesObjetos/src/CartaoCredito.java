public class CartaoCredito {
    String titular;
    double limite;
    double valorUtilizado;

    public void realizarCompra(double valor){
        valorUtilizado= valorUtilizado + valor;
    }

    public void pagarFatura(double valor){
        valorUtilizado
    }

    public double consultarLimiteDisponivel(){
        return ;
    }
}
