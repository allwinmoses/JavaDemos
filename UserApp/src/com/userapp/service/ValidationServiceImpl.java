package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {
    @Override
    public boolean validatePassword(String password) {
        return false;
    }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] userNames ={"Sri","Priya","Jow","Paul"};

        for(String user:userNames){
            if(username.equals(user)){
                throw new NameExistsException("name already exits");
            }
        }

        return true;
    }
}
