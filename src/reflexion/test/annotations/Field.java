package reflexion.test.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface Field {

	String value() default "";
	
	String format() default "";
	
	Class<?> type() default String.class;
	
}
