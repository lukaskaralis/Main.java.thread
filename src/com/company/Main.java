package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static File f1 = new File("input.txt");
    public static File f2 = new File("input1.txt");
    public static File f3 = new File("input2.txt");
    public static File f4 = new File("input3.txt");
    public static File f5 = new File("input4.txt");
    public static String c1 = "Java";
        public static void main(String[] args)
        {
            Main.threads();
        }
        public static void threads(){
            System.out.println("Write word to find: ");
            Scanner myObj = new Scanner(System.in);
            c1 = myObj.nextLine();
            Thread thread = new Thread();
            Thread1 thread1 = new Thread1();
            Thread2 thread2 = new Thread2();
            Thread3 thread3 = new Thread3();
            Thread4 thread4 = new Thread4();
            java.lang.Thread javathread = new java.lang.Thread(thread);
            java.lang.Thread javathread1 = new java.lang.Thread(thread1);
            java.lang.Thread javathread2 = new java.lang.Thread(thread2);
            java.lang.Thread javathread3 = new java.lang.Thread(thread3);
            java.lang.Thread javathread4 = new java.lang.Thread(thread4);
            javathread.setName("1 Thread");
            javathread1.setName("2 Thread");
            javathread2.setName("3 Thread");
            javathread3.setName("4 Thread");
            javathread4.setName("5 Thread");
            if(f1.exists()){
                javathread.start();
            }if(f2.exists()){
                javathread1.start();
            }if(f3.exists()){
                javathread2.start();
            }if(f4.exists()){
                javathread3.start();
            }if(f5.exists()){
                javathread4.start();
            }
        }
}
