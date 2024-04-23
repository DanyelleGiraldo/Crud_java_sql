/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_crud_mysql;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CAlumnos { 
    int codigo;
    String NombreAlumno;
    String apellidosAlumnos;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreAlumno() {
        return NombreAlumno;
    }

    public void setNombreAlumno(String NombreAlumno) {
        this.NombreAlumno = NombreAlumno;
    }

    public String getApellidosAlumnos() {
        return apellidosAlumnos;
    }

    public void setApellidosAlumnos(String apellidosAlumnos) {
        this.apellidosAlumnos = apellidosAlumnos;
    }

    public void InsertarAlumno(JTextField paramNombres, JTextField paramApellidos){
        NombreAlumno = paramNombres.getText();
        apellidosAlumnos = paramApellidos.getText();

        Cconexion objetoconexion = new Cconexion();

        String consulta = "insert into Alumnos (nombres, apellidos) values (?, ?);";

        try {
            CallableStatement cs = objetoconexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, NombreAlumno);
            cs.setString(2, apellidosAlumnos);
            cs.execute();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente el alumno");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el alumno: " + e.getMessage());
        }
    }

    public void MostrarAlumnos(JTable paramTablaTotalAlumnos){
	  Cconexion objetoConexion = new Cconexion();

	  DefaultTableModel modelo = new DefaultTableModel();

	  TableRowSorter<TableModel> OrdenarTabla= new TableRowSorter<TableModel>(modelo);
	  paramTablaTotalAlumnos.setRowSorter(OrdenarTabla);
	  
	  String sql= "";

	  modelo.addColumn("ID");
	  modelo.addColumn("Nombres");
	  modelo.addColumn("Apellidos");

	  paramTablaTotalAlumnos.setModel(modelo);

	  sql= "select * from Alumnos";

	  String[] datos = new String [3];
	  Statement st;
	  try{
		  st =objetoConexion.estableceConexion().createStatement();

		  ResultSet rs = st.executeQuery(sql);

		  while( rs.next()){
			  datos[0]=rs.getString(1);
			  datos[1]= rs.getString(2);
			  datos[2]= rs.getString(3);
			  modelo.addRow(datos);
		  }
			
	  }catch (Exception e){
		JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros error: " + e.toString());
	  }
    }

    public void SeleccionarAlumno(JTable paramTablaAlumnos, JTextField paramId, JTextField paramNombres, JTextField paramApellidos) {
	    try{
		int fila = paramTablaAlumnos.getSelectedRow();

		if (fila >= 0){
		paramId.setText(String.valueOf(paramTablaAlumnos.getValueAt(fila, 0).toString()));
		paramNombres.setText(String.valueOf(paramTablaAlumnos.getValueAt(fila, 1).toString()));
		paramApellidos.setText(String.valueOf(paramTablaAlumnos.getValueAt(fila, 2).toString()));
		}
		else{
			JOptionPane.showMessageDialog(null, "fila no seleccionada");
		}
	    }catch (Exception e){
		    JOptionPane.showMessageDialog(null, "error de seleccion, error: " + e.toString());
	    }
    }

    public void ModificarAlumnos(JTextField paramCodigo, JTextField paramNombres, JTextField paramApellidos) {
    setCodigo(Integer.parseInt(paramCodigo.getText()));
    setNombreAlumno(paramNombres.getText());
    setApellidosAlumnos(paramApellidos.getText());
    
    Cconexion objetoConexion = new Cconexion();

    String consulta = "UPDATE alumnos SET nombres = ?, apellidos = ? WHERE id = ?;";

    try {
        CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

        cs.setString(1, getNombreAlumno());
        cs.setString(2, getApellidosAlumnos());
        cs.setInt(3, getCodigo());

        cs.execute();
        JOptionPane.showMessageDialog(null, "Modificación exitosa");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No se modificó, error: " + e.toString());
    }
}
	public void EliminarAlumnos(JTextField paramCodigo){
		setCodigo(Integer.parseInt(paramCodigo.getText()));

		Cconexion objetoconexion = new Cconexion();

		String consulta = "DELETE FROM Alumnos WHERE alumnos.id= ?";

		try{
			CallableStatement cs = objetoconexion.estableceConexion().prepareCall(consulta);

			cs.setInt(1, getCodigo());
			cs.execute();
			JOptionPane.showMessageDialog(null, "se elimino correctamente el alumno");
		}catch (SQLException e){
			JOptionPane.showMessageDialog(null, "No se pudo elimar el estudiante, error: "+e.toString());
		}
	}
}


