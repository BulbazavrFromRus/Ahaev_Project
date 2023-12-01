package org.example.validators.entity.student;

import org.example.request.student.EditStudentRequest;
import org.example.validators.ValidatorRequest;
import org.example.validators.primitivevalidator.ValidatorId;
import org.example.validators.primitivevalidator.ValidatorNonEmptyStringAndMaxLength;
import org.example.validators.primitivevalidator.ValidatorStatus;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEditStudentRequest implements ValidatorRequest<EditStudentRequest> {
    private ValidatorNonEmptyStringAndMaxLength validatorNonEmptyString;
    private ValidatorStatus validatorStatus;

    private ValidatorId validatorId;
    public ValidatorEditStudentRequest(ValidatorNonEmptyStringAndMaxLength validatorNonEmptyString) {
        this.validatorNonEmptyString = validatorNonEmptyString;
    }

    @Override
    public List<String> validate(EditStudentRequest request) {
        List<String> errors = new ArrayList<>();
        final int maxLength = 10;

        //primary key (id)
        validatorId.validateId(request.getIdStudent(), errors, "idGroup", "Should be possitive");

        //firstName
        validatorNonEmptyString.validateNonEmptyString(request.getFirstName(), errors,"firstName", "Should be non empty");
        validatorNonEmptyString.validateMaxLengthString(request.getFirstName(),maxLength ,errors,"firstName", "Should be less than maximum length");
        //lastName
        validatorNonEmptyString.validateNonEmptyString(request.getLastName(), errors,"lastName", "Should be non empty");
        validatorNonEmptyString.validateMaxLengthString(request.getLastName(),maxLength ,errors,"lastName", "Should be less than maximum length");
        //patronymic
        validatorNonEmptyString.validateNonEmptyString(request.getMiddleName(), errors,"middleName", "Should be non empty");
        validatorNonEmptyString.validateMaxLengthString(request.getMiddleName(),maxLength ,errors,"middleName", "Should be less than maximum length");
        //status
        validatorStatus.statusValidator(request.getStatus(), errors, "status", "Should be valid status");

        //groupId
        validatorId.validateId(request.getGroupId(), errors, "idGroup", "Should be possitive");
        return errors;
    }
}
