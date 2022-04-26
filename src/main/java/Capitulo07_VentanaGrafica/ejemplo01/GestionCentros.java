package Capitulo07_VentanaGrafica.ejemplo01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class GestionCentros {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-68,419
	 */
	private final JTextField textField = new JTextField();
	private JTextField jtfid;
	private JTextField jtftipo;
	private JTextField jtfden;
	private JTextField jtfdirc;
	private JTextField jtfpob;
	private JTextField jtfprov;
	private JButton btnNewButton = new JButton("<<");
	private JButton btnNewButton_1 = new JButton("<");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionCentros window = new GestionCentros();
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
	public GestionCentros() {
		initialize();
		mostrarPrimerCentro();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Gestion Centros Educativos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(5, 0, 5, 0);
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
		
		jtfid = new JTextField();
		GridBagConstraints gbc_jtfid = new GridBagConstraints();
		gbc_jtfid.insets = new Insets(0, 0, 5, 0);
		gbc_jtfid.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfid.gridx = 1;
		gbc_jtfid.gridy = 1;
		frame.getContentPane().add(jtfid, gbc_jtfid);
		jtfid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtftipo = new JTextField();
		GridBagConstraints gbc_jtftipo = new GridBagConstraints();
		gbc_jtftipo.insets = new Insets(0, 0, 5, 0);
		gbc_jtftipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtftipo.gridx = 1;
		gbc_jtftipo.gridy = 2;
		frame.getContentPane().add(jtftipo, gbc_jtftipo);
		jtftipo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Denomonacion:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfden = new JTextField();
		GridBagConstraints gbc_jtfden = new GridBagConstraints();
		gbc_jtfden.insets = new Insets(0, 0, 5, 0);
		gbc_jtfden.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfden.gridx = 1;
		gbc_jtfden.gridy = 3;
		frame.getContentPane().add(jtfden, gbc_jtfden);
		jtfden.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfdirc = new JTextField();
		GridBagConstraints gbc_jtfdirc = new GridBagConstraints();
		gbc_jtfdirc.insets = new Insets(0, 0, 5, 0);
		gbc_jtfdirc.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfdirc.gridx = 1;
		gbc_jtfdirc.gridy = 4;
		frame.getContentPane().add(jtfdirc, gbc_jtfdirc);
		jtfdirc.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Poblacion");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfpob = new JTextField();
		GridBagConstraints gbc_jtfpob = new GridBagConstraints();
		gbc_jtfpob.insets = new Insets(0, 0, 5, 0);
		gbc_jtfpob.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfpob.gridx = 1;
		gbc_jtfpob.gridy = 5;
		frame.getContentPane().add(jtfpob, gbc_jtfpob);
		jtfpob.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Provincia");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		frame.getContentPane().add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfprov = new JTextField();
		GridBagConstraints gbc_jtfprov = new GridBagConstraints();
		gbc_jtfprov.insets = new Insets(0, 0, 5, 0);
		gbc_jtfprov.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfprov.gridx = 1;
		gbc_jtfprov.gridy = 6;
		frame.getContentPane().add(jtfprov, gbc_jtfprov);
		jtfprov.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(10, 0, 5, 0);
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPrimerCentro();
			}
		});
		panel.add(btnNewButton);
		
		//JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAnteriorCentro();
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(">");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarSiguenteCentro();
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(">>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarUltimoCentro();
			}
		});
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 8;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(GestionCentros.class.getResource("/Capitulo07_VentanaGrafica/ejemplo01/res/nuevo.png")));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(GestionCentros.class.getResource("/Capitulo07_VentanaGrafica/ejemplo01/res/guardar.png")));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(GestionCentros.class.getResource("/Capitulo07_VentanaGrafica/ejemplo01/res/eliminar.png")));
		panel_1.add(btnNewButton_6);
	}
	/**
	 * 
	 */
	
	private void mostrarPrimerCentro() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro order by id limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfden.setText(rs.getString("denominacion"));
				jtfdirc.setText(rs.getString("direccion"));
				jtfpob.setText(rs.getString("poblacion"));
				jtfprov.setText(rs.getString("provincia"));
				
			}
			if (jtfid.getText().equals("1") ) {
				deshabilitar();
			}
			else {
				habilitar();
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
	private void mostrarUltimoCentro() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro order by id desc limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfden.setText(rs.getString("denominacion"));
				jtfdirc.setText(rs.getString("direccion"));
				jtfpob.setText(rs.getString("poblacion"));
				jtfprov.setText(rs.getString("provincia"));
			}
			if (jtfid.getText().equals("1") ) {
				deshabilitar();
			}
			else {
				habilitar();
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
	private void mostrarSiguenteCentro() {
		try {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro where id > "+ jtfid.getText() + " order by id limit 1;");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfden.setText(rs.getString("denominacion"));
				jtfdirc.setText(rs.getString("direccion"));
				jtfpob.setText(rs.getString("poblacion"));
				jtfprov.setText(rs.getString("provincia"));
			}
			if (jtfid.getText().equals("1") ) {
				deshabilitar();
			}
			else {
				habilitar();
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
	private void mostrarAnteriorCentro() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro where id < "+ jtfid.getText()  +" order by id desc limit 1;");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo .setText(rs.getString("tipo"));
				jtfden.setText(rs.getString("denominacion"));
				jtfdirc.setText(rs.getString("direccion"));
				jtfpob.setText(rs.getString("poblacion"));
				jtfprov.setText(rs.getString("provincia"));
			}
			if (jtfid.getText().equals("1") ) {
				deshabilitar();
			}
			else {
				habilitar();
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
	private void nuevo(){
		this.jtfid.setText("0");
		this.jtftipo .setText("");
		this.jtfden.setText("");
		this.jtfdirc.setText("");
		this.jtfpob.setText("");
		this.jtfprov.setText("");
	}
	
	/**
	 * 
	 */
	private void eliminar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			int registrosModificados = s.executeUpdate (" delete from centro_educativo.centro where id = " + jtfid.getText());
			
			if(registrosModificados == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
				mostrarAnteriorCentro();
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
	private void guardar() {
		if (jtfid.getText().equals("0")) {
			insertar();
		}
		else {
			modificar();
		}
	}
	
	private void modificar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			int registrosModificados = s.executeUpdate (" update centro_educativo.centro set tipo = '" + jtftipo.getText() + "', denominacion = '" + jtfden.getText() +
					"', direccion = '"+ jtfdirc.getText() + "', poblacion = '"+ jtfpob.getText() + "', provincia = '"+ jtfprov.getText() + "' where id = 1;");
			
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
	
	private void insertar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement();
			
			int id = siguienteIdDisponible();
			String comando = " insert into centro_educativo.centro values (" + siguienteIdDisponible() + ", '" +jtftipo.getText() + "', '" + jtfden.getText() +
					"', '" + jtfdirc.getText() + "', '" + jtfpob.getText() + "', '"  + jtfprov.getText() + "' )";
			
			int registrosModificados = s.executeUpdate (comando);
			
			if(registrosModificados == 1) {
				jtfid.setText("" + id);
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
	
	private int siguienteIdDisponible() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select max(id) from centro_educativo.centro");
		   
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
	
	private void habilitar() {
		btnNewButton.setEnabled(true);
		btnNewButton_1.setEnabled(true);
	}
	private void deshabilitar() {
		btnNewButton.setEnabled(false);
		btnNewButton_1.setEnabled(false);
	}
	
	
	
	
	
}
