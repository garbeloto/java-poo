import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // 1. Instanciação da lista dinâmica genérica
        ArrayList<Colaborador> colaborador = new ArrayList<>();

        // 2. Instanciação dos objetos com os tipos corretos (Matrícula como String)
        ColaboradorCLT colaboradorCLT = new ColaboradorCLT("Rafa", 003, 3000.0, "Gerente", 1000.0);
        ColaboradorHorista colaboradorHorista1 = new ColaboradorHorista("João", 1234, 2000.0, 180, 40.0); // 20h extras
        ColaboradorHorista colaboradorHorista2 = new ColaboradorHorista("Maria", 1235, 2000.0, 140, 30.0); // Sem extras
        ConsultorTerceiro consultorTerceiro = new ConsultorTerceiro("Pedro", 023, 4000.0, 20.0); // Taxa válida <= 30%

        colaborador.add(colaboradorCLT);
        colaborador.add(colaboradorHorista1);
        colaborador.add(colaboradorHorista2);
        colaborador.add(consultorTerceiro);

        // 3. Emissão dos holerites usando o método final de auditoria
        System.out.println("====== HOLERITE DE CADA COLABORADOR ======");
        for (Colaborador c : colaborador) {
            c.emitirHolerite(); // Chama o método final da superclasse
            System.out.println();
        }

        // 4. Acumulação dos totais e filtragem dos destaques (> R$ 500,00)
        double totalBruto = 0;
        double totalLiquido = 0;

        System.out.println("====== COLABORADORES COM ADICIONAL > R$ 500,00 ======");
        for (Colaborador c : colaborador) {
            double bruto = c.proventoBruto();
            totalBruto += bruto;

            // Desconto de INSS (11%)
            double inss = bruto * 0.11;

            // =========================================================
            //  CÁLCULO DO IRPF REESCRITO COM IF-ELSE (substituindo o ternário)
            // =========================================================
            double irpf;
            if (bruto > 4000.0) {
                irpf = bruto * 0.15;   // 15% para salários maiores que 4000
            } else {
                irpf = bruto * 0.075;  // 7,5% para o restante
            }

            double liquido = bruto - inss - irpf;
            
            // Acumula o valor líquido real de cada colaborador
            totalLiquido += liquido;

            // Verificação de tipos com instanceof para filtrar adicionais > 500
            if (c instanceof ColaboradorCLT) {
                ColaboradorCLT clt = (ColaboradorCLT) c;
                if (clt.getBonusCargo() > 500.0) {
                    System.out.println("- " + clt.getNome() + " (CLT) - Bônus de Cargo: R$ " + clt.getBonusCargo());
                }
            } else if (c instanceof ColaboradorHorista) {
                ColaboradorHorista hor = (ColaboradorHorista) c;
                if (hor.getHorasTrabalhadas() > 160) {
                    double valorExtras = (hor.getHorasTrabalhadas() - 160) * (hor.getValorHora() * 1.5);
                    if (valorExtras > 500.0) {
                        System.out.println("- " + hor.getNome() + " (Horista) - Valor das Horas Extras: R$ " + String.format("%.2f", valorExtras));
                    }
                }
            }
        }

        // 5. Impressão dos totais acumulados da folha
        System.out.println("\n====== RESUMO CONSOLIDADO DA FOLHACORP ======");
        System.out.println("Total Custo Bruto: R$ " + String.format("%.2f", totalBruto));
        System.out.println("Total Desembolso Líquido: R$ " + String.format("%.2f", totalLiquido));
        System.out.println("=============================================");

    //exercicio 1
    /* ArrayList<Funcionario> folhaPagamento = new ArrayList<>();

    folhaPagamento.add(new Gerente("michaela", "1111111111", 7000, 1000));
    folhaPagamento.add(new Desenvolvedor("elise", "333333333333", 6000, 2, 200.00));
    folhaPagamento.add(new Desenvolvedor("anya", "99999999999", 5500, 5, 150.00));
    folhaPagamento.add(new Estagiario("francesca", "22222222222", 2500, 400));

    for (Funcionario folhaPagamentos : folhaPagamento) {
        folhaPagamentos.exibirHolerite();
    }

    double custoTotal = 0;
    for (Funcionario f : folhaPagamento) { //custo total folha de pagamento
        custoTotal += f.calcularSalarioLiquido();

        if (f.calcularSalarioLiquido() > 4000) {
            System.out.println("Funcionario com salario liquido maior que 4000: " + f.getNome());
        }
    }

    System.out.println("Custo total folha de pagamentos: " + custoTotal); */

    }

    
}
