public class ArCondionado {
    private double temperatura;

    public ArCondionado() {
        this.temperatura = 22;
    }
    
    public void aumentarTemperatura(){
        if (temperatura <  26) {
            temperatura ++;
        }
    }
    
    public void diminuirTemperatura(){
        if (temperatura >  18) {
            temperatura --;
        }
    }

    public double getTemperatura() {
        return temperatura;
    }


    
}
