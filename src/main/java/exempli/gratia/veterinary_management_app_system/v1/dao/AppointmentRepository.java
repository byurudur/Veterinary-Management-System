package exempli.gratia.veterinary_management_app_system.v1.dao;


import exempli.gratia.veterinary_management_app_system.v1.entities.Animal;
import exempli.gratia.veterinary_management_app_system.v1.entities.Appointment;
import exempli.gratia.veterinary_management_app_system.v1.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    boolean existsByDateTime(LocalDateTime dateTime);

    boolean existsByDoctor_Id(long id);


    List<Appointment> findByDateTimeBetweenAndDoctor(LocalDateTime startDate, LocalDateTime endDate, Doctor doctor);

    boolean existsByDateTimeBetween(LocalDateTime startDate, LocalDateTime endDate);


    List<Appointment> findByDateTimeBetweenAndAnimal(LocalDateTime startDate, LocalDateTime endDate, Animal animal);


    boolean existsByAvailableDate_Id(long id);


    boolean existsByDoctor_IdAndAnimal_Id(long doctorId, long animalId);
}
