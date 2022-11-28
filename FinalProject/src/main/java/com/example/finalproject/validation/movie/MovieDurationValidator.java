package com.example.finalproject.validation.movie;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MovieDurationValidator implements ConstraintValidator<MovieDurationConstraint, Integer> {

    @Override
    public void initialize(MovieDurationConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer duration, ConstraintValidatorContext constraintValidatorContext) {
        return duration != null &&
                duration.toString().matches("[0-9]*");
    }
}
