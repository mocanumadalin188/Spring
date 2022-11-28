package com.example.finalproject.validation.user;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserPasswordValidator implements ConstraintValidator<UserPasswordConstraint, String> {

    @Override
    public void initialize(UserPasswordConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    // TODO implement
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return true;
    }
}

// can also call it manually Set<ConstraintViolation<Class>> violations = validator.validate(Class)
// inject SmartValidator;

