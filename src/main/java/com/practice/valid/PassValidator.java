package com.practice.valid;


import com.practice.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PassValidator implements ConstraintValidator<PassEqual, PersonDTO> {
    private int min;
    private int max;
    @Override
    public void initialize(PassEqual constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    // ConstraintValidator 传入的第一个变量是作用的注解，第二个参数是作用的对象
    // 这里定义的是对PersonDTO生效，如果是对字段，那么这里是String
    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext){
        String pass1 = personDTO.getPass1();
        String pass2 = personDTO.getPass2();
        if ((pass1.length() < min)|(pass1.length() > max)){
            return false;
        }
        if ((pass2.length() < min)|(pass2.length() > max)){
            return false;
        }
        return pass1.equals(pass2);
    }
}
