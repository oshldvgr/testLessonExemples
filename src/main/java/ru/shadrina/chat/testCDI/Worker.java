package ru.shadrina.chat.testCDI;

import ru.shadrina.chat.testCDI.Helper;

import javax.inject.Inject;

//синглтон класс наблюдаемый CDI. Он использует в своем поле сингл-тон объект класса Helper

public class Worker {
    //чтобы этот объект здесь заиспользовать без геттеров, пишем Inject.
    // при компиляции CDI сам туда встаивт синглтон объект Helper'a

    @Inject
    private Helper helper;
    private String help;

    public Helper getHelper() {
        return helper;
    }
}
