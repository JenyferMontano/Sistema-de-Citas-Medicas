/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.controller.appointment;

import com.una.proyectoprogramadoiiv2.model.appointment.Appointment;
import com.una.proyectoprogramadoiiv2.model.appointment.AppointmentDAO;
import com.una.proyectoprogramadoiiv2.model.doctor.Doctor;
import static com.una.proyectoprogramadoiiv2.utilities.DateFormatUtil.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author brimo
 */
public class AppointmentController implements AppointmentInterface{

    private AppointmentDAO dao;
    public AppointmentController() throws Exception{
        dao = new AppointmentDAO();
    }
    
    @Override
    public String add(String[] data) {
        String response = "Número de cita existente";
        try{
          if(!dao.exist(data[4]))  {
              Appointment ap = new Appointment(data);
              if(dao.add(ap)){
                  response = "Cita agendada exitosamente";
              }else{
                  response = "Error al agendar la cita";
              }
          }
          
        }catch(Exception e){
            response = e.getMessage();
        }
        return response;
    }

    @Override
    public String[][] getAll() {
      try{
            ArrayList<Appointment> list=dao.getAll();
            String[][] data = new String[list.size()][5];
            for(int i = 0;i<list.size();i++){
                Appointment aux = list.get(i);
                data[i][0]=aux.getIdPatient();
                data[i][1]=aux.getIdDoctor();
                data[i][2]=aux.getDate().toString();
                data[i][3]=aux.getTime();
                data[i][4]=aux.getAppointmentCode();
            }
            return data;
        }catch(Exception e){
            e.getMessage();
            return null;
        }   
    }

    @Override
    public String[][] getAppointmentsByPatientId(String idPatient) {
    try {
        ArrayList<Appointment> list = dao.getAppointmentsByPatientId(idPatient);
        String[][] data = new String[list.size()][4]; 
        for (int i = 0; i < list.size(); i++) {
            Appointment aux = list.get(i);
            data[i][0] = aux.getAppointmentCode(); 
            data[i][1] = aux.getDate().toString(); 
            data[i][2] = aux.getTime(); 
            data[i][3] = aux.getIdDoctor();
        }
        return data;
    } catch (Exception e) {
        e.getMessage();
        return null;
        }
    }
}

