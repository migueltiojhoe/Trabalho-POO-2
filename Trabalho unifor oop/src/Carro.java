class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
}


//Questão 2: Encapsulamento e Métodos
class Carro {
 
	public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        if (quilometragem >= 0) {
            this.quilometragem = quilometragem;
        }
    }

    public void rodar(int km) {
        if (km > 0) {
     