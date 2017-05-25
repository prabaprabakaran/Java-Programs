	package Day14;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
   public class preparedStatement {
		public static void prepared(){
			Connection con=null;
			PreparedStatement ps=null;
			Statement st=null;
			ResultSet rs=null;
			try {
				Scanner sc=new Scanner(System.in);
				int Roll_no=sc.nextInt();
				String Name=sc.next();
				int salary=sc.nextInt();
				Class.forName("oracle.jdbc.driver.OracleDriver");
	     con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	      //ps=con.prepareStatement("create table mathi (Roll_no int,Name varchar(25),salary int)");
	     st=con.createStatement();
	     String str="insert into mathi values(?,?,?)";
	     ps=con.prepareStatement(str);
	     ps.setInt(1,Roll_no);
	     ps.setString(2,Name);
	     ps.setInt(3,40000);
	     rs=  ps.executeQuery();
	     String sql = "select *from mathi";
	      rs = st.executeQuery(sql);
	     
	     while(rs.next())
	    	 System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"         "+rs.getInt(3));
	      
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				
					try {
						if(con!=null){
						con.close();
						}
						if(rs!=null){
							rs.close();
							
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		
	public static void main(String[] args) {
		prepared();
	}
	}
