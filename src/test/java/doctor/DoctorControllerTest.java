/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import com.una.proyectoprogramadoiiv2.controller.doctor.DoctorController;
import com.una.proyectoprogramadoiiv2.model.doctor.Doctor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jenif
 */
public class DoctorControllerTest {

    DoctorController instance;

    public DoctorControllerTest() throws Exception { //Constructor
        instance = new DoctorController();
    }

     @Test
    public void testAddDoctor() throws Exception {
        String[] data = {
            "15",
            "Pedro", 
            "Quiros", 
            "87648372",
            "pedro@gmail.com",
            "Por ahi", 
            "2002-03-15",
            "Dentista"};
        Doctor doc = new Doctor(data);

        try {
            String expected = "Guardado exitosamente!!!";
            String resultadoValido = instance.add(data);
            Assertions.assertEquals(expected, resultadoValido);
        } catch (Exception e) {
            Assertions.fail("Error al guardar los datos" + e.getMessage());
        }
    }

    @Test
    public void testAddDoctorExistente() throws Exception {
        String[] data = {
            "15", 
            "Pedro", 
            "Quiros", 
            "87648372", 
            "pedro@gmail.com",
            "Por ahi",
            "2002-03-15",
            "Dentista"};
        Doctor doc = new Doctor(data);
        String resultadoExistente = instance.add(data);
        String expected = "El doctor ya existe!!!";
        String resultI = instance.add(data);
        assertEquals(expected, resultI);
    }

    @Test
    public void testFindDoctor() throws Exception {

        try {
            String id = "15";
            String[] data = instance.find(id);
            Assertions.assertNotNull(data);
            Assertions.assertEquals(8, data.length);
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void testModifyDoctor() throws Exception {
        try {
            String[] data = {
                "15",
                "Juan",
                "Porras",
                "87968542",
                "Juan@gmail.com",
                "Nicoya",
                "1990-01-08",
                "Pediatría"};
            String response = instance.modify(data, "15");
            Assertions.assertEquals("Actualizado exitosamente!!!", response);
        } catch (Exception e) {
            Assertions.fail("Error al actualizar: " + e.getMessage());
        }
    }

    @Test
    public void testModifyDoctorInvalid() throws Exception {
        try {
            String[] data = {
                "15",
                " ", 
                " ", 
                " ",
                " ",
                "Nicoya",
                "1990-01-08",
                "Pediatría"};
            String response = instance.modify(data, "15");
            Assertions.assertEquals("Actualizado exitosamente!!!", response);
        } catch (Exception e) {
            Assertions.fail("Error al actualizar: " + e.getMessage());
        }
    }

    @Test
    public void testDeleteDoctor() throws Exception {
        try {
            String response = instance.delete("15");
            Assertions.assertEquals("Doctor eliminado Correctamente!!", response);
        } catch (Exception e) {
            Assertions.fail("No se pudo eliminar el doctor, vuelva a intentar!!" + e.getMessage());

        }
    }

}
