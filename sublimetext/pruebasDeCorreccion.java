 private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int id = Integer.parseInt(jTid.getText());
        Materia materia = materiaData.buscarMateria(id);
        if (materia != null) {
            jTid.setText(materia.getIdMateria() + "");
            jTnombre.setText(materia.getNombreMateria());
        }
    } 


//metodo buscarMateria de universidadgrupo4 Vistas
 private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int id=0;
        String nombre = null;
        boolean val=false;
        MateriaData nuevo = new MateriaData(con);
        Materia mat = null;
           
        try {
            id = Integer.parseInt(jtId.getText()) ;
            val=true;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Campo ID incorrecto"); 
        }
        
        try {
            mat = nuevo.buscarMateria(id);
            jtNombre.setText(mat.getNombreMateria());
            jtAño.setText(String.valueOf(mat.getAnio()));
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(this, "No se encuentra la materia");
        }
        
        
    } 


     //metodo borrar alumno de universidadgrupo4 Vistas
     private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int id=0;
        String nombre = null;
        boolean val=false;
        AlumnoData nuevo = new AlumnoData(con);
        Alumno al = null;
        
        try {
            id = Integer.parseInt(jtId.getText()) ;
            val=true;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Campo incorrecto"); 
        }
        
        try {
            al = nuevo.buscarAlumno(id);
            
            if (al!=null){
                int opcion = JOptionPane.showConfirmDialog(this, "Esta accion dara de baja:\n " 
                + al.toString() + 
                "\n Estas seguro?", "ATENCION", 2, JOptionPane.WARNING_MESSAGE);
                if (opcion==0) {
                    nuevo.borrarAlumno(id);
                    JOptionPane.showMessageDialog(this, "Alumno dado de baja");
                }
            } else{
                JOptionPane.showMessageDialog(this, "No se encuentra el alumno");
            }
        } catch (NullPointerException e){}
    }                                        
                 