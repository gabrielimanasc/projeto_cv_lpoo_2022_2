/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.List;

/**
 *
 * @author 20202pf.cc0006
 */
public class Receita {
    private Integer id;
    private String orientaco;
    private List<Produto> produto;
    
    public Receita(){
        
    };

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the orientaco
     */
    public String getOrientaco() {
        return orientaco;
    }

    /**
     * @param orientaco the orientaco to set
     */
    public void setOrientaco(String orientaco) {
        this.orientaco = orientaco;
    }

    /**
     * @return the produto
     */
    public List<Produto> getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
    
}
