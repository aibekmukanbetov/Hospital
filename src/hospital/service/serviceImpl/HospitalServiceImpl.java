package hospital.service.serviceImpl;

import hospital.model.Hospital;
import hospital.service.HospitalService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HospitalServiceImpl implements HospitalService {

    private List<Hospital> hospitals = new ArrayList<>();

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    @Override
    public List<Hospital> addHospital(Hospital hospital) {
        hospitals.add(hospital);
        return hospitals;
    }

    @Override
    public List<Hospital> addHospitals(List<Hospital> hospitals) {
        this.hospitals.addAll(hospitals);
        return this.hospitals;
    }

    @Override
    public Hospital getHospitalById(Long id) {
        for (Hospital hospital: hospitals) {
            if (hospital.getId()== id){
                return hospital;
            }
        }
        return null;
    }

    @Override
    public List<Hospital> getAllHospitals() {
        return hospitals;
    }

    @Override
    public void updateHospital(Long id, Hospital hospital) {
        Hospital newHospital = getHospitalById(id);
        newHospital.setName(hospital.getName());
        newHospital.setAddress(hospital.getAddress());
    }

    @Override
    public List<Hospital> sortHospitalByName(String sort) {
        List<Hospital> hospitals1 = hospitals.stream()
                .sorted(Comparator.comparing(Hospital::getName)).toList();
        return hospitals1;
    }
}
