/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.controller.appointment;

/**
 *
 * @author brimo
 */
public interface AppointmentInterface {
 public String add(String[] data);
 public String[][] getAll();
 public String[][] getAppointmentsByPatientId(String idPatient);
}
