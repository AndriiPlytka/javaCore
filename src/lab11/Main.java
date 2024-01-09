package lab11;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// а) Анотація для позначення параметрів методів, які не можуть бути null
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface NotNull {
    //тіло анотації
}

class MyClass {
    // @MarkerAnnotation

    public void myMethod(@NotNull String parameter) {

    }
}

// б) Створення анотації-маркера
@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnnotation {
    //тіло анотації
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Використання рефлексії для перевірки присутності анотації @NotNull
        try {
            Method method = MyClass.class.getMethod("myMethod", String.class);
            if (method.getParameterAnnotations()[0][0] instanceof NotNull) {
                System.out.println("The @NotNull annotation is present for the method parameter");
            } else {
                System.out.println("@NotNull annotation missing for method parameter myMethod");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // Використання рефлексії для перевірки присутності анотації-маркера
        try {
            Method method = MyClass.class.getMethod("myMethod", String.class);
            if (method.isAnnotationPresent(MarkerAnnotation.class)) {
                System.out.println("The marker annotation is present for the myMethod method");
            } else {
                System.out.println("Annotation-marker is missing for method myMethod");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}