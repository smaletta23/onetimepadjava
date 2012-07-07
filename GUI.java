package com.google.jerry.otp;

import javax.swing.*;
import com.google.jerry.otp.OneTimePad;

public class GUI {
    private JTextField de_keyInput;
    private JTextField de_messageInput;
    private JTextField de_output;
    private JButton en_button;
    private JButton de_button;
    private JButton generateKey;
    private JTextField en_keyInput;
    private JTextField en_messageInput;
    private JTextField en_output;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private OneTimePad otp = new OneTimePad();
    
    public GUI(JFrame frame) {
    	 jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         jLabel3 = new javax.swing.JLabel();
         en_messageInput = new javax.swing.JTextField();
         en_keyInput = new javax.swing.JTextField();
         jLabel5 = new javax.swing.JLabel();
         jLabel6 = new javax.swing.JLabel();
         de_messageInput = new javax.swing.JTextField();
         de_keyInput = new javax.swing.JTextField();
         generateKey = new javax.swing.JButton();
         jLabel7 = new javax.swing.JLabel();
         jLabel4 = new javax.swing.JLabel();
         en_output = new javax.swing.JTextField();
         de_output = new javax.swing.JTextField();
         en_button = new javax.swing.JButton();
         de_button = new javax.swing.JButton();

         frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         try {
			javax.swing.UIManager.setLookAndFeel("Windows");
		 } catch (Exception e) {
		 	e.printStackTrace();
		 }
         en_button.addActionListener(new java.awt.event.ActionListener() {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 String message = en_messageInput.getText();
        		 String key = en_keyInput.getText();
        		 
        		 if (message.length() != key.length()) en_output.setText("Message and Key must be of equal length");
        		 else {
        			 en_output.setText(otp.encrypt(message, key));
        		 }
        	 }
         });
         
         de_button.addActionListener(new java.awt.event.ActionListener() {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 String message = de_messageInput.getText();
        		 String key = de_keyInput.getText();
        		 
        		 if (message.length() != key.length()) de_output.setText("Message and Key must be of equal length");
        		 else {
        			 de_output.setText(otp.decrypt(message, key));
        		 }
        	 }
         });
         
         generateKey.addActionListener(new java.awt.event.ActionListener() {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 String key = otp.genKey(en_messageInput.getText().length());
        		 en_keyInput.setText(key);
        		 de_keyInput.setText(key);
        	 }
         });
         
         jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
         jLabel1.setText("One Time Pad Encryption/Decryption");

         jLabel2.setText("Message: ");

         jLabel3.setText("Key: ");

         jLabel5.setText("Encrypt");

         jLabel6.setText("Decrypt");

         generateKey.setText("Generate Key");

         jLabel7.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
         jLabel7.setText("Note: Key can be generated or user supplied");

         jLabel4.setText("Output:");

         en_button.setText("Encrypt");

         de_button.setText("Decrypt");

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
         frame.getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGap(124, 124, 124)
                 .addComponent(jLabel5)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(jLabel6)
                 .addGap(78, 78, 78))
             .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                         .addGap(22, 22, 22)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(layout.createSequentialGroup()
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addComponent(jLabel2)
                                     .addComponent(jLabel3)
                                     .addComponent(jLabel4))
                                 .addGap(28, 28, 28)
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                         .addComponent(en_output, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                         .addComponent(en_messageInput, javax.swing.GroupLayout.Alignment.LEADING)
                                         .addComponent(en_keyInput, javax.swing.GroupLayout.Alignment.LEADING))
                                     .addGroup(layout.createSequentialGroup()
                                         .addGap(10, 10, 10)
                                         .addComponent(en_button)))
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addGroup(layout.createSequentialGroup()
                                         .addGap(39, 39, 39)
                                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(de_keyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(de_messageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(de_output, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                         .addComponent(de_button)
                                         .addGap(16, 16, 16))))
                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                 .addComponent(jLabel7)
                                 .addGap(62, 62, 62))))
                     .addGroup(layout.createSequentialGroup()
                         .addGap(54, 54, 54)
                         .addComponent(jLabel1)))
                 .addContainerGap(25, Short.MAX_VALUE))
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(generateKey)
                 .addGap(120, 120, 120))
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jLabel1)
                 .addGap(18, 18, 18)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel5)
                     .addComponent(jLabel6))
                 .addGap(21, 21, 21)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                         .addComponent(jLabel2)
                         .addGap(18, 18, 18)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel3)
                             .addComponent(en_keyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                     .addGroup(layout.createSequentialGroup()
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(en_messageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(de_messageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                         .addComponent(de_keyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addComponent(jLabel7)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(generateKey)
                 .addGap(29, 29, 29)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4)
                     .addComponent(en_output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(de_output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(en_button)
                     .addComponent(de_button))
                 .addContainerGap(30, Short.MAX_VALUE))
         );

         frame.pack();
    }
}