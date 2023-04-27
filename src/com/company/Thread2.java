package com.company;

import java.io.*;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        File f1=new File("input2.txt");
        String[] words=null;
        FileReader fr = null;
        try {
            fr = new FileReader(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        String s = new String();
        String input=Main.c1;
        int count=0;
        while(true)
        {
            try {
                if (!((s=br.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            words=s.split(" ");
            for (String word : words)
            {
                if (word.equals(input))
                {
                    count++;
                }
            }
        }
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileWriter fw = new FileWriter("new.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("In the third file we found "+count+" words '"+Main.c1+"'");
            out.println("---------------------------------------------------------");
        } catch (IOException e) {
        }
        for(int i = 0; i < count; i++) {
            System.out.println("Third file words '"+Main.c1+"': "+i);
            try(FileWriter fw = new FileWriter("news.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
            {
                out.println("Third file words '"+Main.c1+"': "+i);
                out.println("---------------------------------------------------------");
            } catch (IOException e) {
            }
            try {
                java.lang.Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("In the second file is "+count+ " words " +"'"+Main.c1+"'");
    }
}
