package exempli.gratia.veterinary_management_app_system.v1.business.abstracts;


import exempli.gratia.veterinary_management_app_system.v1.entities.Vaccine;

import java.time.LocalDate;
import java.util.List;

public interface VaccineService {

    Vaccine addVaccine(Vaccine vaccine);


    Vaccine getId(long id);


    Vaccine update(Vaccine vaccine);


    Vaccine forceUpdate(Vaccine vaccine);


    boolean delete(long id);


    List<Vaccine> getAnimalVaccineList(long id);


    List<Vaccine> getFilterByStartAndEndDate(LocalDate startDate, LocalDate endDate);
}
