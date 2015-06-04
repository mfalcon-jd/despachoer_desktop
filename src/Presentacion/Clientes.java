package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clientes {

	private JFrame frmPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes window = new Clientes();
					window.frmPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Clientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrincipal = new JFrame();
		frmPrincipal.setTitle("Sistema de Administracion");
		frmPrincipal.setBounds(100, 100, 771, 503);
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmPrincipal.getContentPane().setLayout(springLayout);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 0, SpringLayout.NORTH, frmPrincipal.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, frmPrincipal.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, 477, SpringLayout.NORTH, frmPrincipal.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 769, SpringLayout.WEST, frmPrincipal.getContentPane());
		frmPrincipal.getContentPane().add(tabbedPane);
		
		JPanel panelClientes = new JPanel();
		tabbedPane.addTab("Clientes", null, panelClientes, null);
		SpringLayout sl_panelClientes = new SpringLayout();
		panelClientes.setLayout(sl_panelClientes);
		
		JPanel panelCasos = new JPanel();
		tabbedPane.addTab("Casos", null, panelCasos, null);
		SpringLayout sl_panelCatalogos = new SpringLayout();
		panelCasos.setLayout(sl_panelCatalogos);
		
		JLabel lblClaveElectorO = new JLabel("Clave Elector o CURP:");
		sl_panelClientes.putConstraint(SpringLayout.NORTH, lblClaveElectorO, 20, SpringLayout.NORTH, panelClientes);
		sl_panelClientes.putConstraint(SpringLayout.WEST, lblClaveElectorO, 20, SpringLayout.WEST, panelClientes);
		panelClientes.add(lblClaveElectorO);
		frmPrincipal.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tabbedPane}));
	}

}
