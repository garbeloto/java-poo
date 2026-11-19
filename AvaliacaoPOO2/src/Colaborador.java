public abstract class Colaborador {
    private String nome;
    private String cpf;
    private double salarioBase;
    private String dataAdmissao;
    private String categoria;
    private boolean ferias;
    private int anosCompletos;
    private double valerefeicao = 120.00;

    public Colaborador(String nome, String cpf, double salarioBase, String dataAdmissao, String categoria,
            boolean ferias, int anosCompletos) {
        setNome(nome);
        setCpf(cpf);
        setSalarioBase(salarioBase);
        setDataAdmissao(dataAdmissao);
        setCategoria(categoria);
        this.ferias = ferias;
        this.anosCompletos = anosCompletos;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("o nome é obrigatorio");
        } else {
            this.nome = nome;
        }
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            System.out.println("o cpf é obrigatorio");
        } else {
            this.cpf = cpf;
        }
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("o salario base não pode ter valor negativo");
        } else {
            this.salarioBase = salarioBase;
        }
    }

    public void setDataAdmissao(String dataAdmissao) {
        if (dataAdmissao == null || dataAdmissao.isEmpty()) {
            System.out.println("a data admissao é obrigatoria");
        } else {
            this.dataAdmissao = dataAdmissao;
        }
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.isEmpty()) {
            System.out.println("a categoria é obrigatoria");
        } else {
            this.categoria = categoria;
        }
    }

    public abstract double calcularAdicionalCargo();

    public abstract double getPercentualAdicionalCargo();

    public abstract String getDescricaoAdicionalCargo();

    public double calcularAdicionalComplementar() {
        return 0.0;
    }

    public double getPercentualAdicionalComplementar() {
        return 0.0;
    }

    public String getDescricaoAdicionalComplementar() {
        return "";
    }

    protected String getDescricaoSalarioBase() {
        return "Salário-base";
    }

    protected boolean recebeQuinquenio() {
        return true;
    }

    public double calcularPercentualQuinquenio() {
        if (!recebeQuinquenio()) {
            return 0.0;
        }

        int anos = anosCompletos;
        if (anos < 0) {
            anos = 0;
        }

        double percentual = (anos / 5) * 0.05;
        if (percentual > 0.15) {
            percentual = 0.15;
        }

        return percentual;
    }

    public double calcularQuinquenio() {
        return salarioBase * calcularPercentualQuinquenio();
    }

    public double calcularAdicionalFerias() {
        if (ferias) {
            return salarioBase / 3.0;
        } else {
            return 0.0;
        }
    }

    public double calcularSalarioBonus() {
        return salarioBase + calcularAdicionalCargo() + calcularAdicionalComplementar()
                + calcularQuinquenio() + calcularAdicionalFerias();
    }

    public double calcularRemuneracaoBruta() {
        return calcularSalarioBonus();
    }

    public final double calcularIRRF() {
        double baseCalculo = calcularRemuneracaoBruta();
        if (baseCalculo <= 2428.80) {
            return 0.0;
        } else if (baseCalculo <= 2826.65) {
            return baseCalculo * 0.075 - 182.16;
        } else if (baseCalculo <= 3751.05) {
            return baseCalculo * 0.15 - 394.16;
        } else if (baseCalculo <= 4664.68) {
            return baseCalculo * 0.225 - 675.49;
        }
        return baseCalculo * 0.275 - 908.73;
    }

    public double calcularDesconto() {
        return getValerefeicao() + calcularIRRF();
    }

    public double calcularRemuneracaoLiquida() {
        return calcularRemuneracaoBruta() - calcularDesconto();
    }

    public void exibirDemonstrativo(String competencia) {
        System.out.println("========== DEMONSTRATIVO DE PAGAMENTO ==========");
        System.out.println("competência: " + competencia);
        System.out.println("colaborador: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("categoria: " + categoria);
        System.out.println("admissão: " + dataAdmissao);
        System.out.println("---------------- PROVENTOS ----------------");
        System.out.println(getDescricaoSalarioBase() + ": R$ " + salarioBase);

        if (calcularAdicionalCargo() > 0) {
            System.out.println(getDescricaoAdicionalCargo() + " (" + (int) (getPercentualAdicionalCargo() * 100)
                    + "%): R$ " + calcularAdicionalCargo());
        }
        if (calcularAdicionalComplementar() > 0) {
            System.out.println(getDescricaoAdicionalComplementar() + " ("
                    + (int) (getPercentualAdicionalComplementar() * 100) + "%): R$ "
                    + calcularAdicionalComplementar());
        }
        if (calcularPercentualQuinquenio() > 0) {
            System.out.println("quinquênio (" + (int) (calcularPercentualQuinquenio() * 100) + "%): R$ "
                    + calcularQuinquenio());
        }
        if (calcularAdicionalFerias() > 0) {
            System.out.println("adicional de férias (1/3): R$ " + calcularAdicionalFerias());
        }

        System.out.println("Total de proventos: R$ " + calcularRemuneracaoBruta());
        System.out.println("---------------- DESCONTOS ----------------");
        if (calcularIRRF() > 0) {
            System.out.println("IRRF: R$ " + calcularIRRF());
        }
        System.out.println("vale refeição: R$ " + getValerefeicao());
        System.out.println("total de descontos: R$ " + calcularDesconto());
        System.out.println("REMUNERAÇÃO BRUTA: R$ " + calcularRemuneracaoBruta());
        System.out.println("REMUNERAÇÃO LÍQUIDA: R$ " + calcularRemuneracaoLiquida());
        System.out.println("================================================");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValerefeicao() {
        return valerefeicao;
    }

    public boolean getFerias() {
        return ferias;
    }

    public int getAnosCompletos() {
        return anosCompletos;
    }

    
}
