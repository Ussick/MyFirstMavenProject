package org.example.homework6.task3_4;

import com.google.gson.annotations.Since;
import org.example.reflection.annotation.Value;

@Service
@Since(2.0)
public class Papa {
    @Value("Jhon")
    String name;

    public Papa(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Class<Papa> papaClass=Papa.class;
        System.out.println(papaClass.getDeclaredAnnotations().length);// output 2
    }
    @Init
    private void init(){
        System.out.println("in method init with @Init" +Papa.class.getSimpleName());
    }

    @Override
    public String toString() {
        return "Papa{" +
                "name='" + name + '\'' +
                '}';
    }
}
