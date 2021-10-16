package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // instanciamos los contenedores de beans, si tenemos más de uno los separamos por comas
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // añadimos el contexto de nuestro servicio
        CalculatorService calculadora = (CalculatorService) context.getBean("calculatorService");

        // instanciamos el metodo holaMundo en una varible String
        String texto = calculadora.holaMundo();
        System.out.println(texto);


    }
}
