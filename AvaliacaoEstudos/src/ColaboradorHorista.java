public class ColaboradorHorista extends Colaborador{
    private int horasTrabalhadas;
    private double valorHora;
    
    public ColaboradorHorista(String nome, int matricula, double salarioContrato, int horasTrabalhadas,
            double valorHora) {
        super(nome, matricula, salarioContrato);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas < 0) {
            System.out.println("a quantidade de horas trabalhadas não pode ser menor que 0");
        } else {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public void setValorHora(double valorHora) {
        if (valorHora <= 0) {
            System.out.println("o valor de horas deve ser maior que zero");
        } else {
            this.valorHora = valorHora;
        }
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double proventoBruto() {
        double bruto = horasTrabalhadas * valorHora;
        if (horasTrabalhadas > 160) {
            return bruto = bruto * 1.5;
        } else {
            return bruto;
        }
    }

    
}
