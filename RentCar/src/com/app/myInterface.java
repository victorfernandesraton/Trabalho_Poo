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

	public JPanel getPnUser() {
		return pnUser;
	}

	public JTabbedPane getTbPanels() {
		return tbPanels;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public JButton getBtnClear() {
		return btnClear;
	}

	public JButton getBtnConfirm() {
		return btnConfirm;
	}

	public JLabel getLbName() {
		return lbName;
	}

	public JTextField getTfName() {
		return tfName;
	}

	public JLabel getLbCPF() {
		return lbCPF;
	}

	public JTextField getTfCPF() {
		return tfCPF;
	}

	public JLabel getLbMail() {
		return lbMail;
	}

	public JLabel getLbMailArroba() {
		return lbMailArroba;
	}

	public JTextField getTfMailAdress() {
		return tfMailAdress;
	}

	public JTextField getTfMailDomain() {
		return tfMailDomain;
	}

	public JTextField getTfPhone() {
		return tfPhone;
	}

	public JLabel getLbPhone() {
		return lbPhone;
	}

	private JFrame frame;
	private JPanel pnUser;
	private JTabbedPane tbPanels;
	private JButton btnCancel;
	private JButton btnClear;
	private JButton btnConfirm;
	private JLabel lbName;
	private JTextField tfName;
	private JLabel lbCPF;
	private JTextField tfCPF;
	private JLabel lbMail;
	private JLabel lbMailArroba;
	private JTextField tfMailAdress;
	private JTextField tfMailDomain;
	private JTextField tfPhone;
	private JLabel lbPhone;
	/**
	 * Launch the application.
	 */
	
	public JFrame getFrame() {
		return frame;
	}

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
		
		tbPanels = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tbPanels, BorderLayout.CENTER);
		
		pnUser = new JPanel();
		tbPanels.addTab("User", null, pnUser, null);
		pnUser.setLayout(null);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(615, 389, 80, 25);
		pnUser.add(btnCancel);
		
		lbName = new JLabel("Name");
		lbName.setBounds(10, 30, 45, 15);
		pnUser.add(lbName);
		
		tfName = new JTextField();
		tfName.setBounds(78, 25, 190, 25);
		pnUser.add(tfName);
		tfName.setColumns(10);
		
		lbCPF = new JLabel("CPF");
		lbCPF.setBounds(318, 30, 45, 15);
		pnUser.add(lbCPF);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(376, 25, 190, 25);
		pnUser.add(tfCPF);
		tfCPF.setColumns(10);
		
		lbMail = new JLabel("E-mail");
		lbMail.setBounds(10, 77, 55, 16);
		pnUser.add(lbMail);
		
		lbMailArroba = new JLabel("@");
		lbMailArroba.setBounds(308, 77, 55, 16);
		pnUser.add(lbMailArroba);
		
		tfMailAdress = new JTextField();
		tfMailAdress.setBounds(78, 75, 190, 25);
		pnUser.add(tfMailAdress);
		tfMailAdress.setColumns(10);
		
		tfMailDomain = new JTextField();
		tfMailDomain.setBounds(376, 74, 196, 26);
		pnUser.add(tfMailDomain);
		tfMailDomain.setColumns(10);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.setEnabled(false);
		btnConfirm.setBounds(494, 388, 98, 26);
		pnUser.add(btnConfirm);
		
		btnClear = new JButton("Clear");
		btnClear.setBounds(376, 388, 98, 26);
		pnUser.add(btnClear);
		
		lbPhone = new JLabel("Phone");
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