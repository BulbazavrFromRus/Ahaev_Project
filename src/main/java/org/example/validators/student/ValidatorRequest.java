package org.example.validators.student;

import java.util.List;

public interface ValidatorRequest<T> {
     List<String> validate(T request);
}
