/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.controller.doctor;

import com.una.proyectoprogramadoiiv2.model.doctor.Doctor;
import com.una.proyectoprogramadoiiv2.model.doctor.DoctorDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author brimo
 */
public interface DoctorInterface {
    public String add(String[] data);
    public String[] find(String id);    
    public String modify(String[] data, String id);
    public String delete(String id); 
    public String[][] getAll();
    
}
