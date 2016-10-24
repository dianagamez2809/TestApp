/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diana.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author diana
 */

@Entity
@Table (name="PAIS")
public class Pais implements Serializable{
    private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer ID_PAIS;
    
    @Column(name = "NOMBRE_PAIS")
    @NotNull
    private String NOMBRE_PAIS;
    
    @Column(name = "CODIGO_PAIS")
    @NotNull
    private String CODIGO_PAIS;
    
    @Column(name = "VALOR_PAIS")
    @NotNull
    private int VALOR_PAIS;

    public Pais(){

    }

    public Pais(Integer ID_PAIS, String NOMBRE_PAIS) {
            super();
            this.ID_PAIS = ID_PAIS;
            this.NOMBRE_PAIS = NOMBRE_PAIS;
    }
	
    @OneToMany(mappedBy="ciudad",cascade=CascadeType.PERSIST)
    private List<Ciudad> ciudades = new ArrayList<Ciudad>();
	
    public List<Ciudad> getCiudades() {
        return ciudades;
    }
    
    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public Integer getId() {
            return ID_PAIS;
    }

    public void setId(Integer ID_PAIS) {
            this.ID_PAIS = ID_PAIS;
    }

    public String getNombre() {
            return NOMBRE_PAIS;
    }

    public void setNombre(String NOMBRE_PAIS) {
            this.NOMBRE_PAIS = NOMBRE_PAIS;
    }
    
    public String getCodigo() {
            return CODIGO_PAIS;
    }

    public void setCodigo(String CODIGO_PAIS) {
            this.CODIGO_PAIS = CODIGO_PAIS;
    }
    
    public int getValor(){
        return VALOR_PAIS;
    }
    
    public void setValor(int VALOR_PAIS){
        this.VALOR_PAIS = VALOR_PAIS;
    }

    @Override
    public String toString(){
        return "Pais [ID_PAIS=" + ID_PAIS + 
                ", NOMBRE_PAIS =" + NOMBRE_PAIS +
                ", CODIGO_PAIS =" + CODIGO_PAIS +
                ", VALOR_PAIS =" + VALOR_PAIS + "]";
    }
}
