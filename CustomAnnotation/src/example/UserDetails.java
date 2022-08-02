package example;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) //Use this(CustomAnno) annotation in enumeration
@Retention(RetentionPolicy.RUNTIME) //available at Runtime
@interface UserDetails {

    int myRank() default 0;
    String name() default "Abhishek";
    String city() default "Delhi";

}