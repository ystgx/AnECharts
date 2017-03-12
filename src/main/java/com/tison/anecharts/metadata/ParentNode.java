package com.tison.anecharts.metadata;

import java.lang.annotation.*;

/**
 * Created by Tison on 2017/3/13.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ParentNode {

    Class<?> value() default NullObject.class;

}
