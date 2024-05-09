package com.app.lecc1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Cargamos el contexto de Spring
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Obtenemos una instancia del bean "SnowValleyResort"
        SkiResort resort = contexto.getBean("SnowValleyResort", SkiResort.class);

        // Creamos un objeto SkiPass
        SkiPass skiPass = new SkiPass();
        skiPass.setType("Temporada");
        skiPass.setDuration(7);

        // Usamos los métodos del bean
        resort.openResort();
        resort.sellSkiPass(skiPass);

        // Cerramos el contexto
        contexto.close();
    }

}
