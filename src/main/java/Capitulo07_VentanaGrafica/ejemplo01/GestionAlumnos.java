package Capitulo07_VentanaGrafica.ejemplo01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class GestionAlumnos {

	private JFrame frame;
	private JTextField jtf_id;
	private JTextField jtf_nombre;
	private JTextField jtf_apellidos;
	private JTextField jtf_nif;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionAlumnos window = new GestionAlumnos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestionAlumnos() {
		initialize();
		mostrarPrimerAlumno();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Gestion de Alumnos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(10, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtf_id = new JTextField();
		jtf_id.setEnabled(false);
		GridBagConstraints gbc_jtf_id = new GridBagConstraints();
		gbc_jtf_id.insets = new Insets(0, 0, 5, 0);
		gbc_jtf_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtf_id.gridx = 1;
		gbc_jtf_id.gridy = 1;
		frame.getContentPane().add(jtf_id, gbc_jtf_id);
		jtf_id.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtf_nombre = new JTextField();
		GridBagConstraints gbc_jtf_nombre = new GridBagConstraints();
		gbc_jtf_nombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtf_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtf_nombre.gridx = 1;
		gbc_jtf_nombre.gridy = 2;
		frame.getContentPane().add(jtf_nombre, gbc_jtf_nombre);
		jtf_nombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtf_apellidos = new JTextField();
		GridBagConstraints gbc_jtf_apellidos = new GridBagConstraints();
		gbc_jtf_apellidos.insets = new Insets(0, 0, 5, 0);
		gbc_jtf_apellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtf_apellidos.gridx = 1;
		gbc_jtf_apellidos.gridy = 3;
		frame.getContentPane().add(jtf_apellidos, gbc_jtf_apellidos);
		jtf_apellidos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("NIF:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtf_nif = new JTextField();
		GridBagConstraints gbc_jtf_nif = new GridBagConstraints();
		gbc_jtf_nif.insets = new Insets(0, 0, 5, 0);
		gbc_jtf_nif.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtf_nif.gridx = 1;
		gbc_jtf_nif.gridy = 4;
		frame.getContentPane().add(jtf_nif, gbc_jtf_nif);
		jtf_nif.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPrimerAlumno();
			}
		});
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAnteriorAlumno();
			}
		});
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton(">");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarSiguenteAlumno();
			}
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton(">>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarUltimoAlumno();
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guardar();
			}
		});
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nuevo();
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(GestionAlumnos.class.getResource("/Capitulo07_VentanaGrafica/ejemplo01/res/nuevo.png")));
		panel.add(btnNewButton_5);
		btnNewButton_4.setIcon(new ImageIcon(GestionAlumnos.class.getResource("/Capitulo07_VentanaGrafica/ejemplo01/res/guardar.png")));
		panel.add(btnNewButton_4);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(GestionAlumnos.class.getResource("/Capitulo07_VentanaGrafica/ejemplo01/res/eliminar.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		panel.add(btnNewButton_6);
	}
	
	/**
	 * 
	 */
	
	private void mostrarPrimerAlumno() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			
			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id limit 1");
		   
			if (rs.next() == true) { 
				jtf_id.setText(rs.getString("id"));
				jtf_nombre.setText(rs.getString("Nombre"));
				jtf_apellidos.setText(rs.getString("Apellidos"));
				jtf_nif.setText(rs.getString("NIF"));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	/**
	 * 
	 */
	
	private void mostrarUltimoAlumno() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id desc limit 1");
		   
			if (rs.next() == true) { 
				jtf_id.setText(rs.getString("id"));
				jtf_nombre.setText(rs.getString("Nombre"));
				jtf_apellidos.setText(rs.getString("Apellidos"));
				jtf_nif.setText(rs.getString("NIF"));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
		
	/**
	 * 
	 */
	private void mostrarSiguenteAlumno() {
		try {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno where id > "+ jtf_id.getText() + " order by id limit 1;");
		   
			if (rs.next() == true) { 
				jtf_id.setText(rs.getString("id"));
				jtf_nombre.setText(rs.getString("Nombre"));
				jtf_apellidos.setText(rs.getString("Apellidos"));
				jtf_nif.setText(rs.getString("NIF"));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private void mostrarAnteriorAlumno() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno where id < "+ jtf_id.getText()  +" order by id desc limit 1;");
		   
			if (rs.next() == true) { 
				jtf_id.setText(rs.getString("id"));
				jtf_nombre.setText(rs.getString("Nombre"));
				jtf_apellidos.setText(rs.getString("Apellidos"));
				jtf_nif.setText(rs.getString("NIF"));
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}		
	}
	
	/**
	 * 
	 */
	private void Guardar() {
		if (jtf_id.getText().equals("0")) {
			insertar();
		}
		else {
			modificar();
		}
	}
	
	/**
	 * 
	 */
	private void modificar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			int registrosModificados = s.executeUpdate (" update alumnos.alumno set nombre = '" + jtf_nombre.getText() + "', apellidos = '" + jtf_apellidos.getText() +
					"', nif = '"+ jtf_nif.getText() + "' where id = 1;");
			
			if(registrosModificados == 1) {
				JOptionPane.showMessageDialog(null, "Guardo Correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al gurdar");
			}
			
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}		
		
	}
	
	/**
	 * 
	 */
	private void insertar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement();
			
			int id = siguienteIdDisponible();
			String comando = " insert into alumnos.alumno values (" + siguienteIdDisponible() +", '" + jtf_nombre.getText() + "', '" + jtf_apellidos.getText() + "', '" +
					jtf_nif.getText() + "' )";
			
			int registrosModificados = s.executeUpdate (comando);
			
			if(registrosModificados == 1) {
				jtf_id.setText("" + id);
				JOptionPane.showMessageDialog(null, "Guardo Correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al gurdar");
			}
			
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}		
		
	}
	 /**
	  * 
	  */
	private int siguienteIdDisponible() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select max(id) from alumnos.alumno");
		   
			if (rs.next() == true) { 
				return rs.getInt(1) + 1 ;
			}
			
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}		
		return  -1 ;
	}
	
	/**
	 * 
	 */
	private void eliminar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			int registrosModificados = s.executeUpdate (" delete from alumnos.alumno where id = " + jtf_id.getText());
			
			if(registrosModificados == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
				mostrarAnteriorAlumno();
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
			}
			
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}		
		
	}		
	
	/**
	 * 
	 */
	private void Nuevo() {
		this.jtf_id.setText("0");
		this.jtf_nombre.setText("");
		this.jtf_apellidos.setText("");
		this.jtf_nif.setText("");
	}	
}
