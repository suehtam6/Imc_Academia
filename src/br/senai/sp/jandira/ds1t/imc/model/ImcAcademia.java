package br.senai.sp.jandira.ds1t.imc.model;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class ImcAcademia{

    String nomeDoAluno;
    String situacao;
    double peso;
    double altura;
    double imc;
    double resultado;


    public void obterDados(){

        Scanner leitor = new Scanner(System.in);
        System.out.println("***************************");

        System.out.print("Qual o nome do aluno:");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Qual o peso do aluno:");
        peso = leitor.nextDouble();

        System.out.print("Qual a altura do aluno:");
        altura = leitor.nextDouble();

        System.out.println("***************************");

        calculandoPeso();

    }


    public void calculandoPeso(){

        double alturaEmMetros = altura / 100.0;
        imc = peso / (alturaEmMetros * alturaEmMetros);

        definirSituacao();
    }

    public void definirSituacao() {

        if (imc >= 16.9) {
            situacao = "Muito abaixo do peso!";
        } else if (imc >= 18.4) {
            situacao = "Abaixo do peso!";
        } else if (imc >= 24.5) {
            situacao = "Peso normal!";
        } else if (imc >= 29.9) {
            situacao = "Acima do peso!";
        } else if (imc >=34.9) {
            situacao = "Obesidade grau 1!";
        } else if (imc >= 40){
            situacao = "Obesidade grau 2!!";
        } else if (imc <40) {
            situacao = "Obesidade grau 3!!!";
        }

        exibirResultadosDoImc();
    }

    public void exibirResultadosDoImc(){

        String ImcDeUmDigito = String.format("%.1f", imc);

        System.out.println("**************************");
        System.out.println("Nome do Aluno:" + nomeDoAluno);
        System.out.println("IMC do Aluno:" + ImcDeUmDigito + " ele está com " + situacao);
        System.out.println("***************************");
    }


}
