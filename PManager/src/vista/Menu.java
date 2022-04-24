package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import modelo.Cuenta;
import modelo.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Menu extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JComboBox comboBox_1;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JTextArea txtrLoginId;
	private JTextField textField;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JTextArea txtrPassword;
	private JPanel panel_15;
	private JTextField textField_1;
	private JPanel panel_16;
	private JPanel panel_17;
	private JButton btnNewButton_1;
	private JPanel panel_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JPanel panel_21;
	private JTextArea txtrDescription;
	private JTextField textField_2;
	private JPanel panel_22;
	private DefaultListModel<Cuenta> modeloLista;
	private JButton btnNewButton_2;
	private User usuarioLogueado;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Menu(User user) {
		this.usuarioLogueado=user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 529);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panel_1 = new JPanel();
		this.panel_1.setBackground(Color.LIGHT_GRAY);
		this.panel_1.setBorder(new TitledBorder(null, "Search Panel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel.add(this.panel_1);
		this.panel_1.setLayout(new GridLayout(8, 1, 0, 0));
		
		this.panel_5 = new JPanel();
		this.panel_5.setBackground(Color.LIGHT_GRAY);
		this.panel_1.add(this.panel_5);
		
		this.comboBox = new JComboBox();
		this.panel_5.add(this.comboBox);
		this.comboBox.setModel(new DefaultComboBoxModel(new String[] {"All", "Social", "Education", "Work", "Other"}));
		
		this.panel_4 = new JPanel();
		this.panel_4.setBackground(Color.LIGHT_GRAY);
		this.panel_1.add(this.panel_4);
		
		this.btnNewButton = new JButton("Search");
		this.btnNewButton.addActionListener(this);
		this.panel_4.add(this.btnNewButton);
		
		this.panel_2 = new JPanel();
		this.panel_2.setBackground(Color.LIGHT_GRAY);
		this.panel_2.setBorder(new TitledBorder(null, "Adding Panel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel.add(this.panel_2);
		this.panel_2.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panel_6 = new JPanel();
		this.panel_6.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_6);
		
		this.comboBox_1 = new JComboBox();
		this.comboBox_1.setBackground(Color.WHITE);
		this.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Social", "Education", "Work", "Other"}));
		this.panel_6.add(this.comboBox_1);
		
		this.panel_7 = new JPanel();
		this.panel_2.add(this.panel_7);
		this.panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_8 = new JPanel();
		this.panel_8.setBackground(Color.LIGHT_GRAY);
		this.panel_7.add(this.panel_8);
		
		this.panel_14 = new JPanel();
		this.panel_14.setBackground(Color.LIGHT_GRAY);
		this.panel_8.add(this.panel_14);
		
		this.txtrLoginId = new JTextArea();
		this.txtrLoginId.setBackground(Color.LIGHT_GRAY);
		this.panel_14.add(this.txtrLoginId);
		this.txtrLoginId.setText("Login ID:");
		this.txtrLoginId.setColumns(6);
		
		this.panel_9 = new JPanel();
		this.panel_9.setBackground(Color.LIGHT_GRAY);
		this.panel_7.add(this.panel_9);
		
		this.panel_10 = new JPanel();
		this.panel_10.setBackground(Color.LIGHT_GRAY);
		this.panel_9.add(this.panel_10);
		
		this.textField = new JTextField();
		this.textField.setBackground(Color.WHITE);
		this.panel_10.add(this.textField);
		this.textField.setColumns(10);
		
		this.panel_11 = new JPanel();
		this.panel_2.add(this.panel_11);
		this.panel_11.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_12 = new JPanel();
		this.panel_12.setBackground(Color.LIGHT_GRAY);
		this.panel_11.add(this.panel_12);
		
		this.panel_15 = new JPanel();
		this.panel_15.setBackground(Color.LIGHT_GRAY);
		this.panel_12.add(this.panel_15);
		
		this.txtrPassword = new JTextArea();
		this.txtrPassword.setBackground(Color.LIGHT_GRAY);
		this.panel_15.add(this.txtrPassword);
		this.txtrPassword.setText("Password:");
		this.txtrPassword.setColumns(6);
		
		this.panel_13 = new JPanel();
		this.panel_13.setBackground(Color.LIGHT_GRAY);
		this.panel_11.add(this.panel_13);
		
		this.panel_16 = new JPanel();
		this.panel_16.setBackground(Color.LIGHT_GRAY);
		this.panel_13.add(this.panel_16);
		
		this.textField_1 = new JTextField();
		this.textField_1.setBackground(Color.WHITE);
		this.panel_16.add(this.textField_1);
		this.textField_1.setColumns(10);
		
		this.panel_19 = new JPanel();
		this.panel_2.add(this.panel_19);
		this.panel_19.setLayout(new GridLayout(1, 0, 0, 0));
		
		this.panel_20 = new JPanel();
		this.panel_20.setBackground(Color.LIGHT_GRAY);
		this.panel_19.add(this.panel_20);
		
		this.txtrDescription = new JTextArea();
		this.txtrDescription.setBackground(Color.LIGHT_GRAY);
		this.txtrDescription.setText("Description:");
		this.txtrDescription.setColumns(6);
		this.panel_20.add(this.txtrDescription);
		
		this.panel_21 = new JPanel();
		this.panel_21.setBackground(Color.LIGHT_GRAY);
		this.panel_19.add(this.panel_21);
		
		this.panel_22 = new JPanel();
		this.panel_22.setBackground(Color.LIGHT_GRAY);
		this.panel_21.add(this.panel_22);
		
		this.textField_2 = new JTextField();
		this.panel_22.add(this.textField_2);
		this.textField_2.setColumns(10);
		
		this.panel_17 = new JPanel();
		this.panel_17.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_17);
		
		this.panel_18 = new JPanel();
		this.panel_18.setBackground(Color.LIGHT_GRAY);
		this.panel_17.add(this.panel_18);
		
		this.btnNewButton_1 = new JButton("Add");
		this.btnNewButton_1.addActionListener(this);
		this.panel_18.add(this.btnNewButton_1);
		
		this.btnNewButton_2 = new JButton("Delete");
		this.btnNewButton_2.addActionListener(this);
		this.panel_17.add(this.btnNewButton_2);
		
		this.panel_3 = new JPanel();
		this.panel_3.setBackground(Color.LIGHT_GRAY);
		this.panel.add(this.panel_3);
		this.panel_3.setLayout(new BorderLayout(0, 0));
		
		this.textPane = new JTextPane();
		this.panel_3.add(this.textPane, BorderLayout.CENTER);
		
		this.modeloLista= new DefaultListModel<Cuenta>();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Search")) this.searchCuenta();
		if (e.getActionCommand().equals("Add")) this.addCuenta();
		if (e.getActionCommand().equals("Delete")) this.deleteCuenta();
	}

	private void deleteCuenta() {
		// TODO Auto-generated method stub
		this.list.getSelectedValue();
		
	}

	private void addCuenta() {
		// TODO Auto-generated method stub
		
	}

	private void searchCuenta() {
		// TODO Auto-generated method stub
		String tipo=this.comboBox.getToolTipText();
		switch(tipo) {
		case "All":
			(this.usuarioLogueado.mostrarTodasCuentas());			
			break;
		case "Social":
			this.usuarioLogueado.mostrarSocial();			
			break;
		case "Education":
			this.usuarioLogueado.mostrarEducation();			
			break;
		case "Work":
			this.usuarioLogueado.mostrarWork();			
			break;
		case "Other":
			this.usuarioLogueado.mostrarOther();			
			break;
		}
		
	}
}
