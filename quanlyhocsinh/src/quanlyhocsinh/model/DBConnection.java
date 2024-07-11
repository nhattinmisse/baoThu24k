package quanlyhocsinh.model;


public class DBConnection {
	 private static DBConnection instance;
	    private DBConnection conn;
	    private String username;
	    private String password;
	    private String ipadd;
	    private String port;
	    private String db;

	    private DBConnection() {}

	    public static DBConnection getInstance() {
	        if (instance == null) {
	            instance = new DBConnection();
	        }
	        return instance;
	    }

	    public DBConnection getConnection() {
	        // Implement connection logic here
	        return conn;
	    }
	    
	    
}
