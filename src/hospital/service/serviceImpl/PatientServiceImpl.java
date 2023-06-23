package hospital.service.serviceImpl;

import hospital.model.Hospital;
import hospital.model.Patient;
import hospital.service.PatientService;

import java.util.List;

public class PatientServiceImpl implements PatientService{
    private HospitalServiceImpl hospitalService;

    @Override
    public List<Patient> addHospital(List<Patient> patients) {
        for (Hospital hospital: hospitalService.getHospitals()){
            hospital.getPatients().addAll(patients);
        }
        return patients;
    }

    @Override
    public Patient getPatientByfirstName(String name) {
        for (Hospital hospital: hospitalService.getHospitals()){
            for (Patient patient: hospital.getPatients()){
                if (patient.getFirstName().equalsIgnoreCase(name)){
                    return patient;
                }
            }
        }
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        for (Hospital hospital: hospitalService.getHospitals()){
            return hospital.getPatients();
        }
        return null;
    }

    @Override
    public void groupingByGender() {

    }

    @Override
    public List<Patient> filterByAge() {
        for (Hospital hospital: hospitalService.getHospitals()){
            List<Patient> patients = hospital.getPatients().stream()
                    .filter(x -> x.getAge() > 30).toList();
            return patients;
        }
        return null;
    }
}
