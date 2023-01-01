package com.shubham.lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {
//        Earlier we implement interfaces using annanymous inner classes
        Runnable runnable=new Runnable(){
          @Override
          public void run(){
              System.out.println("Running using inner classs");
          }
        };

        new Thread(runnable).start();


//        using java 8 syntax
        Runnable runnable1=()->{
            System.out.println("Running using lambda");
        };

        new Thread(runnable1).start();
    }
}
