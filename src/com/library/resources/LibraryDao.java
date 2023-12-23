package com.library.resources;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
