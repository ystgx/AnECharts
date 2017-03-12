package com.tison.anecharts.option.title;

import com.tison.anecharts.metadata.BooleanEnum;

import java.lang.annotation.*;

/**
 * Created by Tison on 2017/3/13.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Title {

    BooleanEnum show() default BooleanEnum.Null;

    String text() default  "";

    String link() default "";
}
