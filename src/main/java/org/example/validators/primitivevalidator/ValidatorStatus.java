package org.example.validators.primitivevalidator;

import modele.Status;

import java.util.List;

import static modele.Status.ACTIVE;

public class ValidatorStatus {
    public boolean statusValidator(Status str, List<String> errorsList, String fieldName, String noticeError) {

        String newStr = str.toString();

        try {
            Status statuses = Status.valueOf(newStr);
            return true;
        } catch (IllegalArgumentException e) {
            errorsList.add(fieldName+ " : " + noticeError);
        }
       return false;
    }
}
