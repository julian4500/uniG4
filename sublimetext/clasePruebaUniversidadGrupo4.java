import universidadgrupo4.control.MateriaData;
import universidadgrupo4.control.AlumnoData;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.List;
import universidadgrupo4.control.CursadaData;


public class PruebaUniversidadGrupo4{

	public static void main(String[] args) {
		
		Conexion conexion = null;
		try{
			conexion = new Conexion("jdbc:mysql://localhost/universidadgrupo4", "root", "");
		}catch (ClassNotFoundException ex){
			JOptionPane.showMessageDialog(null, "Error sw driver");
		}
        
        //se crea un objeto fecha de la clase LocalDate
		LocalDate fecha = LocalDate.of(2020,2,12);

        
        //se crean alumnos
		Alumno b = new Alumno(28043266,"Jorge","Berro",fecha,true);
		Alumno j = new Alumno(28143288,"Daniel","Richieri",fecha,true);
		AlumnoData aD = new AlumnoData(conexion);
		System.out.println(aD.buscarAlumno(34104821));

		//aD.actualizarAlumno(b, 26);
		//aD.acualizarAlumno(j, 25);
		//aD.guardarAlumno(j);

		//Materia m1 = new Materia("LAB II",3,false);
		//Materia m2 = new Materia("Ingles II",1,false);
		//Materia m3 = new Materia("Matematicas I",1,true);

		//MateriaData am = new MateriaData(conexion);
		//am.guardaMateria(m1);
		//am.guardarMateria(m4);


		//Cursada c = new Cursada(b,m3,8);
		//CursadaData cd = new CursadaData(conexion);
		//System.out.println(cd.CheckCursada(1,22));


		//System.out.println(aD.borrarAlumno(26));

	}
}