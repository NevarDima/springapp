package by.nevar.springapp;

import by.nevar.springapp.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer firstComputer = context.getBean("computer", Computer.class);
//        Computer secondComputer = context.getBean("computer", Computer.class);
//
//        boolean comparison = secondComputer == secondComputer;
//        System.out.println(comparison);
        System.out.println(firstComputer);
        firstComputer.turnOnMusic();
//        System.out.println(secondComputer);
//
//        System.out.println(firstComputer.musicPlayer.getVol());
//        System.out.println(secondComputer.musicPlayer.getVol());
//        secondComputer.musicPlayer.setVol("vol.100");
//        System.out.println(firstComputer.toString());
//        System.out.println(secondComputer.toString());
        context.close();
    }
}
