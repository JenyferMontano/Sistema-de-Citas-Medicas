/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import com.una.proyectoprogramadoiiv2.model.doctor.Doctor;
import com.una.proyectoprogramadoiiv2.model.doctor.DoctorDAO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jenif
 */
public class DoctorDAOTest {
        DoctorDAO instancia;

    @BeforeEach
    public void setUp() throws Exception {
        instancia = new DoctorDAO();
    }

    @AfterEach
    public void tearDown() {
        instancia = null; // Limpiar la instancia después de cada prueba
    }

    @Test
    public void TestAddDoctor() throws Exception {
        String[] data = {"15", "Pedro", "Quiros", "87648372", "pedro@gmail.com",
            "Por ahi", "2002-03-15", "Dentista"};
        Doctor doc = new Doctor(data);
        boolean result = instancia.add(doc);
        Assertions.assertTrue(result);
    }

    @Test
    public void testFindDoctor() throws Exception {
        String id = "15";
        Doctor response = instancia.find(id);
        Assertions.assertNotNull(response);
        Assertions.assertEquals(id, response.getId());
    }

   @Test
    public void testModifyDoctor() throws Exception {
        String id = "15";
        String[] data = {"15", "Carlos", "Brenes", "87648372", "car@gmail.com",
            "Por alla", "2002-12-15", "Dentista"};
        Doctor doc = new Doctor(data);
        boolean result = instancia.update(doc, id);
        Assertions.assertTrue(result);

    }

    @Test
    public void testDeleteDoctor() throws Exception {
        String id = "15";
        boolean result = instancia.delete(id);
        assertTrue(result);
    }
    
}
