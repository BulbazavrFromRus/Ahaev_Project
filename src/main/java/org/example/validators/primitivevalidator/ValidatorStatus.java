package org.example.validators.primitivevalidator;

import modele.Status;

import java.util.List;

import static modele.Status.ACTIVE;

public class ValidatorStatus {
    public boolean statusValidator(String str, List<String> errorsList, String fieldName, String noticeError) {

        try {
            Status statuses = Status.valueOf(str);
            return true;
        } catch (IllegalArgumentException e) {
            errorsList.add(fieldName+ " : " + noticeError);
        }
       return false;
    }
}
