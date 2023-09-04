/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetolivraria;

import java.util.Scanner;

/**
 *
 * @author lucas.garaujo
 */

import java.util.Scanner;

public class ProjetoLivraria {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        Livro[] livros = new Livro[1000];
        int i = 0;
        String retorno;
        do {
            System.out.println("1-Cadastrar livro ");
            System.out.println("2-Listar todos os livros");
            System.out.println("3-Disponibilidade ");
            System.out.println("0-Parar programa");
            retorno = io.next();
            if (retorno.equals("1")) {
                String nome, autor, isbn, local;
                System.out.println("Digite o nome do livro: ");
                nome = io.nextLine();
                System.out.println("Digite o autor do livro");
                autor = io.nextLine();
                System.out.println("Digite o Isbn");
                isbn = io.nextLine();
                System.out.println("Digite a localização");
                local = io.nextLine();
                livros[i] = new Livro(nome, autor, isbn, local);
                i++;
            }if (retorno.equals("2")){
                for(int y = 0; y < i; y++) {
                    System.out.println("Os livros serao listados");
                    System.out.println("Posição: " + y);
                    System.out.println("Autor: " +livros[y].getNomeAutor());
                    System.out.println("Nome do livro: "+livros[y].getNomeLivro());
                    System.out.println("ISBN: "+livros[y].getIsbn());
                    System.out.println("Local na biblioteca: "+livros[y].getLocalPrateleira());
                    System.out.println("-----------------------------------------------------");
                }
            }if(retorno.equals("3")){
                System.out.println("Total = 1000");
                System.out.println("Cadastrados: " + i);
                System.out.println("Livres: "+(1000-i));
            }
        
        } while (!retorno.equals("0"));
        System.out.println("Projeto finalizado");
    }
}
