/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_crud_mysql;

import java.sql.CallableStatement;
import java.sql.ResultSet;
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
}


