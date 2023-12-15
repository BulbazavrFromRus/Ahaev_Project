package org.example.services;

import org.example.repository.RepositoryException;

public class ServiceException extends RepositoryException {
    public ServiceException(String message){
        super(message);
    }

    public ServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
