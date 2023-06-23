package hospital.service.serviceImpl;

import hospital.enums.Gender;
import hospital.model.Doctor;
import hospital.service.DoctorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DoctorServiceImpl implements DoctorService<Doctor> {

    private HospitalServiceImpl hospitalService;
    private List<Doctor> doctors = new ArrayList<>();
    @Override
    public List<Doctor> addDoctor(Doctor doctor) {
        doctors.add(doctor);
        return doctors;
    }

    @Override
    public Doctor getDoctorById(Long id) {
        Optional<Doctor> doctor = doctors.stream().filter(x -> x.getId() == id).findFirst();
        return doctor.orElse(null);
    }

    @Override
    public List<Doctor> filterByGender(String gender) {
        Gender genderfilter = Gender.valueOf(gender.toUpperCase());
        List<Doctor> doctors1 = doctors.stream().filter(x -> x.getGender().equals(genderfilter)).toList();
        return doctors1;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctors;
    }
}
