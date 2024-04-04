package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Userdata;
import util.ConnectionClass;


public class DataDao {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	public boolean checkId(int id) {
		try {
			con = ConnectionClass.getConnection();
			pst = con.prepareStatement("select * from userdata where userid=?");
			pst.setInt(1, id);
			ResultSet rs  = pst.executeQuery();
			return rs.next();
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
//		finally {
//			try {
//				if(rs != null)rs.close();
//				if(pst!=null)pst.close();
//				if(con!=null)con.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
	}
	public boolean checkUser(String uname, String upass) {
		try {
			con = ConnectionClass.getConnection();
			pst = con.prepareStatement("select * from userdata where username=? and password=?");
			pst.setString(1, uname);
			pst.setString(2, upass);
			ResultSet val = pst.executeQuery();
			return val.next();
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
//		finally {
//			try {
//				if(rs != null)rs.close();
//				if(pst!=null)pst.close();
//				if(con!=null)con.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
	}
	public Userdata getData(int i) {
		Userdata uda = new Userdata();
		try {
			con = ConnectionClass.getConnection();
			pst = con.prepareStatement("select * from userdata where userid = ?");
			pst.setInt(1, i);
			rs = pst.executeQuery();
			if(rs.next()) {
				uda = new Userdata(rs.getInt("userid"), rs.getString("username"), rs.getString("password"));
			}
			return uda;
		}catch(Exception e) {
			e.printStackTrace();
			return uda;
		}
//		finally {
//			try {
//				if(rs != null)rs.close();
//				if(pst!=null)pst.close();
//				if(con!=null)con.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	public List<Userdata> getAllData(){
		List<Userdata> ans = new ArrayList<>();
		try {
			con = ConnectionClass.getConnection();
			pst = con.prepareStatement("select * from userdata");
			rs = pst.executeQuery();
			while(rs.next()) {
				Userdata ud = new Userdata(rs.getInt(1), rs.getString(2), rs.getString(3));
				ans.add(ud);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ans;
	}
	
	public boolean saveDatatoDB(String name, String password) {
		try {
			con = ConnectionClass.getConnection();
			pst = con.prepareStatement("select max(userid) from userdata");
			rs = pst.executeQuery();
			int maxId = 0;
			if(rs.next()) {
				maxId = rs.getInt(1);
			}else {
				maxId = 0;
			}
			maxId++;
			pst = con.prepareStatement("insert into userdata values(?, ?, ?)");
			pst.setInt(1, maxId);
			pst.setString(2, name);
			pst.setString(3, password);
			int val = pst.executeUpdate();
			return val > 0;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
//		finally {
//			try {
//				if(rs != null)rs.close();
//				if(pst!=null)pst.close();
//				if(con!=null)con.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
	}
	
}
