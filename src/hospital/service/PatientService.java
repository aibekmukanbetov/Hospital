package hospital.service;

import hospital.model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> addHospital(List<Patient>patients);
    Patient getPatientByfirstName(String name);//stream
    List<Patient>getAllPatients();
    void groupingByGender();//Stream
    List<Patient>filterByAge();//30 dan oido pasientter chyksyn
}
