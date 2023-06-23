package hospital.service;

import java.util.List;

public interface DoctorService<T> {
    List<T> addDoctor(T t);
    T getDoctorById(Long id);//Stream
    List<T> filterByGender(String gender);//Stream
    List<T>getAllDoctors();
}
