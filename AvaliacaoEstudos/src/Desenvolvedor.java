public class Desenvolvedor extends Funcionario{
    private int horasExtras;
    private double valorHoraExtra;
    
    public Desenvolvedor(String nome, String cpf, double salarioBase, int horasExtras, double valorHoraExtra) {
        super(nome, cpf, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalarioLiquido() {
        double totalExtras = horasExtras * valorHoraExtra;
        double bruto = getSalarioBase() + totalExtras;
        return bruto * 0.92;
    }

    
}
