/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.model.appointment;

import java.time.LocalDate;

/**
 *
 * @author brimo
 */
public class Appointment {
    private String idPatient;
    private String idDoctor;
    private LocalDate date;
    private String time;
    private String appointmentCode;
    
    public Appointment(String[] data)throws Exception{
        if(data.length==5){
            LocalDate d = LocalDate.parse(data[2]);
            
            this.idPatient = data[0];
            this.idDoctor = data[1];
            this.date = d;
            this.time = data[3];
            this.appointmentCode = data[4];
            
        } else {
            throw new Exception("El tamaño del arreglo debe ser de 5");
        }
    }

    /**
     * @return the idPatient
     */
    public String getIdPatient() {
        return idPatient;
    }

    /**
     * @param idPatient the idPatient to set
     */
    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    /**
     * @return the idDoctor
     */
    public String getIdDoctor() {
        return idDoctor;
    }

    /**
     * @param idDoctor the idDoctor to set
     */
    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the appointmentCode
     */
    public String getAppointmentCode() {
        return appointmentCode;
    }

    /**
     * @param appointmentCode the appointmentCode to set
     */
    public void setAppointmentCode(String appointmentCode) {
        this.appointmentCode = appointmentCode;
    }
    
}
