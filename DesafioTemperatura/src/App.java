public class App {
    public static void main(String[] args) throws Exception {
        ArCondionado arCondionado = new ArCondionado();

        arCondionado.aumentarTemperatura();
        arCondionado.aumentarTemperatura();
        arCondionado.aumentarTemperatura();
        arCondionado.aumentarTemperatura();
        arCondionado.aumentarTemperatura();
        arCondionado.aumentarTemperatura();
        arCondionado.aumentarTemperatura();

        System.out.println(arCondionado.getTemperatura());
        
    }
}
