/*
 * Objeto do tipo Carro
 * Propriedades Marca, ano de fabricação, valocidade atual
 * Metodos Acerelar a velocidade em 10 km/h, Frear diminuir a velocidade em 10 km/h, imprimir.
 */


class Carro {
    String marca;
    String modelo;
    int anoFabricação;
    int velocidadeAtual;

    public void acelerar() {
        velocidadeAtual += 10; 
    }

    public void frear() {
        velocidadeAtual -= 10;
    }

    public void imprimirInformacoes() {
        System.out.println("Marca :" + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricação);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " Km/h");

    }

}
 class meuCarro {

    public static void main(String[] args) {
        Carro Carro1 = new Carro();
        Carro1.marca = "Chevrolet";
        Carro1.modelo = "Spin";
        Carro1.anoFabricação = 2023;
        
        Carro1.acelerar();
        Carro1.acelerar();
        Carro1.frear();

        Carro1.imprimirInformacoes();
    }
}