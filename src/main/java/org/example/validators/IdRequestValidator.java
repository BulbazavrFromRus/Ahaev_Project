package org.example.validators;

import org.example.request.IdRequest;
import org.example.validators.ValidatorRequest;
import org.example.validators.primitivevalidator.ValidatorId;

import java.util.ArrayList;
import java.util.List;



public class IdRequestValidator implements ValidatorRequest<IdRequest> {
    private ValidatorId validatorId;

    public IdRequestValidator(ValidatorId validatorId) {
        this.validatorId = validatorId;
    }



    @Override
    public List<String> validate(IdRequest request) {
        List<String> errorsList = new ArrayList<>();
        //we checked is there positive or negative id
        validatorId.validateId(request.getId(), errorsList,"id", "Should be positive");
        return errorsList;
    }


}
