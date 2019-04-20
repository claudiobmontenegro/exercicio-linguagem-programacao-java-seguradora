package Seguradora;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Cadastro de Cliente.  \n");
        System.out.println("Qual tipo de contrato deseja realizar?\n");
        System.out.println("1-Contrato Residencial (Pessoa Fisico)\n2-Contrato Empresarial (Pessoa Juridica).");
        int tipoContrato = leitor.nextInt();

        if(tipoContrato ==1){
            System.out.println("Voce escolheu o Contrato Residencial.\n");
            System.out.println("Por favor, digite o nome do cliente: ");
            String nome = leitor.next();

            System.out.println("\nAgora digite o endereco do cliente:");
            String endereco = leitor.next();

            System.out.println("\nAgora digite o valor do imovel:");
            float valorImovel = leitor.nextFloat();

            System.out.println("\nAgora digite a zona (urbana, suburbana ou rural) :");
            String localidade = leitor.next();

            System.out.println("\nAgora digite tipo (casa ou predio) :");
            String tipo = leitor.next();

            ContratoResidencial contratoResidencial1 = new ContratoResidencial(nome, endereco, valorImovel, localidade, tipo);

            System.out.println("\nCliente atual: "+nome);

            System.out.println("\nDeseja realizar o calculo de sinistro?\n1-Sim 2- Nao");
            int calculo = leitor.nextInt();

            if(calculo == 1){
                contratoResidencial1.calculaSeguro(contratoResidencial1);
                System.out.println("\nValor Seguro: "+contratoResidencial1.getValorSeguro());
            }
            else if(calculo == 2){
                System.out.println("Sem problemas.");
            }
            System.out.println("\nTipo de contrato: Residencial");
            System.out.println("\nLista de clientes: "+contratoResidencial1.getCliente());
            System.out.println("\nValor do imovel: "+contratoResidencial1.getValorImovel());
            System.out.println("\nEndereco do cliente: "+contratoResidencial1.getEndereco());
            System.out.println("\nZona: "+contratoResidencial1.getLocalidade());
            System.out.println("\nTipo: "+contratoResidencial1.getTipo());
            System.out.println("\nValor do seguro: "+contratoResidencial1.getValorSeguro());

        }
        else if(tipoContrato == 2){
            System.out.println("\nVoce escolheu o Contrato Juridico.\n");
            System.out.println("\nPor favor, digite o nome do cliente: ");
            String nome = leitor.next();

            System.out.println("\nAgora digite o valor do imovel: ");
            float valor = leitor.nextFloat();

            System.out.println("\nDigite o numero de funcionarios da empresa: ");
            int funcionarios = leitor.nextInt();

            System.out.println("\nDigite o numero de visitas diarias: ");
            int visitas = leitor.nextInt();

            System.out.println("\nDigite o ramo de sua empresa (agropecuaria, industria ou comercio): ");
            String ramo = leitor.next();

            ContratoEmpresarial contratoEmpresarial1 = new ContratoEmpresarial(nome, valor, funcionarios, visitas, ramo);

            System.out.println("\nDeseja realizar o calculo de sinistro?\n1-Sim 2- Nao");
            int calculo = leitor.nextInt();

            if(calculo == 1){
                contratoEmpresarial1.calculaSeguro(contratoEmpresarial1);
                System.out.println("\nValor do seguro: "+contratoEmpresarial1.getValorSeguro());
            }
            else if(calculo == 2){
                System.out.println("\nSem problemas.");
                contratoEmpresarial1.calculaSeguro(contratoEmpresarial1);

            }
            System.out.println("\nTipo de contrato: Empresarial.");
            System.out.println("\nLista de clientes: "+contratoEmpresarial1.getCliente());
            System.out.println("\nValor do imovel: "+contratoEmpresarial1.getValorImovel());
            System.out.println("\nNumero de funcionarios: "+contratoEmpresarial1.getFuncionarios());
            System.out.println("\nNumero de visitas: "+contratoEmpresarial1.getVisitas());
            System.out.println("\nRamo: "+contratoEmpresarial1.getRamo());
            System.out.println("\nValor do seguro: "+contratoEmpresarial1.getValorSeguro());
        }
        leitor.close();
    }
}
