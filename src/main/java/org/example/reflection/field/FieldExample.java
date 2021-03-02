package org.example.reflection.field;

import org.example.reflection.User;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldExample {
    public static void main(String[] args) throws Exception {
        Field fieldName= User.class.getField("name");

        String nameValue= (String) fieldName.get(new User("Jack"));
        System.out.println(nameValue);

        Field fieldId=User.class.getDeclaredField("id");
        fieldId.setAccessible(true);
        int idValue= (int) fieldId.get(new User("Jack"));
        fieldId.setAccessible(false);
        System.out.println(idValue);

        Field []fields=User.class.getDeclaredFields();
        for (Field field:fields){
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getName());
        }
        User user = new User("Bill");
        System.out.println("Before "+user);

        fieldName.set(user,"Jack");
        System.out.println("After "+user);
    }
}
