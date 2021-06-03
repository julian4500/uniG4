import java.time.Localdate;

public class Alumno{
	protected int adAlumno;
	protected int legajo;
	protected String nombre;
	protected String apellido;
	protected boolean etado;
	protected Localdate fechNac;

	public Alumno(){} //Constructor vacio
    

    //Constructor con idAlumno
	public Alumno(int idAlumno, int legajo, String nombre, Localdate fechNac, boolean estado){
		this.idAlumno = idAlumno;
		this.legajo = legajo;
		this.nombre = nombre;
		this.fechNac = fechNac;
		this.estado = estado;
	}


	//constructor sin idAlumno
	public Alumno(int legajo, String nombre, String apellido, Localdate fechNac, boolean estado){
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechNac = fechNac;
		this.estado = estado;
	}

	//setter de fecha
	public void setFechNac(Localdate fechNac){
		this.fechNac;
	}
    
    //getter de idAlumno
	public int getIdAlumno(){
		return idAlumno;
	}

	//setter de idAlumno
	public void setIdAlumno(int idAlumno){
		this.idAlumno = idAlumno;
	}
    
    //getter legajo
	public int getLegajo(){
		return legajo;
	}

	//setter de legajo
	public void setLegajo(int legajo){
		this.legajo = legajo;
	}
     
     //getter de nombre
	public String getNombre(){
         return nombre;
    }

    //setter de nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //getter de apellido
    public String getApellido(){
    	return apellido;
    }

    //setter de apellido
    public void setApellido(String apellido){
    	this.apellido = apellido;
    }

    //getter de estado
    public boolean getEstado(){
    	return estado;
    }

    //setter de estado
    public void setEstado(boolean estado){
    	this.estado = estado;
    }

    //getter de fecha
    public Localdate getFechNac(){
    	return fechNac;
    }

    //Modificar el metodo toString para mostrar
    public String toString(){
    	return "ID"+ idAlumno + "_" + nombre + " "+ apellido;
    }

}//fn de la clase Alumno