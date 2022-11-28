package com.example.finalproject.validation.movie;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MovieDurationValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MovieDurationConstraint {

    String message() default "Invalid duration of a movie in minutes";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
