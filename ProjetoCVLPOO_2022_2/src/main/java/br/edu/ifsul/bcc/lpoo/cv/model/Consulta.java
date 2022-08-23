/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author 20202pf.cc0006
 */
public class Consulta {
    private Integer id;
    private Calendar data;
    private String observacao;
    private Calendar data_retorno;
    private Float valor;
    private List<Receita> receita;
    private Medico medico;
    private Pet pet;
            
            
    public Consulta(){
        
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
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the data_retorno
     */
    public Calendar getData_retorno() {
        return data_retorno;
    }

    /**
     * @param data_retorno the data_retorno to set
     */
    public void setData_retorno(Calendar data_retorno) {
        this.data_retorno = data_retorno;
    }

    /**
     * @return the valor
     */
    public Float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Float valor) {
        this.valor = valor;
    }

    /**
     * @return the receita
     */
    public List<Receita> getReceita() {
        return receita;
    }

    /**
     * @param receita the receita to set
     */
    public void setReceita(List<Receita> receita) {
        this.receita = receita;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the pet
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * @param pet the pet to set
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
