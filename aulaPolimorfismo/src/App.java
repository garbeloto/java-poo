import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Fiat", "Cronos", 2022, 4));
        veiculos.add(new  Motocicleta("Honda", "CG 160", 2020, 10));
        veiculos.add(new Caminhao("Volvo", "FH", 2024, 8));

        for (Veiculo veiculo : veiculos) {
            System.out.println("=====Veiculo:=====");
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.print("Som: ");
            veiculo.emitirSom();
            System.out.println("Imposto: " + veiculo.calcularImposto());
            
        }
    }
}
