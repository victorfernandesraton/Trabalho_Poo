package com.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class myFrame extends JFrame {

	private JPanel panel1;
	private JTabbedPane tabbedPane1;
	private JButton button1;
	private JButton button2;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JPanel panel2;
	private JTextField textField4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFrame frame = new myFrame();
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
	public myFrame() {
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		getContentPane().add(tabbedPane);
		
		JPanel panel1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel1, null);
		panel1.setLayout(null);
		
		JButton jButton_cadastrar = new JButton("Cadastrar");

		jButton_cadastrar.setBounds(301, 183, 89, 23);
		panel1.add(jButton_cadastrar);
		
		JButton jButton_Cancelar = new JButton("Cancelar");
		jButton_Cancelar.setBounds(202, 183, 89, 23);
		panel1.add(jButton_Cancelar);
		
		JLabel jLabel_placa = new JLabel("Placa");
		jLabel_placa.setBounds(10, 11, 46, 14);
		panel1.add(jLabel_placa);
		
		JTextPane jTextPanel_placa = new JTextPane();
		jTextPanel_placa.setBounds(10, 36, 189, 20);
		panel1.add(jTextPanel_placa);
		
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel2, null);
		
		JPanel panel3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel3, null);
		jButton_Cancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}

	private void createUIComponents() {
		// TODO: place custom component creation code here
	}
}
