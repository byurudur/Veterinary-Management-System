package exempli.gratia.veterinary_management_app_system.v1.dao;


import exempli.gratia.veterinary_management_app_system.v1.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByCustomer_Id(long animalCustomerId);

    List<Animal> findByName(String name);

    List<Animal> findByCustomerName(String name);
}
