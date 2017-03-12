package com.tison.anecharts.metadata;

import java.lang.annotation.*;

/**
 * Created by Tison on 2017/3/13.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Documented
public @interface NodeName {

    String value() default "";

}
