package com.dayone;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@EnableCaching
public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);

            System.out.println("Main -> " + Thread.currentThread().getName());








//
//      for (int i = 0; i < 10; i++) {
//          System.out.println("HELLO -> "+ i);
//          try{
//              Thread.sleep(1000);
//          } catch (InterruptedException e){
//              e.printStackTrace();
//          }
//      }


    }
}
