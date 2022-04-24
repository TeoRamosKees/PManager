package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import excepciones.ContraseniaIncorrectaException;
import excepciones.UsuarioExistenteException;
import excepciones.UsuarioInexistenteException;
import modelo.PManager;
import modelo.User;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_7;
	private JPanel panel_8;
	private JTextArea txtrPasswordManager;
	private JTextArea txtrUsername;
	private JTextArea txtrPassword;
	private JTextField textField;
	private JPanel panel_15;
	private JPanel panel_16;
	private JButton btnNewButton;
	private JPasswordField passwordField;
	private JPanel panel_17;
	private JButton btnNewButton_1;
	private JPanel panel_21;
	private JPanel panel_22;
	private JPanel panel_23;
	private JPanel panel_24;
	private JPanel panel_25;
	private JPanel panel_26;
	private JPanel panel_9;
	private JPanel panel_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 529);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		tabbedPane.setBackground(SystemColor.info);
		this.contentPane.add(tabbedPane);
		
		this.panel = new JPanel();
		this.panel.setBackground(SystemColor.info);
		tabbedPane.addTab("Iniciar Sesion", null, this.panel, null);
		this.panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_2 = new JPanel();
		this.panel_2.setBackground(SystemColor.info);
		this.panel.add(this.panel_2);
		this.panel_2.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.panel_7 = new JPanel();
		this.panel_7.setBackground(SystemColor.info);
		this.panel_2.add(this.panel_7);
		this.panel_7.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_9 = new JPanel();
		this.panel_9.setBackground(SystemColor.info);
		this.panel_7.add(this.panel_9);
		
		this.panel_13 = new JPanel();
		this.panel_13.setBackground(SystemColor.info);
		this.panel_7.add(this.panel_13);
		
		this.txtrPasswordManager = new JTextArea();
		this.panel_13.add(this.txtrPasswordManager);
		this.txtrPasswordManager.setFont(new Font("Monospaced", Font.PLAIN, 28));
		this.txtrPasswordManager.setForeground(SystemColor.desktop);
		this.txtrPasswordManager.setBackground(SystemColor.info);
		this.txtrPasswordManager.setText("   PASSWORD \r\n    MANAGER");
		this.txtrPasswordManager.setRows(5);
		this.txtrPasswordManager.setColumns(15);
		
		this.panel_8 = new JPanel();
		this.panel_8.setBackground(SystemColor.info);
		this.panel_2.add(this.panel_8);
		this.panel_8.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panel_16 = new JPanel();
		this.panel_16.setBackground(SystemColor.info);
		this.panel_8.add(this.panel_16);
		this.panel_16.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_23 = new JPanel();
		this.panel_23.setBackground(SystemColor.info);
		this.panel_16.add(this.panel_23);
		
		this.panel_26 = new JPanel();
		this.panel_26.setBackground(SystemColor.info);
		this.panel_23.add(this.panel_26);
		
		this.txtrUsername = new JTextArea();
		this.txtrUsername.setBackground(SystemColor.info);
		this.panel_26.add(this.txtrUsername);
		this.txtrUsername.setText("Username:");
		
		this.panel_21 = new JPanel();
		this.panel_23.add(this.panel_21);
		this.panel_21.setBackground(SystemColor.info);
		
		this.textField = new JTextField();
		this.panel_21.add(this.textField);
		this.textField.setColumns(8);
		
		this.panel_22 = new JPanel();
		this.panel_22.setBackground(SystemColor.info);
		this.panel_16.add(this.panel_22);
		
		this.panel_24 = new JPanel();
		this.panel_22.add(this.panel_24);
		this.panel_24.setBackground(SystemColor.info);
		
		this.txtrPassword = new JTextArea();
		this.txtrPassword.setBackground(SystemColor.info);
		this.panel_24.add(this.txtrPassword);
		this.txtrPassword.setText("Password:");
		
		this.panel_25 = new JPanel();
		this.panel_25.setBackground(SystemColor.info);
		this.panel_22.add(this.panel_25);
		
		this.passwordField = new JPasswordField();
		this.panel_25.add(this.passwordField);
		this.passwordField.setBackground(SystemColor.text);
		this.passwordField.setColumns(8);
		
		this.panel_15 = new JPanel();
		this.panel_15.setBackground(SystemColor.info);
		this.panel_8.add(this.panel_15);
		this.panel_15.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel_17 = new JPanel();
		this.panel_17.setBackground(SystemColor.info);
		this.panel_15.add(this.panel_17);
		
		this.btnNewButton = new JButton("Login");
		this.btnNewButton.addActionListener(this);
		this.panel_17.add(this.btnNewButton);
		
		this.btnNewButton_1 = new JButton("Register");
		this.btnNewButton_1.addActionListener(this);
		this.panel_17.add(this.btnNewButton_1);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Login"))
			try {
				this.login();
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UsuarioInexistenteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ContraseniaIncorrectaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else if (e.getActionCommand().equals("Register")) this.register();
		
	}

	private void login() throws HeadlessException, UsuarioInexistenteException, ContraseniaIncorrectaException {
		// TODO Auto-generated method stub
		String username=this.textField.getText();
		String password=this.passwordField.getText();
		if (PManager.getInstancia().login(username, password)) {
			User user=PManager.getInstancia().getUser(username, password);
			Menu menu=new Menu(user);
			this.dispose();
			menu.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(null, "Login fail"+"\n"+"Username does not exist or wrong password", username, JOptionPane.PLAIN_MESSAGE);
		}
		
		
		
	}

	private void register() {
		// TODO Auto-generated method stub
		String username=this.textField.getText();
		String password=this.passwordField.getText();
		User usuario=new User(username,password);
		
		try {
			PManager.getInstancia().agregarUsuario(usuario);
		} catch (UsuarioExistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
