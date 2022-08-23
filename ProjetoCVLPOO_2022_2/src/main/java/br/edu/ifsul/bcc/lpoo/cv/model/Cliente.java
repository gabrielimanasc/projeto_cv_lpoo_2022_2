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
public class Cliente extends Pessoa {
    private Calendar data_ultima_visita;
    private List<Pet> pet;
    
    public Cliente () {
        
    };

    /**
     * @return the data_ultima_visita
     */
    public Calendar getData_ultima_visita() {
        return data_ultima_visita;
    }

    /**
     * @param data_ultima_visita the data_ultima_visita to set
     */
    public void setData_ultima_visita(Calendar data_ultima_visita) {
        this.data_ultima_visita = data_ultima_visita;
    }

    /**
     * @return the pet
     */
    public List<Pet> getPet() {
        return pet;
    }

    /**
     * @param pet the pet to set
     */
    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }
}
