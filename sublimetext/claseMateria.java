public class Materia{
	protected int idMateria;
	protected String nombreMateria;
	protected int anio;
	protected boolean estado;
    
    //Constructor vacio
	public Materia(){}
    
    //Constructor con idMateria
	public Materia(int idMateria, String nombreMateria, int anio, boolean estado){
		this.idMateria = idMateria;
		this.nombreMateria = nombreMateria;
		this.anio = anio;
		this.estado = estado;
	}

	//Constructor sin idMateria
	public Materia(String nombreMateria, int anio, boolean estado){
		this.nombreMateria = nombreMateria;
		this.anio = anio;
		this.estado = estado;
	}

	//modificar el motodo toString para mostrar los datos
	@Override
	public String toString(){
		return "ID" + idMateria + "_" + nombreMateria;
	}

	//getter de idMateria
	public int getIdMateria(){
		return idMateria;
	}

	//setter de idMateria
	public void setIdMateria(int idMateria){
		this.idMateria = idMateria;
	}
    
    //getter nombreMateria
	public String getNombreMateria(){
		return nombreMateria;
	}

	//setter de nombreMateria
	public void setNombreMateria(String nombreMateria){
		this.nombreMateria = nombreMateria;
	}

	//getter de anio
	public int getAnio(){
		return anio;
	}

	//setter de anio
	public void setAnio(int anio){
		this.anio = anio;
	}

	//gettter de estado
	public boolean getEstado(){
		return estado;
	}

	//setter de estado
	public void setEstado(boolean estado){
		this.estado = estado;
	}

}//fin de la clase Materia