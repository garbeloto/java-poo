public final class ConsultorTerceiro extends Colaborador {
    private double taxaServicoPj;

    public ConsultorTerceiro(String nome, int matricula, double salarioContrato, double taxaServicoPj) {
        super(nome, matricula, salarioContrato);
        this.taxaServicoPj = taxaServicoPj;
    }

    @Override
    public double proventoBruto() {
        return getSalarioContrato() + (getSalarioContrato() * (taxaServicoPj / 100));
    }

    public void setTaxaServicoPj(double taxaServicoPj) {
        if (taxaServicoPj < 0 && taxaServicoPj > 30) {
            System.out.println("taxa invalida");
        } else {
            this.taxaServicoPj = taxaServicoPj;
        }
    }

    public double getTaxaServicoPj() {
        return taxaServicoPj;
    }

    

    
}
