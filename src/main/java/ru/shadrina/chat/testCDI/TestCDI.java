package ru.shadrina.chat.testCDI;

import ru.shadrina.chat.App;
import ru.shadrina.chat.testJson.TestService;

import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.inject.spi.CDI;

public class TestCDI {
    public static void main(String[] args) {
        SeContainerInitializer.newInstance().addPackages(App.class).initialize();

        MegaService mega = CDI.current().select(MegaService.class).get();
        TestService test = CDI.current().select(TestService.class).get();

        System.out.println("singleton megaService " + mega.hashCode());
        System.out.println("usual class testService " + test.hashCode());
        System.out.println("singleton megaService 1: " + CDI.current().select(MegaService.class).get().hashCode());
        System.out.println("singleton megaService 2: " + CDI.current().select(MegaService.class).get().hashCode());
        System.out.println("singleton megaService 3: " + CDI.current().select(MegaService.class).get().hashCode());
        System.out.println("------");
        System.out.println("usual class testService 1: " + CDI.current().select(TestService.class).get().hashCode());
        System.out.println("usual class testService 2: " + CDI.current().select(TestService.class).get().hashCode());
        System.out.println("usual class testService 3: " + CDI.current().select(TestService.class).get().hashCode());
        System.out.println("------");
        System.out.println("объект класса Worker: " + CDI.current().select(Worker.class).get().hashCode());
        System.out.println("Helper из класса Helper: " + CDI.current().select(Helper.class).get().hashCode());
        System.out.println("Helper из поля класса Worker1: " + CDI.current().select(Worker.class).get().getHelper().hashCode());
        System.out.println("Helper из поля класса Worker2: " + CDI.current().select(Worker.class).get().getHelper().hashCode());
    }
}
