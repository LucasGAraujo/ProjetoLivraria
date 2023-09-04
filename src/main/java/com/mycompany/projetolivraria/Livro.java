/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolivraria;

/**
 *
 * @author lucas.garaujo
 */
public class Livro {
    private String  nomeAutor;
    private String nomeLivro;
    private String isbn;
    private String localPrateleira;

    public Livro(String nomeAutor, String nomeLivro, String isbn, String localPrateleira) {
        this.nomeAutor = nomeAutor;
        this.nomeLivro = nomeLivro;
        this.isbn = isbn;
        this.localPrateleira = localPrateleira;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLocalPrateleira() {
        return localPrateleira;
    }

    public void setLocalPrateleira(String localPrateleira) {
        this.localPrateleira = localPrateleira;
    }

    
}
