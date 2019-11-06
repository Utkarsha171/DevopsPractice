package COM.LTI;

import java.sql.*;


import COM.LTI.Results;
import COM.LTI.Movie;
public class MovieDAO 
{
	DatabaseConnector db=new DatabaseConnector();

	Movie user= null;
/*	int id=user.getId();
	String movie=user.getMname();
	String actor=user.getActor();
	String actress=user.getActress();
	String director=user.getDirector();
	String dor=user.getDor();
	int collection=user.getCollection();*/
	
	
	
	
	public String addMovie(Movie u)
	{
		String result="";
		
		try
		{
			String query="Insert into Movies values (?,?,?,?,?,?,?)";
			PreparedStatement pstmt=db.getPreparedStatement(query);
			pstmt.setInt(1,u.getId());
			pstmt.setString(2, u.getMname());
			pstmt.setString(3,u.getActor());
			pstmt.setString(4, u.getActress());
			pstmt.setString(5, u.getDirector());
			pstmt.setInt(6, u.getCollection());
			pstmt.setString(7, u.getDor());
			
			int i=pstmt.executeUpdate();
			
			if(i==1)
			{
				result=Results.SUCCESS;
			}
			else
			{
				result=Results.FAILURE;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result=Results.PROBLEM;
		}
		finally
		{
			db.closeConnection();
		}
		
		return result;
	}
	








}