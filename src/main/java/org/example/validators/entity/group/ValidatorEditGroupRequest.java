package org.example.validators.entity.group;

import org.example.request.group.EditGroupRequest;
import org.example.validators.primitivevalidator.ValidatorNonEmptyStringAndMaxLength;
import org.example.validators.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEditGroupRequest implements ValidatorRequest<EditGroupRequest> {
    private ValidatorNonEmptyStringAndMaxLength validatorNonEmptyStringAndMaxLength;

    public ValidatorEditGroupRequest(ValidatorNonEmptyStringAndMaxLength validatorNonEmptyStringAndMaxLength) {
        this.validatorNonEmptyStringAndMaxLength = validatorNonEmptyStringAndMaxLength;
    }

    @Override
    public List<String> validate(EditGroupRequest request) {
        //we will check only input string =>
        List<String> errors = new ArrayList<>();
        final int maxLength = 10;
        //firstName
        validatorNonEmptyStringAndMaxLength.validateNonEmptyString(request.getNameGroup(), errors,"nameGroup", "Should be non empty");
        validatorNonEmptyStringAndMaxLength.validateMaxLengthString(request.getNameGroup(),maxLength ,errors,"nameGroup", "Should be less than maximum length");
        return errors;

    }
}
