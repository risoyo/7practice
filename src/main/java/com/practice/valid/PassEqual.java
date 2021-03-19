package com.practice.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PassValidator.class)
// Constraint是指定该注解所关联的校验类是哪个
public @interface PassEqual {
    int min();
    int max();
    String message() default "pass missmatch";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}