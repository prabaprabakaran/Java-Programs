package Day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class jdbcConnection {
public void jdbc(){
	Connection con=null;
	Statement sta=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
	
		sta=con.createStatement();
		String str="CREATE TABLE STUDENT1"+"(id INTEGER , "+" NAME VARCHAR(25),"+" age INTEGER)";
		sta.executeQuery(str);
		//String str1="insert into student values(\"1\",\"praba\",\"20\")";
		//sta.addBatch(str1);
		//int i[]=sta.executeBatch();
		//System.out.println(Arrays.toString(i));
       
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	finally{
		
			try {
				if(con!=null){
				con.close();
				if(sta!=null){
					sta.close();
				}
			} }
			catch (SQLException e) {
				e.printStackTrace();
			}
		}}
public static void main(String[] args) {
	jdbcConnection jd=new jdbcConnection();
	//jd.jdbc();
	jd.insert();
}
@SuppressWarnings("null")
public void insert(){
	Connection con=null;
Statement sta=null;
	ResultSet rs=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		sta= con.createStatement();
String sql1= "INSERT INTO student1(ID,NAME,AGE)VALUES (13,'Mathi',22)";
	//sta.addBatch(sql1);
String sql2="select * from student1";

String sql4="delete from student1 where id=12";
sta.executeUpdate(sql4);

	
	
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	finally{
		
			try {
				if(con!=null){
				con.close();
				if(sta!=null){
					sta.close();
				}
				
			} }
			catch (SQLException e) {
				e.printStackTrace();
			}
		}}	
}

