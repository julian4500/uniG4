/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo4.vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadgrupo4.control.MateriaData;
import universidadgrupo4.modelos.Conexion;
import universidadgrupo4.modelos.Materia;

/**
 *
 * @author Maxi
 */
public class ViewMateria extends javax.swing.JInternalFrame {

    Conexion con;
    
    public ViewMateria(Conexion conexion) {
        initComponents();
        con = conexion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jtAño = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Materias");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("ID");

        jtId.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jtAño.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jbBuscar.setBackground(new java.awt.Color(51, 102, 255));
        jbBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("AÑO");

        jtNombre.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jbNuevo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(jbNuevo)
                .addGap(26, 26, 26)
                .addComponent(jbGuardar)
                .addGap(18, 18, 18)
                .addComponent(jbActualizar)
                .addGap(32, 32, 32)
                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro que desea salir?", "Salir", 2, 3);
        if (opcion==0) {
            dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int id=0;
        String nombre = null;
        boolean val=false;
        MateriaData nuevo = new MateriaData(con);
        Materia mat = null;
        
        try {
            id = Integer.parseInt(jtId.getText()) ;
            val=true;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Campo incorrecto"); 
        }
        
        try {
            mat = nuevo.buscarMateria(id);
            jtNombre.setText(mat.getNombreMateria());
            jtAño.setText(String.valueOf(mat.getAnio()));
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(this, "No se encuentra la materia");
        }
        
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        String nombre = null;
        int año = 0;
        boolean val=false;
        MateriaData nuevo = new MateriaData(con);
        
        
        try {
            nombre = jtNombre.getText();
            año = Integer.parseInt(jtAño.getText()) ;
            val=true;
        } catch (NumberFormatException e){}
        
        if (nombre.isEmpty()||val==false){
           JOptionPane.showMessageDialog(this, "Campo incorrecto");  
        }
        else{
            Materia mat = new Materia(nombre,año,true);
            nuevo.guardarMateria(mat);
            JOptionPane.showMessageDialog(this, "Materia agregada");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int id=0;
        String nombre = null;
        boolean val=false;
        MateriaData nuevo = new MateriaData(con);
        Materia mat = null;
        
        try {
            id = Integer.parseInt(jtId.getText()) ;
            val=true;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Campo incorrecto"); 
        }
        
        try {
            mat = nuevo.buscarMateria(id);
            
            int opcion = JOptionPane.showConfirmDialog(this, "Esta accion dara de baja:\n " 
            + mat.toString() + 
            "\n Estas seguro?", "ATENCION", 2, JOptionPane.WARNING_MESSAGE);
            if (opcion==0) {
                nuevo.desactivarMateria(id);
                JOptionPane.showMessageDialog(this, "Materia desactivada");
            }
            
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(this, "No se encuentra la materia");
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        int id=0;
        int año=0;
        String nombre = null;
        boolean val=false;
        MateriaData nuevo = new MateriaData(con);
        
        try {
            nombre = jtNombre.getText();
            año = Integer.parseInt(jtAño.getText()) ;
            id = Integer.parseInt(jtId.getText());
            val=true;
        } catch (NumberFormatException e){}
        if (nombre.isEmpty()||val==false){
           JOptionPane.showMessageDialog(this, "Campo incorrecto");  
        }else{
            if (nuevo.buscarMateria(id)==null) {
                  JOptionPane.showMessageDialog(this, "No se encuentra la materia");
            }else{
                
                Materia mat = new Materia(id,nombre,año,true);
                int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro que desea modificar:\n " 
                + nuevo.buscarMateria(id).toString(), "ATENCION", 2, JOptionPane.WARNING_MESSAGE);
                    if (opcion==0) {
                        nuevo.actualizarMateria(mat, id);
                        JOptionPane.showMessageDialog(this, "Se ha modificado la materia");
                    }
                
            }
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
       jtId.setText(null);
       jtAño.setText(null);
       jtNombre.setText(null);
       jtId.requestFocus();
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtAño;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
