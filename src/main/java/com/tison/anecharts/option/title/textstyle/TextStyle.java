package com.tison.anecharts.option.title.textstyle;

import com.tison.anecharts.metadata.NodeName;
import com.tison.anecharts.metadata.ParentNode;
import com.tison.anecharts.option.title.Title;

import java.lang.annotation.*;

/**
 * Created by Tison on 2017/3/13.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@ParentNode(Title.class)
public @interface TextStyle {
    String color () default "";

    String fontStyle () default "";

    String fontWeight () default  "";

    String fontFamily () default  "";


}
