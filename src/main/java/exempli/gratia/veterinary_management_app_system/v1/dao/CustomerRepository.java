package exempli.gratia.veterinary_management_app_system.v1.dao;


import exempli.gratia.veterinary_management_app_system.v1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    boolean existsByPhone(String phone);

    boolean existsByMail(String mail);


    List<Customer> findByName(String name);
}
