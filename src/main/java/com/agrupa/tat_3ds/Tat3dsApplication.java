package com.agrupa.tat_3ds;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tat3dsApplication {

    public static void main(String[] args) {
        if (!java.awt.GraphicsEnvironment.isHeadless()) {
            DatabaseManagerSwing.main(new String[] {
                    "--url", "jdbc:hsqldb:mem:testdb",
                    "--user", "SA",
                    "--password", "",
                    "--noexit"
            });
        }
        SpringApplication.run(Tat3dsApplication.class, args);
    }

}
