package exempli.gratia.veterinary_management_app_system.v1.controller;

import exempli.gratia.veterinary_management_app_system.v1.business.abstracts.DoctorService;
import exempli.gratia.veterinary_management_app_system.v1.core.config.modelMapper.ModelMapperService;
import exempli.gratia.veterinary_management_app_system.v1.core.result.Result;
import exempli.gratia.veterinary_management_app_system.v1.core.result.ResultData;
import exempli.gratia.veterinary_management_app_system.v1.core.utilities.ResultHelper;
import exempli.gratia.veterinary_management_app_system.v1.dto.request.doctor.DoctorSaveRequest;
import exempli.gratia.veterinary_management_app_system.v1.dto.request.doctor.DoctorUpdateRequest;
import exempli.gratia.veterinary_management_app_system.v1.dto.response.doctor.DoctorResponse;
import exempli.gratia.veterinary_management_app_system.v1.entities.Doctor;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final ModelMapperService modelMapperService;
    private final DoctorService doctorService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<DoctorResponse> save(@Valid @RequestBody DoctorSaveRequest doctorSaveRequest) {
        // Save a new doctor and map the result to a response object.
        return ResultHelper.CREATED(modelMapperService.forResponse().map(doctorService.save(modelMapperService.forRequest().map(doctorSaveRequest, Doctor.class)), DoctorResponse.class));
    }


    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResultData<DoctorResponse> update(@Valid @RequestBody DoctorUpdateRequest doctorUpdateRequest) {
        // Update an existing doctor and map the result to a response object.
        return ResultHelper.OK(modelMapperService.forResponse().map(doctorService.update(modelMapperService.forRequest().map(doctorUpdateRequest, Doctor.class)), DoctorResponse.class));
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<DoctorResponse> getId(@PathVariable("id") long id) {
        // Retrieve a doctor by its ID and map the result to a response object.
        return ResultHelper.OK(modelMapperService.forResponse().map(doctorService.getId(id), DoctorResponse.class));
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") long id) {
        // Delete a doctor by its ID.
        return ResultHelper.OK(doctorService.delete(id));
    }
}
