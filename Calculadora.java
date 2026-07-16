/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

public class Calculadora {

    public String comparar(Financiamento financiamento,
            Investimento investimento) {

        if (investimento.rendimentoAnual > financiamento.jurosFinanciamento) {

            double diferenca = investimento.rendimentoAnual - financiamento.jurosFinanciamento;

            return "Resultado:\n"
                    + "Vale mais a pena INVESTIR.\n"
                    + "O investimento rende "
                    + String.format("%.2f", diferenca)
                    + "%% ao ano acima do financiamento.";

        } else if (financiamento.jurosFinanciamento > investimento.rendimentoAnual) {

            double diferenca = financiamento.jurosFinanciamento - investimento.rendimentoAnual;

            return "Resultado:\n"
                    + "Vale mais a pena AMORTIZAR.\n"
                    + "A divida custa "
                    + String.format("%.2f", diferenca)
                    + "%% ao ano acima do investimento.";

        } else {

            return "Resultado:\n"
                    + "As duas opcoes sao praticamente equivalentes.";

        }

    }

}
