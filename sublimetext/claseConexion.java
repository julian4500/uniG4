import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	private String url="jdbc:mysql://localhost/universidadgrupo4";
	private String usuario="root";
	private String password="";

	private Connection conexion;

	public Conexion() throws ClassNotFoundException{
		Class.forName("org.mariadb.jdbc.Driver");
	}

	//constructor de Conexion
	public Conexion(String url, String usuario, String password) throws ClassNotFoundException{
		this.url = url;
		this.usuario = usuario;
		this.password = password;

		Class.forName("org.mariadb.jdbc.Driver");
	}

	//getter de Conexion
	public Connection getConexion() throws SQLException{
		if(conexion == null){
			conexion = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"+ "&user=" + usuario + "&password=" + password);
		}
		return conexion;
	}

}//fin de la clase Conexion