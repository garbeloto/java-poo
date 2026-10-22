public class App {
    public static void main(String[] args) throws Exception {
        /* Desenvolvedor dev = new Desenvolvedor(1, "Marina", "marina@empresa.com.br", "10/02/2025", 6500.00, "Java", "Pleno", "VsCode", "Backand");

        Gerente gerente = new Gerente(2, "Carlos", "carlos@empresa.com.br", "01/01/2024", 4500.00, "Equipe A", "Tecnologia", 5000.00, 1500.00);

        Administrador adm = new  Administrador(3, "Ana", "ana@empresa.com.br", "01/01/2020", 10000.00, "Avançado", "Total", "Usuarios", "Acesso ADM");

        System.out.println("====DESENVOLVEDOR====");
        dev.exibirDadosDesenvolvedor();

        System.out.println("====GERENTE====");
        gerente.exibirDadosGerente();

        System.out.println("====ADMINISTRADOR====");
        adm.exibirDadosAdministrador(); */

        AviaoCarga aviaoCarga1 = new AviaoCarga("GOL", "A-123", 2025, 30, "Produtos");
        AviaoCarga aviaoCarga2 = new AviaoCarga("GOL", "A-123", 2026, 90, "Importações");
        AviaoCarga aviaoCarga3 = new AviaoCarga("LATAM", "C-999", 2025, 90, "Importações");

        AviaoComercial aviaoComercial1 = new  AviaoComercial("LATAM", "B-234", 2023, 600, 10);
        AviaoComercial aviaoComercial2 = new  AviaoComercial("LATAM", "B-234", 2023, 400, 6);
        AviaoComercial aviaoComercial3 = new  AviaoComercial("GOL", "Z-222", 2024, 200, 4);

        System.out.println("====AVIÃO DE CARGA====");
        aviaoCarga1.exibirDadosCarga();
        aviaoCarga2.exibirDadosCarga();
        aviaoCarga3.exibirDadosCarga();

        System.out.println("====AVIÃO COMERCIAL====");
        aviaoComercial1.exibirDadosComerciais();
        aviaoComercial2.exibirDadosComerciais();
        aviaoComercial3.exibirDadosComerciais();
        
    }
}
