package com.ext.core.validate;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserTypeValidator.class)
public @interface ValidateUserType {
    String message() default "Invalid user type: it should be either Admin or User";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
