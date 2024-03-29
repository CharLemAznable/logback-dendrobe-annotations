package com.github.charlemaznable.logback.dendrobe;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface VertxLogBean {

    /**
     * 指定Vert.x实例的Apollo配置property或Diamond配置dataId
     */
    String value() default "";
}
