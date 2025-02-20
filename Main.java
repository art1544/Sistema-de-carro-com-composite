public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Meu Carro");

        //#region mockComponentesDoCarro
        GrupoPecas motor = new GrupoPecas("Motor");
        motor.adicionar(new Peca("Bloco do Motor", 8000.0));
        motor.adicionar(new Peca("Cilindro", 3000.0));
        motor.adicionar(new Peca("Pistão", 500.0));
        
        GrupoPecas sistemaInjecao = new GrupoPecas("Sistema de Injeção");
        sistemaInjecao.adicionar(new Peca("Injetor 1", 250.0));
        sistemaInjecao.adicionar(new Peca("Injetor 2", 250.0));
        sistemaInjecao.adicionar(new Peca("Injetor 3", 250.0));
        sistemaInjecao.adicionar(new Peca("Injetor 4", 250.0));
        motor.adicionar(sistemaInjecao);

        GrupoPecas chassi = new GrupoPecas("Chassi");
        chassi.adicionar(new Peca("Estrutura", 5000.0));
        chassi.adicionar(new Peca("Porta 1", 800.0));
        chassi.adicionar(new Peca("Porta 2", 800.0));
        chassi.adicionar(new Peca("Porta 3", 800.0));
        chassi.adicionar(new Peca("Porta 4", 800.0));

        GrupoPecas sistemaEletrico = new GrupoPecas("Sistema Elétrico");
        sistemaEletrico.adicionar(new Peca("Bateria", 1200.0));
        sistemaEletrico.adicionar(new Peca("Alternador", 600.0));
        sistemaEletrico.adicionar(new Peca("Fusível", 50.0));

        GrupoPecas rodas = new GrupoPecas("Rodas");
        rodas.adicionar(new Peca("Roda Frente Esquerda", 500.0));
        rodas.adicionar(new Peca("Roda Frente Direita", 500.0));
        rodas.adicionar(new Peca("Roda Traseira Esquerda", 500.0));
        rodas.adicionar(new Peca("Roda Traseira Direita", 500.0));

        meuCarro.adicionar(motor);
        meuCarro.adicionar(chassi);
        meuCarro.adicionar(sistemaEletrico);
        meuCarro.adicionar(rodas);
        //#endregion

        System.out.println("===== DETALHES DO CARRO =====");
        meuCarro.mostrarDetalhes();
        System.out.println("Valor total do carro: R$" + meuCarro.getValor());
    }
}
