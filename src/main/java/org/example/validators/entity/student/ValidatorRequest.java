package org.example.validators.entity.student;

import java.util.List;

public interface ValidatorRequest<T> {
     List<String> validate(T request);
}
