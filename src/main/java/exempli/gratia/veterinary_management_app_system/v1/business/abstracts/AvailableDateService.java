package exempli.gratia.veterinary_management_app_system.v1.business.abstracts;


import exempli.gratia.veterinary_management_app_system.v1.entities.AvailableDate;

public interface AvailableDateService {

    AvailableDate save(AvailableDate availableDate);


    AvailableDate update(AvailableDate availableDate);


    AvailableDate getId(long id);

    boolean delete(long id);

    boolean forceDelete(long id);
}
