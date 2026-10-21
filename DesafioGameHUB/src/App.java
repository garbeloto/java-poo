public class App {
    public static void main(String[] args) throws Exception {
        

        //Equipe: Rafaela, Mateus, Kauan

           Jogador jogador = new Jogador("Rafaela", "rafa123", 20);

        
        jogador.adicionarCreditos(80); 
        jogador.getResumo();

        System.out.println("-----Informações do item------");
        ItemDigital itemDigital = new ItemDigital("Item Barato", 20, 6, true, true);

        System.out.println("Item: " + itemDigital.getNome());
        System.out.println("Estoque: " + itemDigital.getEstoque());
        System.out.println("Disponivel para venda? " + itemDigital.iSDisponivelParaVenda());

        //teste valor insuficiente
        ItemDigital itemInsuficiente = new ItemDigital("Item Insuficiente", 100, 5, true, false);
        System.out.println("-> TESTE: Compra com créditos insuficientes");
        jogador.comprar(itemInsuficiente);

        System.out.println(" ");
        System.out.println("----- testes da etapa 4 ------");

        // 1. Verificar desconto antes de atingir 50 pontos (Reputação deve ser 0 aqui)[cite: 2]
        System.out.println("-> TESTE: Compra com menos de 50 de reputação (0% desconto)");
        jogador.comprar(itemDigital); // Sucesso: ganha 10 pontos de reputação[cite: 2]
        
        // 2. Testar compra recusada (Diminui 5 pontos)[cite: 2]
        System.out.println("-> TESTE: Compra recusada (Item sem estoque)");
        ItemDigital itemSemEstoque = new ItemDigital("Jogo Falso", 10, 0, true, false);
        jogador.comprar(itemSemEstoque); // Falha: perde 5 pontos de reputação[cite: 2]
        System.out.println("Creditos" +jogador.getCreditos());
        // testar os descontos de 50 e 100 pontos sem precisar criar dezenas de compras para somar +10 de cada vez

        // 3. Verificar depois de atingir 50 pontos (5% desconto)[cite: 2]
        System.out.println("-> TESTE: Compra com 50 pontos (5% desconto)");
        jogador.setReputacao(50); // Simulando que atingiu 50 pontos
        jogador.adicionarCreditos(100); // Adicionando para garantir saldo suficiente para a compra
        ItemDigital item50 = new ItemDigital("Jogo Medio", 40, 5, true, false);
        jogador.comprar(item50);
       

        // 4. Verificar depois de atingir 100 pontos (10% desconto)[cite: 2]
        System.out.println("-> TESTE: Compra com 100 pontos (10% desconto)");
        jogador.setReputacao(100); // Simulando que atingiu 100 pontos
        ItemDigital item100 = new ItemDigital("Jogo Caro", 50, 5, true, false);
        jogador.comprar(item100);
     
        System.out.println("Bloqueado: " + jogador.getBloqueado());


        // 5. Testar bloqueio do jogador
        System.out.println("-> TESTE: Bloqueio do jogador");
        System.out.println("Creditos antes do bloqueio: " + jogador.getCreditos());
        jogador.bloquear(); // Bloqueando o jogador
        jogador.comprar(itemDigital); // Tentativa de compra enquanto bloqueado
        jogador.adicionarCreditos(50); // Tentativa de adicionar créditos enquanto bloqueado
        System.out.println("Creditos após tentativas de compra e adição de créditos: " + jogador.getCreditos());
        jogador.bloquear(); // Desbloqueando o jogador
    
        
        System.out.println(" ");
        System.out.println("-----Informações atualizadas do item------");
        System.out.println("Estoque: " + itemDigital.getEstoque());





        //teste do pacote VIP saldo insuficiente
        System.out.println(" ");
        System.out.println("-> TESTE: Compra do pacote VIP");
        ItemDigital itemVIP = new ItemDigital("Pacote VIP", 100, 5, true, true);
        jogador.setReputacao(120); // Simulando que atingiu 120 pontos
        System.out.println(jogador.comprarPacoteVIP(itemVIP)); // deve retornar false, pois o jogador não tem créditos suficientes para comprar o pacote VIP

        //teste do pacote VIP compra valida
        System.out.println(" ");
        System.out.println("-> TESTE: Compra do pacote VIP com saldo suficiente");
        jogador.setCreditos(200); // Adicionando créditos suficientes para a compra do pacote VIP
        System.out.println(jogador.comprarPacoteVIP(itemVIP)); // deve retornar true, pois o jogador agora tem créditos suficientes para comprar o pacote VIP
        System.out.println("Creditos após compra do pacote VIP: " + jogador.getCreditos());
        

        //teste do pacote VIP item exclusivo
        System.out.println(" ");
        System.out.println("-> TESTE: Compra do pacote VIP com item exclusivo");
        System.out.println(jogador.comprarPacoteVIP(itemVIP)); // deve retornar false, pois o item é exclusivo e não pode ser comprado novamente
        //Checar
    }
}



