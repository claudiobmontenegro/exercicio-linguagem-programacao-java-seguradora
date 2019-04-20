package Seguradora;

public class ContratoEmpresarial {
    private String cliente;
    private float valorImovel;
    private int funcionarios;
    private int visitas; //Diarias;
    private String ramo; //Comercio, industria ou agropecuaria;
    private float valorSeguro;

    public ContratoEmpresarial(String cliente, float valorImovel, int funcionarios, int visitas, String ramo) {
        super();
        this.cliente = cliente;
        this.valorImovel = valorImovel;
        this.funcionarios = funcionarios;
        this.visitas = visitas;
        this.ramo = ramo;
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

    public float getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(float valorImovel) {
        this.valorImovel = valorImovel;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

//    Forma de cálculo do seguro empresarial:
//    4% do valor do móvel somados a:
//    0,2% a cada 10 funcionários
//    0,3% a cada 200 visitas diárias
//    1% se industria
//    0,5% se comércio

    public float calculaSeguro(ContratoEmpresarial contratoEmpresarial){
        this.valorSeguro = contratoEmpresarial.getValorImovel();
        valorSeguro = valorSeguro - (valorSeguro * 96)/100;

        int funcionarios = contratoEmpresarial.getFuncionarios();
        float adicionalF = 0;
        int visitas = contratoEmpresarial.getVisitas();
        float adicionalV = 0;

        while(funcionarios % 10 >= 10){
            funcionarios = funcionarios/10;
            adicionalF = adicionalF + 0.2f;
        }
        while(visitas % 200 >= 200){
            visitas = visitas/200;
            adicionalV = adicionalV + 0.3f;
        }
        float adicionalFunc = contratoEmpresarial.getValorImovel();
        adicionalFunc = adicionalFunc * adicionalF;
        float adicionalVis = contratoEmpresarial.getValorImovel();
        adicionalVis = adicionalVis * adicionalV;

        valorSeguro = valorSeguro + adicionalFunc + adicionalVis;

        if(contratoEmpresarial.getRamo() == "industria"){
            float adicional = contratoEmpresarial.getValorImovel();
            adicional = adicional - (adicional*99)/100;
            valorSeguro = valorSeguro + adicional;
        }
        else if(contratoEmpresarial.getRamo() == "comercio"){
            float adicional = contratoEmpresarial.getValorImovel();
            adicional = adicional - (adicional*99.5f)/100;
            valorSeguro = valorSeguro + adicional;
        }
        else if(contratoEmpresarial.getRamo() == "agropecuaria"){
            System.out.println("Nao tem adicional. ");
        }
        return this.valorSeguro;


    }



}
