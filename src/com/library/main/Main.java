package com.library.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("===========================Welcome to the Library Management System===========================");
        System.out.println("");
        System.out.println("=====================Please pick choice(s) to explore the app=====================");
        while(true){
            System.out.println("Press 1 to add the student");
            System.out.println("Press 2 to add the book");
            System.out.println("Press 3 to issue book to student");
            System.out.println("Press 4 to exit");

            int choice = Integer.parseInt(br.readLine());
            if(choice==1){
                // Add student
            }
            else if(choice==2){
                // add book
            }
            else if(choice==3){
                // issue book
            }
            else if(choice==4){
                break;
            }
            else{
                // do nothing eat kitkat
            }
        }

    }
}
