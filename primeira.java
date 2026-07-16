/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

import java.util.Scanner;

public class primeira {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double valorFinanciamento;
        double saldoDevedor;
        double jurosFinanciamento;
        int prazo;
        double valorMensal;
        double rendimentoInvestimento;

        System.out.println("========================================");
        System.out.println("      SIMULADOR FINANCEIRO V1.0");
        System.out.println("========================================");

        System.out.print("Valor do financiamento (R$): ");
        valorFinanciamento = nc.nextDouble();

        System.out.print("Saldo devedor atual (R$): ");
        saldoDevedor = nc.nextDouble();

        System.out.print("Taxa de juros do financiamento (% ao ano): ");
        jurosFinanciamento = nc.nextDouble();

        System.out.print("Prazo restante (meses): ");
        prazo = nc.nextInt();

        Financiamento casa = new Financiamento(
                valorFinanciamento,
                saldoDevedor,
                jurosFinanciamento,
                prazo
        );

        System.out.print("Valor disponivel por mes (R$): ");
        valorMensal = nc.nextDouble();

        System.out.print("Rentabilidade do investimento (% ao ano): ");
        rendimentoInvestimento = nc.nextDouble();

        Investimento investimento = new Investimento(
                valorMensal,
                rendimentoInvestimento
        );

        System.out.println("\n========================================");
        System.out.println("DADOS INFORMADOS");
        System.out.println("========================================");

        System.out.printf("Valor financiado........: R$ %.2f%n", casa.valorFinanciamento);
        System.out.printf("Saldo devedor...........: R$ %.2f%n", casa.saldoDevedor);
        System.out.printf("Juros do financiamento..: %.2f%% ao ano%n", casa.jurosFinanciamento);
        System.out.printf("Prazo restante..........: %d meses%n", casa.prazo);

        System.out.printf("Valor disponivel........: R$ %.2f%n", investimento.valorMensal);
        System.out.printf("Investimento esperado...: %.2f%% ao ano%n", investimento.rendimentoAnual);

        System.out.println("\n========================================");
        System.out.println("ANALISE");
        System.out.println("========================================");

        Calculadora calculadora = new Calculadora();

        String resultado = calculadora.comparar(casa, investimento);

        System.out.println(resultado);

        nc.close();

    }

}
