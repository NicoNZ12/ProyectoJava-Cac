package com.mycompany.proyectofinal;

import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OradoresGUI extends javax.swing.JFrame {

    public OradoresGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IdLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        ciudadLabel = new javax.swing.JLabel();
        temaLabel = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTema = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        IdLabel.setBackground(new java.awt.Color(102, 102, 102));
        IdLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(51, 51, 51));
        IdLabel.setText("ID");

        nombreLabel.setBackground(new java.awt.Color(102, 102, 102));
        nombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(51, 51, 51));
        nombreLabel.setText("Nombre");

        edadLabel.setBackground(new java.awt.Color(102, 102, 102));
        edadLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel.setText("Edad");

        ciudadLabel.setBackground(new java.awt.Color(102, 102, 102));
        ciudadLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ciudadLabel.setForeground(new java.awt.Color(51, 51, 51));
        ciudadLabel.setText("Ciudad");

        temaLabel.setBackground(new java.awt.Color(102, 102, 102));
        temaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        temaLabel.setForeground(new java.awt.Color(51, 51, 51));
        temaLabel.setText("Tema");

        txtId.setEnabled(false);
        txtId.setFocusable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtTema.setColumns(20);
        txtTema.setRows(5);
        jScrollPane1.setViewportView(txtTema);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdLabel)
                    .addComponent(nombreLabel)
                    .addComponent(ciudadLabel)
                    .addComponent(temaLabel)
                    .addComponent(edadLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(txtId)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdLabel)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadLabel)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ciudadLabel)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temaLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        btnAgregar.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(0, 0, 102));
        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(153, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Edad", "Ciudad", "Tema"
            }
        ));
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaDatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    //Acción de los botones
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        String edad = txtEdad.getText();
        String ciudad = txtCiudad.getText();
        String tema = txtTema.getText();
        agregar(nombre, edad, ciudad, tema);
        nuevo();
        mostrar();
        try {
            crearXML();
        } catch (IOException ex) {
            Logger.getLogger(OradoresGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrar();
        try {
            crearXML();
        } catch (IOException ex) {
            Logger.getLogger(OradoresGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        nuevo();
        mostrar();
        try {
            crearXML();
        } catch (IOException ex) {
            Logger.getLogger(OradoresGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        int fila = tablaDatos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Carrera no seleccionada");
        } else {
            int id = Integer.parseInt((String) tablaDatos.getValueAt(fila, 0).toString());
            String nombre = (String) tablaDatos.getValueAt(fila, 1);
            int edad = Integer.parseInt((String) tablaDatos.getValueAt(fila, 2).toString());
            String ciudad = (String) tablaDatos.getValueAt(fila, 3);
            String tema = (String) tablaDatos.getValueAt(fila, 4);
            txtId.setText("" + id);
            txtNombre.setText(nombre);
            txtEdad.setText("" + edad);
            txtCiudad.setText(ciudad);
            txtTema.setText(tema);
        }
    }//GEN-LAST:event_tablaDatosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        nuevo();
        mostrar();
        try {
            crearXML();
        } catch (IOException ex) {
            Logger.getLogger(OradoresGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Métodos (Lógica)
    public void nuevo() { //Método para dejar en blanco los TextFields
        txtNombre.setText("");
        txtEdad.setText("");
        txtCiudad.setText("");
        txtTema.setText("");
        txtId.setText("");
    }

    public void agregar(String txtNombre, String txtEdad, String txtCiudad, String txtTema) {
        String sql = "INSERT INTO oradores(nombre, edad, ciudad, tema) VALUES(?, ?, ?, ?)";

        Main con = new Main();
        Connection conexion = con.establecerConexion();

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, txtNombre);
            preparedStatement.setString(2, txtEdad);
            preparedStatement.setString(3, txtCiudad);
            preparedStatement.setString(4, txtTema);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Orador agregado exitosamente!");
            } else {
                JOptionPane.showMessageDialog(null, "NO se ha podido agregar al nuevo orador");
            }

            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mostrar() {
        String sql = "SELECT * FROM oradores";

        Main con = new Main();
        Connection conexion = con.establecerConexion();

        System.out.println(sql);

        DefaultTableModel model = new DefaultTableModel();

        try {
            Statement st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            int numColumnas = metaData.getColumnCount();

            for (int column = 1; column <= numColumnas; column++) {
                model.addColumn(metaData.getColumnName(column));
            }

            while (rs.next()) {
                Object[] rowData = new Object[numColumnas];
                for (int i = 0; i < numColumnas; i++) {
                    rowData[i] = rs.getObject(i + 1);
                }
                model.addRow(rowData);
            }
            tablaDatos.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int obtenerId() {
        int filaSeleccionada = tablaDatos.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
            return -1;
        }

        int id = (int) tablaDatos.getValueAt(filaSeleccionada, 0);
        return id;
    }

    public void actualizar() {
        String nuevoNombre = txtNombre.getText();
        String nuevaEdad = txtEdad.getText();
        String nuevaCiudad = txtCiudad.getText();
        String nuevoTema = txtTema.getText();

        if (nuevoNombre.isEmpty() || nuevaEdad.isEmpty() || nuevaCiudad.isEmpty() || nuevoTema.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar los nuevos datos");
        } else {
            Main con = new Main();
            Connection conexion = con.establecerConexion();

            if (conexion != null) {
                try {
                    int idSeleccionado = obtenerId();
                    if (idSeleccionado != -1) {
                        String sql = "UPDATE oradores SET nombre = ?, edad = ?, ciudad = ?, tema = ? WHERE id = ?";

                        PreparedStatement ps = conexion.prepareStatement(sql);
                        ps.setString(1, nuevoNombre);
                        ps.setString(2, nuevaEdad);
                        ps.setString(3, nuevaCiudad);
                        ps.setString(4, nuevoTema);
                        ps.setInt(5, idSeleccionado);

                        int filasAfectadas = ps.executeUpdate();

                        if (filasAfectadas > 0) {
                            JOptionPane.showMessageDialog(null, "Datos modificados exitosamente!");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo modificar los datos");
                        }
                    }

                    conexion.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void eliminar() {
        int filaSeleccionada = tablaDatos.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            int idEliminar = (int) tablaDatos.getValueAt(filaSeleccionada, 0);

            String sql = "DELETE FROM oradores WHERE id = " + idEliminar;

            try {
                Main con = new Main();
                Connection conexion = con.establecerConexion();

                Statement st = conexion.createStatement();

                int filasAfectadas = st.executeUpdate(sql);

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Orador eliminado exitosamente!");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar al orador");
                }

                st.close();
                conexion.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //Archivo XML
    public void crearXML() throws IOException {
        String filePath = "C:/Users/54260/ProyectoJava-Cac/oradores.xml";

        Path path = Paths.get(filePath);
        Files.delete(path);

        try {
            Main con = new Main();
            Connection conexion = con.establecerConexion();
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM oradores");
            ResultSet rs = pst.executeQuery();

            String line = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
            FileWriter cb = new FileWriter(filePath, true);
            cb.write(line);
            cb.close();

            line = "<oradores>";
            FileWriter ap = new FileWriter(filePath, true);
            ap.write(line);
            ap.close();

            while (rs.next()) {
                line = "<orador>" 
                        + "<nombre>" + rs.getString("nombre") + "</nombre>" 
                        + "<edad>" + rs.getString("edad") + "</edad>"
                        + "<ciudad>" + rs.getString("ciudad") + "</ciudad>"
                        + "<tema>" + rs.getString("tema") + "</tema>"
                        + "</orador>";
                FileWriter fw = new FileWriter(filePath, true);
                fw.write(line);
                fw.close();
            }

            line = "</oradores>";
            FileWriter cl = new FileWriter(filePath, true);
            cl.write(line);
            cl.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            e.printStackTrace();
        }

    }

    //Main
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(OradoresGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(OradoresGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(OradoresGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(OradoresGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OradoresGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdLabel;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel ciudadLabel;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JLabel temaLabel;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtTema;
    // End of variables declaration//GEN-END:variables
}
