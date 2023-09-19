package com.ext.core.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserTypeValidator implements ConstraintValidator<ValidateUserType, String> {
    @Override
    public boolean isValid(String employType, ConstraintValidatorContext context) {
        List<String> userTypeList = Arrays.asList("Admin","User");
        return userTypeList.contains(employType);
    }
}
