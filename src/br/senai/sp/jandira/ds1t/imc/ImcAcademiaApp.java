package br.senai.sp.jandira.ds1t.imc;

import br.senai.sp.jandira.ds1t.imc.model.ImcAcademia;

public class ImcAcademiaApp {
    public static void main(String[] args) {

        System.out.println("Iniciando app...");

        ImcAcademia imcAcademia = new ImcAcademia();
        imcAcademia.obterDados();
    }


}
