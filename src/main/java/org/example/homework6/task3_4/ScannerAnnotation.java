package org.example.homework6.task3_4;

import org.example.reflection.annotation.Value;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScannerAnnotation<T> {
    private HashMap<String, T> map;

    public ScannerAnnotation() {
    }

    public HashMap<String, T> getMap() {
        return map;
    }

    public void setMap(HashMap<String, T> map) {
        this.map = map;
    }

    private void scanClass(T obj) {
        Annotation service = null;
        Class<?> classTmp = obj.getClass();
        if (classTmp.getAnnotations().length == 0) {
            System.out.println("Class " + classTmp.getSimpleName() + " doesn't have any annotations");
            return;
        }
        Annotation[] annotations = classTmp.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation.annotationType().getSimpleName().equals("Service")) ;
            service = annotation;
            break;
        }
        if (!service.annotationType().getSimpleName().equals("Service")) {
            System.out.println("Class " + classTmp.getSimpleName() + " doesn't have annotation @Service");
            return;
        }
        map.put(classTmp.getSimpleName(), obj);
    }

    private void getInitMethods() {
        this.getMap().values().stream().forEach(obj -> {
            try {
                findMethodsWithInitAnnotationInit(obj);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }

    private void findMethodsWithInitAnnotationInit(T obj) throws Exception {
        Class<?> classTmp = obj.getClass();
        Method[] methods = classTmp.getDeclaredMethods();
        for (Method m : methods) {
            Annotation[] annotation = m.getDeclaredAnnotations();
            for (Annotation a : annotation) {
                if (a.annotationType().getSimpleName().equals("Init")) {
                    m.setAccessible(true);
                    m.invoke(obj);
                    m.setAccessible(false);
                }
                ;
            }
        }
    }

    private void getInitFields() {
        this.getMap().values().stream().forEach(obj -> {
            try {
                setFieldsWithAnnotationValue(obj);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }

    private void setFieldsWithAnnotationValue(T obj) throws Exception {
        Class<?> classTmp = obj.getClass();
        Field[] fields = classTmp.getDeclaredFields();
        for (Field f : fields) {
            Annotation[] annotation = f.getDeclaredAnnotations();
            for (Annotation a : annotation) {
                if (a.annotationType().getSimpleName().equals("Value")) {
                    f.setAccessible(true);
                    f.set(obj, f.getAnnotation(Value.class).value());
                    f.setAccessible(false);
                }
                ;
            }
        }
    }

    public static void main(String[] args) {
        ScannerAnnotation scanner = new ScannerAnnotation();
        scanner.setMap(new HashMap());
        Papa papa = new Papa("Petya");
        scanner.scanClass(papa);

        Son son = new Son("Vasya");
        scanner.scanClass(son);

        Uncle uncle = new Uncle("Vanya");
        scanner.scanClass(uncle);

        Aunt aunt = new Aunt("Asya");
        scanner.scanClass(aunt);
        System.out.println(scanner.getMap());

        scanner.getInitMethods();

        scanner.getInitFields();
        System.out.println(scanner.getMap());
    }
}
