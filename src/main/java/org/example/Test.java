package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
       /* Pet pet = context.getBean("cat", Cat.class);
        pet.say();
        */
       Person person = context.getBean( Person.class);
        person.call();


        context.close();


    }
}
