public class Cursada{
	protected Integer idCursada=null;
	protected Alumno alumno;
	protected Materia materia;
	protected float nota;
	protected int adAlumno=0;
	protected int idMateria=0;

	//constructor de Cursada con idCursada
	public Cursada(int idCursada, Alumno alumno, Materia materia, float nota){
		this.idCursada = idCursada;
		this.alumno = alumno;
		this.materia = materia;
		this.nota = nota;
	}

	//constructor de Cursada sin idCursada
	public Cursada(Alumno alumno, Materia materia, float nota){
		this.alumno = alumno;
		this.materia = materia;
		this.nota = nota;
	}

	//constructor vacio
	public Cursada(){}

	//setter de objeto alumno
	public void setAlumno(Alumno alumno){
		this.alumno = alumno;
	}

	//setter del objeto materia
	public void setMateria(Materia materia){
		this.materia = materia;
	}

	//getter de idCursada
	public int getIdCursada(){
		return idCursada;
	}

	//setter de idCursada
	public void setIdCursada(int idCursada){
		this.idCursada = idCursada;
	}

	//getter del objeto alumno
	public Alumno getAlumno(){
		return alumno;
	}

	//setter de idAlumno
	public void setIdAlumno(Alumno alumno){
		this.idAlumno = alumno.getIdAlumno();
	}

	//getter del objeto materia
	public Materia getMateria(){
		return materia;
	}
    
    //setter de idMateria
	public void setIdMateria(Materia materia){
		this.materia = materia.getIdMateria();
	}

	//getter de nota
	public float getNota(){
		return nota;
	}

	//setter de nota
	public void setNota(float nota){
		this.nota = nota;
	}

	//modificar el metodo toString para mostar datos
	@Override
	public String toString(){
		return "idcursada=" + idcursada + ", alumno" + alumno + ", materia=" + materia + ", nota=" + nota;
	}

}//fin de la clase Cursada