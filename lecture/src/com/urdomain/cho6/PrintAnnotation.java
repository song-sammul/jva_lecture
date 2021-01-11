package com.urdomain.cho6;

@Target({ElemenType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
	
	String value() default "-";
	int number() defalut 15;
	
}
