package org.example.homework6.task3_4;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Service {
    String value() default ("Service");
}
