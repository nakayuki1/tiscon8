package com.tiscon.validator;

import org.springframework.util.ObjectUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PositiveOrZeroValidator implements ConstraintValidator<PositiveOrZero, String> {
    @Override
    public void initialize(PositiveOrZero constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (ObjectUtils.isEmpty(s)) {
            return false;
        }
        return s.matches("[0-9]+");
    }
}