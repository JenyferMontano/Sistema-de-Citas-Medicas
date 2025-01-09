/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.model.doctor;

import com.una.proyectoprogramadoiiv2.model.Person;
import java.time.LocalDate;

/**
 *
 * @author brimo
 */
public class Doctor extends Person {
      private String speciality;
    
    public Doctor(String[] data) throws Exception{
        if(data.length==8){
        this.setId(data[0]);
        this.setName(data[1]);
        this.setLastName(data[2]);
        this.setPhone(data[3]);
        this.setEmail(data[4]);
        this.setDirection(data[5]);
        LocalDate bd = LocalDate.parse(data[6]);
        this.setBirthdate(bd);//cambiarlo a localdate
        this.speciality=data[7];        
    
         }else{
            throw new Exception("Tamaño del arreglo debe"
                    + "ser de 8"); 
        }
    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    

}
