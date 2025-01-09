/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.controller.patient;

import com.una.proyectoprogramadoiiv2.model.patient.Patient;
import com.una.proyectoprogramadoiiv2.model.patient.PatientDAO;
import java.time.LocalDate;

/**
 *
 * @author brimo
 */
public class PatientController implements PatientInterface {

    PatientDAO dao;

    public PatientController() throws Exception {
        dao = new PatientDAO();
    }

    @Override
    public String add(String[] data) {
        String response = "El Paciente ya existe";

        try {
            if (!dao.exist(data[0])) {
                Patient patient = new Patient(data);
                patient.setId(data[0]);
                patient.setName(data[1]);
                patient.setLastName(data[2]);
                patient.setPhone(data[3]);
                patient.setEmail(data[4]);
                patient.setDirection(data[5]);
                patient.setBirthdate(LocalDate.parse(data[6]));
                patient.setpContactEmergency(data[7]);
                patient.settContactEmergency(data[8]);

                if(dao.add(patient)){
                    response="Guardado exitosamente!!!";                   
                }else{
                  response="Error al guardar los datos";  
                };
            }

        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }

    @Override
    public String[] find(String id) {
        String response = "El Paciente no existe";
        try {
            if (dao.exist(id)) {
            Patient patient = dao.find(id);
            String data[] = {
                patient.getId(),
                patient.getName(),
                patient.getLastName(),
                patient.getPhone(),
                patient.getEmail(),  
                patient.getDirection(),
                patient.getBirthdate().toString(),
                patient.getpContactEmergency(),
                patient.gettContactEmergency()
            };
            return data;
            }
    
        } catch (Exception ex) {
            response = ex.getMessage();
        }

        return null;

    }

    @Override
    public String update(String[] data, String id) {

        String response = "El Paciente no existe";
        try {
            if (dao.exist(id)) {
                Patient actualizar = dao.find(id);
                actualizar.setName(data[1]);
                actualizar.setLastName(data[2]);
                actualizar.setPhone(data[3]);
                actualizar.setEmail(data[4]);
                actualizar.setDirection(data[5]);
                actualizar.setBirthdate(LocalDate.parse(data[6]));
                actualizar.setpContactEmergency(data[7]);
                actualizar.settContactEmergency(data[8]);
                dao.update(actualizar, id);
                response = "Actualizado correctamente";

            }
        } catch (Exception e) {
            response = "Error al actualizar: " + e.getMessage();
        }
        return response;
    }

    @Override
    public String delete(String id) {
        String response = "El Paciente no existe";
        try {
            if (dao.exist(id)) {
                boolean eliminar = dao.delete(id);
                if (!eliminar) {
                    response = "No se pudo eliminar al paciente, vuelva a intentar!!";
                } else {
                    response = "Paciente eliminado Correctamente!!";
                }
            }
        } catch (Exception ex) {
            response = ex.getMessage();
        }
        return response;
    }
}
