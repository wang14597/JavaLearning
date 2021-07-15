package Annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})  //表示该注解只能作用于类上,和方法上
@Retention(value = RetentionPolicy.RUNTIME)  //表示该注解会保留到class字节码文件中，并被JVM读取到
@Documented  // 可被抽取为doc文档
@Inherited  // 子类继承父类时，该注解将自动被继承
public @interface MyAnnotation {
}
