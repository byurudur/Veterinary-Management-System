package exempli.gratia.veterinary_management_app_system.v1.business.abstracts;


import exempli.gratia.veterinary_management_app_system.v1.entities.Doctor;

public interface DoctorService {

    Doctor save(Doctor doctor);


    Doctor update(Doctor doctor);


    Doctor getId(long id);


    boolean delete(long id);
}
