package org.example.validators;

import java.util.List;

public interface ValidatorRequest<T> {
     List<String> validate(T request);
}
