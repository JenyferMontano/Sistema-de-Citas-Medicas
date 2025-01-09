/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.controller.patient;

/**
 *
 * @author brimo
 */
public interface PatientInterface {
    public String add(String[]data);
    public String [] find (String id);
    public String update (String [] data,String id);
    public String delete (String id);
   
}
