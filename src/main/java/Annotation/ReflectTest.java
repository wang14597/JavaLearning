package Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


@Pro(className = "Annotation.Demo1", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 利用注解进行配置工作
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        Pro annotation = reflectTestClass.getAnnotation(Pro.class);
        String className = annotation.className();
        String methodName = annotation.methodName();

        Class<?> cls = Class.forName(className);
        Constructor<?> constructor = cls.getConstructor();
        Object o = constructor.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
