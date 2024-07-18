package quanlyhocsinh.app;

import java.sql.Connection;
import java.sql.SQLException;

import quanlyhocsinh.model.DBConnection;

public class kncsdl {
	public static void main(String[] args) {
		Connection kncsdl;
		try {
			kncsdl = DBConnection.getInstance().getConnection();
			if(kncsdl != null) {
				System.out.println("Ket noi toi may chu CSDL thanh cong");
			}else {
				System.out.println("Loi ket noi");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
