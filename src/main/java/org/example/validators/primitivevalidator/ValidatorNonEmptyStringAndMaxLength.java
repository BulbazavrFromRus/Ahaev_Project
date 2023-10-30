package org.example.validators.primitivevalidator;

import java.util.List;

public class ValidatorNonEmptyStringAndMaxLength {
     public boolean validateNonEmptyString(String str, List<String> errorsList, String fieldName, String noticeError)
     {
         if(str == null || str.equals(""))
         {
              errorsList.add(fieldName+ " : " + noticeError);
              return false;
         }
         else
              return true;
     }

     public boolean validateMaxLengthString(String str,int maxLength, List<String> errorsList, String fieldName, String noticeError)
     {
          if(str.length() > maxLength)
          {
               errorsList.add(fieldName+ " : " + noticeError);
               return false;
          }
          return true;
     }
}
