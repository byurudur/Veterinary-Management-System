package exempli.gratia.veterinary_management_app_system.v1.controller;


import exempli.gratia.veterinary_management_app_system.v1.business.abstracts.AvailableDateService;
import exempli.gratia.veterinary_management_app_system.v1.core.config.modelMapper.ModelMapperService;
import exempli.gratia.veterinary_management_app_system.v1.core.result.Result;
import exempli.gratia.veterinary_management_app_system.v1.core.result.ResultData;
import exempli.gratia.veterinary_management_app_system.v1.core.utilities.ResultHelper;
import exempli.gratia.veterinary_management_app_system.v1.dto.request.availableDate.AvailableDateSaveRequest;
import exempli.gratia.veterinary_management_app_system.v1.dto.request.availableDate.AvailableDateUpdateRequest;
import exempli.gratia.veterinary_management_app_system.v1.dto.response.availableDate.AvailableDateGetAllResponse;
import exempli.gratia.veterinary_management_app_system.v1.dto.response.availableDate.AvailableDateResponse;
import exempli.gratia.veterinary_management_app_system.v1.entities.AvailableDate;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/available-dates")
public class AvailableDateController {
    private final AvailableDateService availableDateService;
    private final ModelMapperService modelMapperService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<AvailableDateResponse> save(@Valid @RequestBody AvailableDateSaveRequest availableDateSaveRequest) {
        // Save a new available date and map the result to a response object.
        return ResultHelper.CREATED(modelMapperService.forResponse().map(availableDateService.save(modelMapperService.forRequest().map(availableDateSaveRequest, AvailableDate.class)), AvailableDateResponse.class));
    }


    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResultData<AvailableDateResponse> update(@Valid @RequestBody AvailableDateUpdateRequest availableDateUpdateRequest) {
        // Update an existing available date and map the result to a response object.
        return ResultHelper.OK(modelMapperService.forResponse().map(availableDateService.update(modelMapperService.forRequest().map(availableDateUpdateRequest, AvailableDate.class)), AvailableDateResponse.class));
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<AvailableDateGetAllResponse> getId(@PathVariable("id") long id) {
        // Retrieve an available date by its ID and map the result to a response object.
        return ResultHelper.OK(modelMapperService.forResponse().map(availableDateService.getId(id), AvailableDateGetAllResponse.class));
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") long id) {
        // Delete an available date by its ID.
        return ResultHelper.DELETE(availableDateService.delete(id));
    }

    @DeleteMapping("/force-delete/{id}")
    public Result forceDelete(@PathVariable("id") long id) {
        return ResultHelper.DELETE(availableDateService.forceDelete(id));
    }
}
