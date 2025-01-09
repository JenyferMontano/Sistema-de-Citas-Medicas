/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class DoctorController implements DoctorInterface {
       private DoctorDAO dao;
     public DoctorController() throws Exception{
        dao = new DoctorDAO();
    }

    @Override
    public String add(String[] data) {
             String response="El doctor ya existe!!!";
        try{
            if(!dao.exist(data[0])){
                Doctor doc = new Doctor(data);
                doc.setId(data[0]);
                doc.setName(data[1]);
                doc.setLastName(data[2]);
                doc.setPhone(data[3]);
                doc.setEmail(data[4]);
                doc.setDirection(data[5]);
                doc.setBirthdate(LocalDate.parse(data[6]));
                doc.setSpeciality(data[7]);
                if(dao.add(doc)){
                    response="Guardado exitosamente!!!";                   
                }else{
                  response="Error al guardar los datos";  
                }
            }
        }catch(Exception e){
            response = e.getMessage();
        }
        return response;
    }

    @Override
    public String[] find(String id) {
        String response = "El doctor no existe";
        try {
            if (dao.exist(id)) {
                Doctor doc = dao.find(id);
                String data[] = {
                doc.getId(),
                doc.getName(),
                doc.getLastName(),
                doc.getPhone(),
                doc.getEmail(),
                doc.getDirection(),
                doc.getBirthdate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                doc.getSpeciality()   
            };
            return data;
            }      
        } catch (Exception ex) {
            response = ex.getMessage();
    }
        String[] r = {response};
    return r;
        
    }

    @Override
    public String modify(String[] data, String id) {
         String response = "El doctor no existe!!!";
        try{
            if(dao.exist(id)){
                Doctor actualizar = dao.find(id);
                actualizar.setName(data[1]);
                actualizar.setLastName(data[2]);
                actualizar.setPhone(data[3]);
                actualizar.setEmail(data[4]);
                actualizar.setDirection(data[5]);
                actualizar.setBirthdate(LocalDate.parse(data[6]));
                actualizar.setSpeciality(data[7]);
                dao.update(actualizar, id);
                response = "Actualizado exitosamente!!!";
                
            }        
        }catch(Exception e){
           response = "Error al actualizar: " + e.getMessage(); 
        }
        return response;   
    }

    @Override
    public String delete(String id) {
    String response = "El doctor no existe!!!";
    try {
        if(dao.exist(id)){
            boolean eliminar = dao.delete(id);
          if(!eliminar){
              response = "No se pudo eliminar el doctor, vuelva a intentar!!";         
        }else{
            response = "Doctor eliminado Correctamente!!";   
          }
    } 
    }catch (Exception ex) {
        response = ex.getMessage();
    }
    return response;
}

    @Override
    public String[][] getAll() {
                try{
            ArrayList<Doctor> list=dao.getAll();
            String[][] data = new String[list.size()][8];
            for(int i = 0;i<list.size();i++){
                Doctor aux = list.get(i);
                data[i][0]=aux.getId();
                data[i][1]=aux.getName();
                data[i][2]=aux.getName();
                data[i][3]=aux.getName();
                data[i][4]=aux.getName();
                data[i][5]=aux.getName();
                data[i][6]=aux.getName();
                data[i][7]=aux.getName();
            }
            return data;
        }catch(Exception e){
            e.getMessage();
            return null;
        }
    
    }  
}
