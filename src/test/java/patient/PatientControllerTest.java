/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import com.una.proyectoprogramadoiiv2.controller.patient.PatientController;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jenif
 */
public class PatientControllerTest {

    private PatientController instance;

    public PatientControllerTest() throws Exception {
        instance = new PatientController();
    }

     @Test
    public void testAddPatient() {

        String[] data = {"05",
            "Cris",
            "Mc",
            "78968545",
            "Chris@hotmail.com",
            "Upala",
            "1993-01-01",
            "Alicia",
            "78968562"};
        try {
            String response = instance.add(data);
            Assertions.assertEquals("Guardado exitosamente!!!", response);
        } catch (Exception e) {
            Assertions.fail("Error al guardar los datos" + e.getMessage());
        }
    }

    @Test
    public void testFindPatient() throws Exception {
            try {
            String id = "05";
            String[] data = instance.find(id);
            Assertions.assertNotNull(data);
            Assertions.assertEquals(9, data.length);
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void testUpdatePatient() {
        String id = "05";
        String[] newData = {
            "05",
            "Cristopher",
            "Mora",
            "78968542",
            "ChrisMora@gmail.com",
            "Upala",
            "1993-01-01",
            "Alicia",
            "78968562"};

        try {

            String response = instance.update(newData, id);

            assertEquals("Actualizado correctamente", response);
        } catch (Exception e) {
            Assertions.fail("Error al actualizar: " + e.getMessage());
        }
    }

    @Test
    public void testDeletePatient() {

        try {
            String response = instance.delete("05");
            Assertions.assertEquals("Paciente eliminado Correctamente!!", response);
        } catch (Exception e) {
            Assertions.fail("El Paciente no existe" + e.getMessage());

        }

    }

}
