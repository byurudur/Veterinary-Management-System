package exempli.gratia.veterinary_management_app_system.v1.business.concretes;


import exempli.gratia.veterinary_management_app_system.v1.business.abstracts.DoctorService;
import exempli.gratia.veterinary_management_app_system.v1.core.exception.ForUpdateNotFoundIdException;
import exempli.gratia.veterinary_management_app_system.v1.core.exception.NotFoundException;
import exempli.gratia.veterinary_management_app_system.v1.core.exception.NotUniqueValues;
import exempli.gratia.veterinary_management_app_system.v1.core.utilities.Message;
import exempli.gratia.veterinary_management_app_system.v1.dao.DoctorRepository;
import exempli.gratia.veterinary_management_app_system.v1.entities.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class DoctorManager implements DoctorService {

    private final DoctorRepository doctorRepository;


    @Override
    public Doctor save(Doctor doctor) { // Section 15 - Registering a doctor
        if(doctorRepository.existsByMailOrPhone(doctor.getMail(),doctor.getPhone())){
            throw new NotUniqueValues(Message.NOT_UNIQUE);
        }
        return doctorRepository.save(doctor);
    }


    @Override
    public Doctor update(Doctor doctor) {
        doctorRepository.findById(doctor.getId()).orElseThrow(()-> new ForUpdateNotFoundIdException(Message.UPDATE_NOT_FOUND_ID));
        return doctorRepository.save(doctor);
    }


    @Override
    public Doctor getId(long id) {
        return doctorRepository.findById(id).orElseThrow(()-> new NotFoundException(Message.NOT_FOUND_ID));
    }


    @Override
    public boolean delete(long id) {
        doctorRepository.delete(getId(id));
        return true;
    }
}
