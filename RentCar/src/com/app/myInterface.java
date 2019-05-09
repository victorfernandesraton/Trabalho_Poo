package com.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JLabel;

public class myInterface {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public myInterface() {
		initialize();
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
		
		JButton btnCancel = new JButton("New button");
		btnCancel.setBounds(617, 383, 89, 23);
		pnUser.add(btnCancel);
		
		JLabel lbName = new JLabel("Name");
		lbName.setBounds(10, 29, 46, 14);
		pnUser.add(lbName);
		
		JTextPane tpName = new JTextPane();
		tpName.setSize(203, 23);
		tpName.setLocation(57, 29);
		pnUser.add(tpName);
	}
}
