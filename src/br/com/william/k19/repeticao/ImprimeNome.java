/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.k19.repeticao;

import java.io.PrintStream;

/**
 *
 * @author usuario
 */
public class ImprimeNome {
    public static PrintStream out;
    static {
        out=System.out;
    }
    public static void main(String[] args) {
        int cont=0;
        String nome="John William Vicente";
        while(cont<10){
            cont++;
            out.println(nome);
        }
    }
}
