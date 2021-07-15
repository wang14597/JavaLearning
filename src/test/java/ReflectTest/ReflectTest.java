package ReflectTest;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream input=new BufferedInputStream(
                new FileInputStream("./src/pro.properties"));
        properties.load(input);
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        Class<?> cls = Class.forName(className);
        Constructor<?> constructor = cls.getConstructor();
        Object o = constructor.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
