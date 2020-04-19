package com.doctor.komidori_doctor.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
public @interface CheckAdmin {
}
