package org.example.validators.primitivevalidator;

import java.util.List;

public class ValidatorId {
    public boolean validateId(long id, List<String> errorsList,String fieldName, String errorMessage)
    {
        if(id <= 0)
        {
            errorsList.add(fieldName+": "+ errorMessage);
            return false;
        }
        return true;
    }
}
