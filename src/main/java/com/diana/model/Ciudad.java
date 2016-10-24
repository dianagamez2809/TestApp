/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author diana
 */
@Entity
@Table (name="CIUDAD")
public class Ciudad implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_CIUDAD")
    private Integer ID_CIUDAD;
    
    @Column(name = "NOMBRE_CIUDAD")
    @NotNull
    private String NOMBRE_CIUDAD;
    
    @Column(name = "ID_PAIS")
    @NotNull
    private int ID_PAIS;
    
    @Column(name = "VALOR_CIUDAD")
    private int VALOR_CIUDAD;

    @NotNull
    @ManyToOne
    private Pais PAIS;

    public Ciudad() {}
    
    public Ciudad(String NOMBRE_CIUDAD, Pais PAIS) {
        this.NOMBRE_CIUDAD = NOMBRE_CIUDAD;
        this.PAIS = PAIS;
    }
    
    public int getID(){
        return ID_CIUDAD;
    }
    
    public void setID(int ID_CIUDAD){
        this.ID_CIUDAD = ID_CIUDAD;
    }
    
    public String getNombre(){
        return NOMBRE_CIUDAD;
    }
    
    public void setNombre(String NOMBRE_CIUDAD){
        this.NOMBRE_CIUDAD = NOMBRE_CIUDAD;
    }
    
    public Pais getIDPais(){
        return PAIS;
    }
    
    public void setIDPais(Pais PAIS){
        this.PAIS = PAIS;
    }
    
    public int getValor(){
        return VALOR_CIUDAD;
    }
    
    public void setValor(int VALOR_CIUDAD){
        this.VALOR_CIUDAD = VALOR_CIUDAD;
    }
    
    @Override
    public String toString(){
        return "Ciudad [ID_CIUDAD=" + ID_CIUDAD + 
                ", NOMBRE_CIUDAD =" + NOMBRE_CIUDAD +
                ", ID_PAIS =" + ID_PAIS +
                ", VALOR_CIUDAD =" + VALOR_CIUDAD + "]";
    }
}
