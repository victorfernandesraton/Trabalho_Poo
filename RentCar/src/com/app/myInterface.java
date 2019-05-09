package com.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import jdk.internal.org.objectweb.asm.tree.analysis.Frame;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class myInterface {

	JFrame frame;
	private JTextField textField;
	private JTextField tfMailAdress;
	private JTextField tfMailDomain;
	private JTextField tfPhone;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public myInterface() {
		initialize();
		System.out.println("Open sytem... OK");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Rentcar.com - Sample rent car system");
		
		frame.setBounds(200, 200, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tbPanels = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tbPanels, BorderLayout.CENTER);
		
		JPanel pnUser = new JPanel();
		tbPanels.addTab("User", null, pnUser, null);
		pnUser.setLayout(null);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(615, 389, 80, 25);
		pnUser.add(btnCancel);
		
		JLabel lbName = new JLabel("Name");
		lbName.setBounds(10, 30, 45, 15);
		pnUser.add(lbName);
		
		JTextField tfName = new JTextField();
		tfName.setBounds(78, 25, 190, 25);
		pnUser.add(tfName);
		tfName.setColumns(10);
		
		JLabel lbCPF = new JLabel("CPF");
		lbCPF.setBounds(318, 30, 45, 15);
		pnUser.add(lbCPF);
		
		JTextField tfCPF = new JTextField();
		tfCPF.setBounds(376, 25, 190, 25);
		pnUser.add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lbMail = new JLabel("E-mail");
		lbMail.setBounds(10, 77, 55, 16);
		pnUser.add(lbMail);
		
		JLabel lbMailArroba = new JLabel("@");
		lbMailArroba.setBounds(308, 77, 55, 16);
		pnUser.add(lbMailArroba);
		
		JTextField tfMailAdress = new JTextField();
		tfMailAdress.setBounds(78, 75, 190, 25);
		pnUser.add(tfMailAdress);
		tfMailAdress.setColumns(10);
		
		JTextField tfMailDomain = new JTextField();
		tfMailDomain.setBounds(376, 74, 196, 26);
		pnUser.add(tfMailDomain);
		tfMailDomain.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setEnabled(false);
		btnConfirm.setBounds(494, 388, 98, 26);
		pnUser.add(btnConfirm);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(376, 388, 98, 26);
		pnUser.add(btnClear);
		
		JLabel lbPhone = new JLabel("Phone");
		lbPhone.setBounds(10, 126, 55, 16);
		pnUser.add(lbPhone);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(78, 124, 190, 25);
		pnUser.add(tfPhone);
		tfPhone.setColumns(10);
		
		btnClear.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfName.setText("");
				tfCPF.setText("");
				tfMailAdress.setText("");
				tfMailDomain.setText("");
			}
		});
		
		btnCancel.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				System.out.println("Frame close with " + btnCancel.getText());
				System.exit(0);
			}
		});
		
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfName.getText().equals("")) {
					btnConfirm.setEnabled(false);
				} else btnConfirm.setEnabled(true);
			}
		});
	}
}