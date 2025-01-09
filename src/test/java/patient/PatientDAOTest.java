/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import com.una.proyectoprogramadoiiv2.model.patient.Patient;
import com.una.proyectoprogramadoiiv2.model.patient.PatientDAO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author brimo
 */
public class PatientDAOTest {

    PatientDAO instancia;

    @BeforeEach
    public void setUp() throws Exception {
        instancia = new PatientDAO();
    }

    @AfterEach
    public void tearDown() {
        instancia = null; // Limpiar la instancia después de cada prueba
    }

    @Test
    public void TestAddPatient() throws Exception {
        String[] data = {"01", "Pedro", "Quiros", "87648372", "pedro@gmail.com",
            "Por ahi", "2002-03-15", "Maria Juarez", "74629483"};
        Patient patient = new Patient(data);
        boolean result = instancia.add(patient);
        Assertions.assertTrue(result);
    }

    @Test
    public void TestFindPatient() throws Exception {
        String id = "01";
        Patient response = instancia.find(id);
        Assertions.assertNotNull(response);

    }

    @Test
    public void testModifyPatient() throws Exception {
        String id = "01";
        String[] data = {"01", "Carlos", "Brenes", "87648372", "car@gmail.com",
            "Por alla", "2002-12-15", "Julian Juarez", "83794082"};
        Patient patient = new Patient(data);
        boolean result = instancia.update(patient, id);
        Assertions.assertTrue(result);

    }

    @Test
    public void testDeletePatient() throws Exception {
        String id = "01";
        boolean result = instancia.delete(id);
        assertTrue(result);
    }

}
