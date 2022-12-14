package com.example.springdatahibernate.validation;

import org.hibernate.validator.constraints.Length;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordConstraint,String> {

    @Override
    public void initialize(PasswordConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
// Vrem ca parola sa contina minim 12 caractere.
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() >= 12;
    }
}
