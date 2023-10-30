package org.example.validators.group;

import org.example.request.group.AddGroupRequest;
import org.example.validators.primitivevalidator.ValidatorNonEmptyStringAndMaxLength;
import org.example.validators.student.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorAddGroupRequest implements ValidatorRequest<AddGroupRequest> {
       private ValidatorNonEmptyStringAndMaxLength validatorNonEmptyStringAndMaxLength;

    public ValidatorAddGroupRequest(ValidatorNonEmptyStringAndMaxLength validatorNonEmptyStringAndMaxLength) {
        this.validatorNonEmptyStringAndMaxLength = validatorNonEmptyStringAndMaxLength;
    }

    public ValidatorAddGroupRequest(){}

    @Override
    public List<String> validate(AddGroupRequest request) {
        //we will check only input string =>
        List<String> errors = new ArrayList<>();
        final int maxLength = 10;
        //firstName
        validatorNonEmptyStringAndMaxLength.validateNonEmptyString(request.getNameGroup(), errors,"nameGroup", "Should be non empty");
        validatorNonEmptyStringAndMaxLength.validateMaxLengthString(request.getNameGroup(),maxLength ,errors,"nameGroup", "Should be less than maximum length");
         return errors;

    }
}
