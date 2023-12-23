package com.library.resources;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LibraryDao {

    public static boolean insertStudent(Student st){
        boolean flag = false;
        try{
            Connection con = ConnectionProvider.createConnection();
            String q = "Insert into Student (sname , sphone , scity) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,st.getSname());
            pstmt.setString(2,st.getSphone());
            pstmt.setString(3, st.getCity());

            pstmt.executeUpdate();
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }

    public static boolean insertBook(Book b) {
        boolean flag = false;
        try{
            Connection con = ConnectionProvider.createConnection();
            String q = "Insert into Book (isbn , book_name , author) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,b.getIsbn());
            pstmt.setString(2,b.getBook_name());
            pstmt.setString(3, b.getAuthor());

            pstmt.executeUpdate();
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return flag;

    }

    public static void viewStudents() {
        try{
            // jdbc code here
            Connection con = ConnectionProvider.createConnection();
            String q = "select * from Student;";

            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);

            while(set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString(4);

                System.out.println("Id : "+ id);
                System.out.println("Name : "+ name);
                System.out.println("Phone : "+phone);
                System.out.println("City : "+city);

                System.out.println("=================================================");

            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void viewBooks() {
        try{
            Connection conn = ConnectionProvider.createConnection();
            String q = "Select * from Book";
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(q);

            while(set.next()){
                int isbn = set.getInt(1);
                String book_name = set.getString(2);
                String author = set.getString(3);
                System.out.println("ISBN : "+isbn);
                System.out.println("Book name : "+book_name);
                System.out.println("Author name : "+author);

                System.out.println("=================================================");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
