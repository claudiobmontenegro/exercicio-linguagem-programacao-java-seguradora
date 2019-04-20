package Seguradora;

public class ContratoResidencial {
    private String cliente;
    private String endereco;
    private float valorImovel;
    private String localidade; //Urbana, rural ou suburbana;
    private String tipo;       //Predio ou casa;
    private float valorSeguro;


    public ContratoResidencial(String cliente, String endereco, float valorImovel, String localidade, String tipo) {
        super();
        this.cliente = cliente;
        this.endereco = endereco;
        this.valorImovel = valorImovel;
        this.localidade = localidade;
        this.tipo = tipo;
    }

    public float getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(float valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(float valorImovel) {
        this.valorImovel = valorImovel;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


//    Forma de cálculo do seguro residencial:
//    2% do valor do móvel somados a:
//    1% se zona urbana
//    0,5% se zona suburbana
//    0,5% se casa.

    public float calculaSeguro(ContratoResidencial contratoResidencial){
        this.valorSeguro = contratoResidencial.getValorImovel();
        valorSeguro = valorSeguro - (valorSeguro*98)/100;

        if(contratoResidencial.getLocalidade() == "urbana"){
            float adicional = contratoResidencial.getValorImovel();
            adicional = adicional - (adicional*99)/100;
            valorSeguro = valorSeguro + adicional;
        }
        else if(contratoResidencial.getLocalidade() == "suburbana"){
            float adicional = contratoResidencial.getValorImovel();
            adicional = adicional - (adicional*99.5f)/100;
            valorSeguro = valorSeguro + adicional;
        }
        else if(contratoResidencial.getLocalidade() == "rural"){
            System.out.println("\nNao possui valor adicional.\n");
        }
        return this.valorSeguro;
    }

}
