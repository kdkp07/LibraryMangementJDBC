package com.library.main;

import com.library.resources.Book;
import com.library.resources.LibraryDao;
import com.library.resources.Student;

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
            System.out.println("Press 4 to view students");
            System.out.println("Press 5 to view books");
            System.out.println("Press 6 to view issued books and students");
            System.out.println("Press 7 to exit");

            int choice = Integer.parseInt(br.readLine());
            if(choice==1){
                // Add student
                System.out.println("Enter the name of the student");
                String name = br.readLine();
                System.out.println("Enter Phone number");
                String phone = br.readLine();
                System.out.println("Enter residential city name");
                String city = br.readLine();

                Student std = new Student(name , phone , city);
                boolean ans = LibraryDao.insertStudent(std);
                if(ans){
                    System.out.println("Student added successfully.................");
                }
                else{
                    System.out.println("Something went wrong...Please try again.....");
                }
            }
            else if(choice==2){
                // add book
                System.out.println("Enter book isbn");
                int isbn = Integer.parseInt(br.readLine());
                System.out.println("Enter book name");
                String book_name = br.readLine();
                System.out.println("Enter book author name");
                String author = br.readLine();

                Book b = new Book(isbn,book_name,author);
                boolean ans = LibraryDao.insertBook(b);
                if(ans){
                    System.out.println("Book added successfully.................");
                }
                else{
                    System.out.println("Something went wrong...Please try again.....");
                }

            }
            else if(choice==3){
                // issue book
                System.out.println("Enter student id");
                int id = Integer.parseInt(br.readLine());

            }
            else if(choice==4){
                // view students
                LibraryDao.viewStudents();
            }
            else if(choice==5){
                // view books
                LibraryDao.viewBooks();
            }
            else if(choice==6){
                // view issued books details
            }
            else if(choice==7){
                break;
            }
            else{
                // do nothing eat kitkat
            }
        }
        System.out.println("==================================Thank you for using our service , have a good one==================================");
    }
}
