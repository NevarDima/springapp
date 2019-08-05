package by.nevar.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean1 = context.getBean("testBean", TestBean.class);
        System.out.println(testBean1.getName());
        context.close();
    }
}
