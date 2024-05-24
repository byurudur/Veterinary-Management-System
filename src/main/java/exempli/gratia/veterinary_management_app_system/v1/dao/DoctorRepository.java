package exempli.gratia.veterinary_management_app_system.v1.dao;


import exempli.gratia.veterinary_management_app_system.v1.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    boolean existsByMailOrPhone(String mail, String phone);
}
