
public class Jogador {
    private String nome;
    private String nickname;
    private int idade;
    private int reputacao = 0;
    private double creditos = 0;
    private boolean bloqueado = false;



    public Jogador(String nome, String nickname, int idade) {
        setNome(nome);
        setNickname(nickname);
        setIdade(idade);
    }

   
    public void setNome(String nome) {
        if (nome == null || nome.length() == 0) {
            System.out.println("O Nome não pode ser nulo");
        } else
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNickname(String nickname) {
        if (nickname.length() < 4) {
           System.out.println("O Nickname não pode ter menos de 4 caracteres");
        } else
        this.nickname = nickname.toLowerCase();
        
    }

    public String getNickname() {
        return nickname;
    }

    public void setIdade(int idade) {
        if (idade <13) {
            System.out.println("Idade não pode ser menor que 13");
        } else
        this.idade = idade;
    }

     public int getIdade() {
     return idade;
     }

     public void adicionarCreditos(double creditos){
        if (this.bloqueado) {  
            System.out.println("Falha: Jogador está bloqueado e não pode adicionar créditos."); 
        } else {
        if (creditos <= 0) {
            System.out.println("Não pode adicionar créditos com valor negativo");
        } else {
        this.creditos += creditos;
        
        this.reputacao += (int) creditos / 10;
            }
        }
     }

     public double getCreditos() {
         return creditos;
     }

     public int getReputacao() {
         return reputacao;
     }

     public void setReputacao(int reputacao) {
         this.reputacao = reputacao;
     }



     public void comprar(ItemDigital item) {
        if (this.bloqueado) {  
            System.out.println("Falha: Jogador está bloqueado e não pode realizar compras.");  
        } else{
        System.out.println("Tentando comprar: " + item.getNome());

        System.out.println("Valor: R$"+item.getValor());

        if (!item.getDisponivel()) {
            System.out.println("Falha: O item não está disponível no mercado.");
            return;
        }
       
        if (item.getEstoque() <= 0) {
            System.out.println("Falha: O item está sem estoque.");
             this.reputacao -= 5;
            return;
        }
       
        if (this.creditos < item.getValor() - item.getValor() * getPercentualDesconto() / 100) {
            System.out.println("Falha: Créditos insuficientes. Preço: " + (item.getValor() - item.getValor() * getPercentualDesconto() / 100) + ", Saldo: " + this.creditos);
             this.reputacao -= 5;
            return;
        }
       
        if (item.getDisponivel() && item.getJaComprado()) {
            System.out.println("Falha: Item exclusivo não pode ser comprado novamente.");
             this.reputacao -= 5;
            return;
        }

          if (getPercentualDesconto() > 0) {
                 System.out.println("Desconto de "+getPercentualDesconto()+"% aplicado.");
         }

         System.out.println("Valor final: R$" + (item.getValor() - item.getValor() * getPercentualDesconto() / 100));

        this.creditos -= (item.getValor() - item.getValor() * getPercentualDesconto() / 100);
        item.setEstoque(item.getEstoque() - 1);
        item.setJaComprado(true);
        this.reputacao += 10;
       
        System.out.println("Sucesso! Compra realizada. Novo saldo de créditos: " + this.creditos + "\n");
    }
     }


     public double getPercentualDesconto(){
        if (this.reputacao <50) {
            return 0;
        } else if (this.reputacao >= 50 && this.reputacao <100) {
            return 5;
        } else{
            return 10;
        }
   
     }
     

     public void bloquear(){
        if (this.bloqueado) {
            this.bloqueado = false;
        } else {
            this.bloqueado = true;
        }
        
     }
        
      public boolean getBloqueado() {
        return bloqueado;
      }
     
      public void getResumo() {
        System.out.println("-----Resumo do Jogador------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nickname: " + this.nickname);
        System.out.println("Idade: " + this.idade);
        System.out.println("Créditos: " + this.creditos);
        System.out.println("Reputação: " + this.reputacao);
        System.out.println("Bloqueado: " + this.bloqueado);
        System.out.println("");
        }


        public void setCreditos(double creditos) {
            this.creditos = creditos;
        }

       public boolean comprarPacoteVIP(ItemDigital item) { 
        if (this.bloqueado) {  
            System.out.println("Falha: Jogador está bloqueado e não pode realizar compras.");  
            return false;
        } else{
        System.out.println("Tentando comprar: " + item.getNome());

        System.out.println("Valor: R$"+item.getValor());
        System.out.println("Desconto de "+15+"% aplicado.");

         System.out.println("Valor final: R$" + (item.getValor() - item.getValor() * 15 / 100));
        if (!item.getDisponivel()) {
            System.out.println("Falha: O item não está disponível no mercado.");
            return false;
        }
       
        if (item.getEstoque() <= 0) {
            System.out.println("Falha: O item está sem estoque.");
            return false;
        }
       
        if (this.creditos < item.getValor() - item.getValor() * 15 / 100) {
            System.out.println("Falha: Créditos insuficientes. Preço: " +(item.getValor() - item.getValor() * 15 / 100) + ", Saldo: " + this.creditos);
            return false;
        }
       
        if (item.getDisponivel() && item.getJaComprado()) {
            System.out.println("Falha: Item exclusivo não pode ser comprado novamente.");
            return false;
        }


        

        this.creditos -= (item.getValor() - item.getValor() * 15 / 100);
        item.setEstoque(item.getEstoque() - 1);
        item.setJaComprado(true);
       
        System.out.println("Sucesso! Compra realizada. Novo saldo de créditos: " + this.creditos + "\n");
        return true;
    }
     


        

    }
}
