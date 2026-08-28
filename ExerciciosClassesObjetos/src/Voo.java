public class Voo {
    String numero;
    String origem;
    String destino;
    int passageiros;


    public void embarcar(int quantidade){
        passageiros = passageiros + quantidade;
    }

    public void desembarcar(int quantidade){
        passageiros = passageiros - quantidade;
    }

    public void consultarPassageiros(){
        System.out.println("Quantidade de passageiros: "  + passageiros);
    }

}
