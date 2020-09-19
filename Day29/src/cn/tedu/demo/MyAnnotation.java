package cn.tedu.demo;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author UID-ECD
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
	//定义注解属性的默认值：类型 属性名称() default 默认值
	String value() default "hi";
}
