
package com.mycompany.smarttraders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterDao {
    
    Connection conn;
    void connect(){ 
            try{ 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://FLEXY-DAVE\\DAVIDINST;DatabaseName=smartTradersDB;user=sa;password=david642004";
            conn = DriverManager.getConnection(url);
            
            }catch(Exception e){ 
            
                e.printStackTrace();
            }
        
    }
    
        
    boolean submitData(String fname, String fullname, String email, String pnum, String pword){  
        try{ 
            connect();
            String query = "insert into customerCredentials(uname,fullname,email,pnum,pword) values(?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, fname);
            st.setString(2, fullname);
            st.setString(3, email);
            st.setString(4, pnum);
            st.setString(5, pword);
            int i = st.executeUpdate();
            if(i >= 1){ 
                return true;
            }else{  
                return false;
            }
            
        }catch(Exception e){ 
            e.printStackTrace();
        }
        
        return false;
        
    }
    
    
    boolean checkData(String email, String pword){  
        try{ 
           connect();
            String query = "select * from customerCredentials where email = ? and pword = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, email);
            st.setString(2, pword);
            ResultSet rs = st.executeQuery();
            if(rs.next()){ 
                System.out.println("true");
                return true;
            }else{  
                System.out.println("false");
                return false;
            }
            
        }catch(Exception e){ 
            e.printStackTrace();
        }
        
        return true;
        
    }
}
