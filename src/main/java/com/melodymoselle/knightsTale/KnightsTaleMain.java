package com.melodymoselle.knightsTale;

import com.melodymoselle.knightsTale.Knights.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightsTaleMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext(
                "META-INF/spring/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
