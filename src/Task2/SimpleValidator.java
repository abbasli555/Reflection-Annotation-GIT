package Task2;

import java.lang.reflect.Field;

public class SimpleValidator {
    public static void validate(Object obj){
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            if (field.isAnnotationPresent(Required.class)) {
                field.setAccessible(true);

                try{
                    Object value =  field.get(obj);
                    if (value  == null){
                        System.out.println("FIELD " + field.getName() + "is required");
                    }
                }catch (IllegalAccessException e){
                    e.printStackTrace();
                }
            }

        }
    }
}
