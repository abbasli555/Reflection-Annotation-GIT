import java.lang.reflect.Field;

public class Validator {

    public static void validate(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(MinValue.class)) {

                MinValue minValue = field.getAnnotation(MinValue.class);

                field.setAccessible(true);

                try {
                    int value = (int) field.get(obj);

                    if (value < minValue.value()) {
                        throw new IllegalArgumentException(
                                field.getName() + " field minimum "
                                        + minValue.value() + " olmalıdır!"
                        );
                    }

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}