package com.example.finalproject.validation.user;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * Validation for user password.
 * Need upper case, special characters and a minimum of 8 characters
 */
@Documented
@Constraint(validatedBy = UserPasswordValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserPasswordConstraint {

    String message() default "You need upper case, special characters and a minimum of 8 characters!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
