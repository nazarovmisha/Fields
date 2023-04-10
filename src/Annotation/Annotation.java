package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String value();
}

@Author("Mihail Nazarov")
public class Annotation {
    public static void main(String[] args) {
        Annotation map = new Annotation();

        Class<?> clazz = map.getClass();
        Author annotation = clazz.getAnnotation(Author.class);

        System.out.println("Author: " + annotation.value());
    }
}
