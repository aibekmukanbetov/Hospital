package hospital.service.serviceImpl;

import hospital.enums.Gender;
import hospital.model.Doctor;
import hospital.model.Hospital;
import hospital.service.DoctorService;

import java.util.List;
import java.util.Optional;

public class DoctorServiceImpl implements DoctorService<Doctor> {

    private HospitalServiceImpl hospitalService;
    @Override
    public List<Doctor> addDoctor(Doctor doctor) {
        for (Hospital hospital: hospitalService.getHospitals()){
            hospital.getDoctors().add(doctor);
            return hospital.getDoctors();
        }
        return null;
    }

    @Override
    public Doctor getDoctorById(Long id) {
      for (Hospital hospital: hospitalService.getHospitals()){
          Optional<Doctor> doctor = hospital.getDoctors().stream().filter(x -> x.getId() == id).findFirst();
          return doctor.orElse(null);
      }
      return null;
    }

    @Override
    public List<Doctor> filterByGender(String gender) {
        Gender genderfilter = Gender.valueOf(gender.toUpperCase());
        for (Hospital hospital: hospitalService.getHospitals()){
            List<Doctor> doctors = hospital.getDoctors().stream()
                    .filter(x -> x.getGender().equals(genderfilter)).toList();
            return doctors;
        }
        return null;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        for (Hospital hospital: hospitalService.getHospitals()){
            return hospital.getDoctors();
        }
        return null;
    }
}
