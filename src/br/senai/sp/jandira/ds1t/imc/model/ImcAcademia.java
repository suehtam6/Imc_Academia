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

    }


    public void calculandoPeso(){

        double alturaEmMetros = altura / 100.0;
        imc = peso / (alturaEmMetros * alturaEmMetros);
        resultado;



    }


}
