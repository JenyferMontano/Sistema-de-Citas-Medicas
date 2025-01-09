/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.model.patient;

import com.una.proyectoprogramadoiiv2.model.Person;
import java.time.LocalDate;


/**
 *
 * @author brimo
 */
public class Patient extends Person {
  private String pContactEmergency; //Emergency Contact Person
  private String tContactEmergency; //Emergency Contact Person Phone Number 

public Patient(String[] data)throws Exception{
        if(data.length == 9) {
        this.setId(data[0]);
        this.setName(data[1]);
        this.setLastName(data[2]);
        this.setPhone(data[3]);
        this.setEmail(data[4]);
        this.setDirection(data[5]);
        LocalDate bd = LocalDate.parse(data[6]);
        this.setBirthdate(bd);
        this.pContactEmergency = data[7];
        this.tContactEmergency = data[8];
            
        }else{
           throw new Exception("El tamanio del arreglo debe ser de 9");
        }     
        
             
    }

    /**
     * @return the pContactEmergency
     */
    public String getpContactEmergency() {
        return pContactEmergency;
    }

    /**
     * @param pContactEmergency the pContactEmergency to set
     */
    public void setpContactEmergency(String pContactEmergency) {
        this.pContactEmergency = pContactEmergency;
    }

    /**
     * @return the tContactEmergency
     */
    public String gettContactEmergency() {
        return tContactEmergency;
    }

    /**
     * @param tContactEmergency the tContactEmergency to set
     */
    public void settContactEmergency(String tContactEmergency) {
        this.tContactEmergency = tContactEmergency;
    }
  
}
