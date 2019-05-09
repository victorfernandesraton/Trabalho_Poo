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
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class myInterface {

	private JFrame frame;
	private JTabbedPane tbPanels;
	private JPanel pnUser, pnStore;
	private JButton btnCancelUser, btnClearUser, btnConfirmUser, btnCancelStore, btnConfirmStore;
	private JLabel lbName, lbCPF,lbMail, lbMailArroba,lbPhone;
	private JTextField tfNameUser, tfCPFUser, tfMailAdressUser, tfMailDomainUser, tfPhoneUser, tfNameStore;
	private Store str;
	private User tmpUser;
	
	public JPanel getPnUser() {
		return pnUser;
	}

	public JTabbedPane getTbPanels() {
		return tbPanels;
	}

	public JButton getBtnCancel() {
		return btnCancelUser;
	}

	public JButton getBtnClear() {
		return btnClearUser;
	}

	public JButton getBtnConfirm() {
		return btnConfirmUser;
	}

	public JLabel getLbName() {
		return lbName;
	}

	public JTextField getTfName() {
		return tfNameUser;
	}

	public JLabel getLbCPF() {
		return lbCPF;
	}

	public JTextField getTfCPF() {
		return tfCPFUser;
	}

	public JLabel getLbMail() {
		return lbMail;
	}

	public JLabel getLbMailArroba() {
		return lbMailArroba;
	}

	public JTextField getTfMailAdress() {
		return tfMailAdressUser;
	}

	public JTextField getTfMailDomain() {
		return tfMailDomainUser;
	}

	public JTextField getTfPhone() {
		return tfPhoneUser;
	}

	public JLabel getLbPhone() {
		return lbPhone;
	}


	/**
	 * Launch the application.
	 */
	
	public JFrame getFrame() {
		return frame;
	}

	public JPanel getPnStore() {
		return pnStore;
	}

	public JTextField gettfNameStore() {
		return tfNameStore;
	}

	public Store getStr() {
		return str;
	}

	public JButton getBtnCancelStore() {
		return btnCancelStore;
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
		
		frame.setBounds(200, 200, 608, 271);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tbPanels = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tbPanels, BorderLayout.CENTER);
		
		pnStore = new JPanel();
		tbPanels.addTab("Store", null, pnStore, null);
		pnStore.setLayout(null);
		
		JLabel lbNameStore = new JLabel("Name");
		lbNameStore.setBounds(10, 81, 46, 14);
		pnStore.add(lbNameStore);
		
		tfNameStore = new JTextField();
		tfNameStore.addKeyListener(new KeyAdapter() {
			
		});
		tfNameStore.setBounds(66, 78, 314, 20);
		pnStore.add(tfNameStore);
		tfNameStore.setColumns(10);
		
		btnConfirmStore = new JButton("Confirm");
		btnConfirmStore.setEnabled(false);
		btnConfirmStore.setBounds(386, 170, 89, 23);
		btnConfirmStore.setName("Cancel - Store");
		pnStore.add(btnConfirmStore);
		
		btnCancelStore = new JButton("Cancel");
		btnCancelStore.setBounds(485, 170, 89, 23);
		pnStore.add(btnCancelStore);
		
		pnUser = new JPanel();
		tbPanels.addTab("User", null, pnUser, null);
		pnUser.setLayout(null);
		
		btnCancelUser = new JButton("Cancel");
		btnCancelUser.setBounds(486, 170, 80, 25);
		pnUser.add(btnCancelUser);
		
		lbName = new JLabel("Name");
		lbName.setBounds(10, 30, 45, 15);
		pnUser.add(lbName);
		
		tfNameUser = new JTextField();
		tfNameUser.setBounds(78, 25, 190, 25);
		pnUser.add(tfNameUser);
		tfNameUser.setColumns(10);
		
		lbCPF = new JLabel("CPF");
		lbCPF.setBounds(318, 30, 45, 15);
		pnUser.add(lbCPF);
		
		tfCPFUser = new JTextField();
		tfCPFUser.setBounds(376, 25, 190, 25);
		pnUser.add(tfCPFUser);
		tfCPFUser.setColumns(10);
		
		lbMail = new JLabel("E-mail");
		lbMail.setBounds(10, 77, 55, 16);
		pnUser.add(lbMail);
		
		lbMailArroba = new JLabel("@");
		lbMailArroba.setBounds(278, 77, 18, 16);
		pnUser.add(lbMailArroba);
		
		tfMailAdressUser = new JTextField();
		tfMailAdressUser.setBounds(78, 75, 190, 25);
		pnUser.add(tfMailAdressUser);
		tfMailAdressUser.setColumns(10);
		
		tfMailDomainUser = new JTextField();
		tfMailDomainUser.setBounds(297, 74, 190, 26);
		pnUser.add(tfMailDomainUser);
		tfMailDomainUser.setColumns(10);
		
		btnConfirmUser = new JButton("Confirm");
		btnConfirmUser.setEnabled(false);
		btnConfirmUser.setBounds(376, 169, 98, 26);
		pnUser.add(btnConfirmUser);
		
		btnClearUser = new JButton("Clear");
		btnClearUser.setBounds(265, 169, 98, 26);
		pnUser.add(btnClearUser);
		
		lbPhone = new JLabel("Phone");
		lbPhone.setBounds(10, 126, 55, 16);
		pnUser.add(lbPhone);
		
		tfPhoneUser = new JTextField();
		tfPhoneUser.setBounds(78, 124, 190, 25);
		pnUser.add(tfPhoneUser);
		tfPhoneUser.setColumns(10);
		
		btnClearUser.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfNameUser.setText("");
				tfCPFUser.setText("");
				tfMailAdressUser.setText("");
				tfMailDomainUser.setText("");
				tfPhoneUser.setText("");
			}
		});
		
		btnCancelUser.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				System.out.println("Frame close with " + btnCancelUser.getText());
				System.exit(0);
			}
		});
		
		btnConfirmUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
				tmpUser = new User(tfNameUser.getText(),tfCPFUser.getText(),tfMailAdressUser.getText() + "@"+tfMailDomainUser.getText(),tfPhoneUser.getText());
				str.AddUser(tmpUser);
				System.out.println(str.searchCpf(tfCPFUser.getText()).getEmail());
			}
		});
		
		btnConfirmStore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				str = new Store(tfNameStore.getText());
				System.out.println("Make Store "+str.getName()+" ... OK");
				
			}
		});
		
		btnCancelStore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				System.out.println("Frame close with " + btnCancelStore.getText());
				System.exit(0);
			}
		});
		
		tfNameStore.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
		        tfNameStore = (JTextField) e.getSource();
		        String text = tfNameStore.getText();
		        tfNameStore.setText(text.toUpperCase());
		        if (!(tfNameStore.getText().equals(""))) {		        	
		        	btnConfirmStore.setEnabled(true);
		        } else btnConfirmStore.setEnabled(false);
		      }
		});
		
		tfNameUser.addKeyListener(new KeyAdapter() {
			
		});
	}
}