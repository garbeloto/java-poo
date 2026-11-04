public class ArenaMain {

    public static void main(String[] args) throws Exception {

        Berserker berserker = new Berserker("Ragnar", 100, 30, 20);

        Escudeira escudeira = new Escudeira("Lagertha", 100, 70, 120);

        berserker.executarTurnoAtaque(escudeira);
        escudeira.executarTurnoAtaque(berserker);

        
        /* GuerreiroNordico semCla = new GuerreiroNordico();
        semCla.nome = "Fantasma";
        semCla.vida = 50;
        semCla.poderBase = 5;

        semCla.vida = -999;

        ClaTrapaceiro trapaceiro = new ClaTrapaceiro("Loki", 100, 15);
        trapaceiro.executarTurnoAtaque(semCla);

        SuperBerserkerCibernetico robo = new SuperBerserkerCibernetico("Berserker Cyborg", 200, 25, 8);
        System.out.println("Subclasse não autorizada criada: " + robo.nome); */

    }

/* 
    // Subclasse trapaceira que adulterou o ritual
    static class ClaTrapaceiro extends GuerreiroNordico {
        public ClaTrapaceiro(String nome, int vida, int poderBase) {
            super(nome, vida, poderBase);
        } 

        // Burlou o ritual e ainda roubou vida!
        @Override
        public void executarTurnoAtaque(GuerreiroNordico alvo) {
            System.out.println("[TRAPAÇA] " + this.nome + " adulterou o combate e não atacou de acordo com Odin!");
            this.vida += 20; // Curou a si mesmo indevidamente
        } 
    }

    // Subclasse indevida que especializou Berserker
     static class SuperBerserkerCibernetico extends Berserker {
        public SuperBerserkerCibernetico(String nome, int vida, int poderBase, int furia) {
            super(nome, vida, poderBase, furia);
        }
    } 
    */
}
 