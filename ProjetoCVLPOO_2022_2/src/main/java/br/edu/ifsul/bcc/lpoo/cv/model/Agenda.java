/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;

/**
 *
 * @author 20202pf.cc0006
 */
public class Agenda {
    private Integer id;
    private Calendar data_inicio;
    private Calendar data_fim;
    private String obesrvacao;
    private Medico medico;
    private Status status;
    private Funcionario funcionario;
    private TipoProduto tipo_produto;
    public Agenda(){
        
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
     * @return the data_inicio
     */
    public Calendar getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @return the data_fim
     */
    public Calendar getData_fim() {
        return data_fim;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * @return the obesrvacao
     */
    public String getObesrvacao() {
        return obesrvacao;
    }

    /**
     * @param obesrvacao the obesrvacao to set
     */
    public void setObesrvacao(String obesrvacao) {
        this.obesrvacao = obesrvacao;
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
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the tipo_produto
     */
    public TipoProduto getTipo_produto() {
        return tipo_produto;
    }

    /**
     * @param tipo_produto the tipo_produto to set
     */
    public void setTipo_produto(TipoProduto tipo_produto) {
        this.tipo_produto = tipo_produto;
    }
}
