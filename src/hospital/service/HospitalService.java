package hospital.service;

import hospital.model.Hospital;

import java.util.List;

public interface HospitalService {
    List<Hospital> addHospital(Hospital hospital);
    List<Hospital>addHospitals(List<Hospital> hospitals);
    Hospital getHospitalById(Long id);
    List<Hospital>getAllHospitals();
    void updateHospital(Long id, Hospital hospital);
    List<Hospital>sortHospitalByName(String sort);//Stream menen
}
