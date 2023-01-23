package com.js.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.js.dto.Bike;

public class BikeCRUD {
	final static String path="com.mysql.cj.jdbc.Driver";
	final static String address="jdbc:mysql://localhost:3306/bike_showroom?user=root&password=rockyyadav1";
	Connection c=null;
	public int insertBike(Bike b) {
		try {
			Class.forName(path);
			c=DriverManager.getConnection(address);
			PreparedStatement ps=c.prepareStatement("insert into bike values (?,?,?,?)");
			ps.setInt(1, b.getBid());
			ps.setString(2, b.getModelname());
			ps.setInt(3, b.getCc());
			ps.setDouble(4, b.getPrice());
			
			return ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	public ArrayList<Bike> viewAll(){
		ArrayList<Bike> al=new ArrayList<>();
		try {
			Class.forName(path);
			c=DriverManager.getConnection(address);
			PreparedStatement ps=c.prepareStatement("select * from bike");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Bike b=new Bike();
				b.setBid(rs.getInt(1));
				b.setModelname(rs.getString(2));
				b.setCc(rs.getInt(3));
				b.setPrice(rs.getDouble(4));
				al.add(b);
				
			}
			return al;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}  catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}
	
	public int deleteBike(int bid) {
		try {
			Class.forName(path);
			c=DriverManager.getConnection(address);
			PreparedStatement ps=c.prepareStatement("delete from bike where bid=?");
			ps.setInt(1, bid);
			
			return ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
		
	}
	
	public int updateBike(int bid,Bike b) {
		try {
			Class.forName(path);
			c=DriverManager.getConnection(address);
			PreparedStatement ps=c.prepareStatement("update bike set modelname=?,cc=?,price=? where bid=?");
			ps.setString(1, b.getModelname());
			ps.setInt(2, b.getCc());
			ps.setDouble(3, b.getPrice());
			ps.setInt(4, bid);
			
			return ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
		
	}
	
	public Bike getBikeByID(int bid) {
		Bike b=null;
		try {
			Class.forName(path);
			c=DriverManager.getConnection(address);
			PreparedStatement ps = c.prepareStatement("select * from bike where bid=?");
			ps.setInt(1, bid);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				b=new Bike();
				b.setBid(rs.getInt(1));
				b.setModelname(rs.getString(2));
				b.setCc(rs.getInt(3));
				b.setPrice(rs.getDouble(4));
				return b;
			}
			else
				return b;
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return b;
	}
	

}
