/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_ahmedamerbakouban;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmad
 */
public class CaluclateGYMSystem extends javax.swing.JFrame {

    /**
     * Creates new form CaluclateGYMSystem
     */
    public CaluclateGYMSystem() {
        initComponents();
        setLocationRelativeTo(null);//display frame in center
        date();//call date metode in the class
    }
    public static ArrayList<P_AhmedAmerBakouban> gymList = new ArrayList<P_AhmedAmerBakouban>();
    
    

    public static void writeFile() throws IOException {
        FileWriter tulis = new FileWriter("CustomerInfo.txt");
        PrintWriter teks = new PrintWriter(tulis);
        for (P_AhmedAmerBakouban s : gymList) {//for each loop travels alone the List 
            teks.write(s.toStringForFile());
        }
        tulis.close();
    }
    
    public static void readFile () throws IOException{
        
    
   File inFile = new File ("CustomerInfo.txt");
   Scanner scanner = new Scanner (inFile);
   while (scanner.hasNextLine ()) { //check if there are more line
    String line = scanner.nextLine ();
    OutputTA.append (line + "\n");
   }//akan dpt error, tasalary not static, cannot be referred to static variable. so
                              //zight click properties tasalary, code, chopose static
   scanner.close ();
    }
    
     public void date(){
        Date dateT = new Date();
        SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd");
        
        String add = date2.format(dateT);
        timeTF.setText("DATE  "+add);
        Calendar clo = new GregorianCalendar();
        int second = clo.get(Calendar.SECOND);
        int minute = clo.get(Calendar.MINUTE);
        int hour = clo.get(Calendar.HOUR);
        timeLB.setText("TIME  " + hour + ":" + minute + ":" + second);
    }
     
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IDTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        custNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BronzeRB = new javax.swing.JRadioButton();
        SilverRB = new javax.swing.JRadioButton();
        GoldRB = new javax.swing.JRadioButton();
        CustTypeCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        SubscribesCB = new javax.swing.JComboBox<>();
        ADDTNB = new javax.swing.JButton();
        DisplayTNB = new javax.swing.JButton();
        SearchTNB = new javax.swing.JButton();
        editBTN = new javax.swing.JButton();
        DeleteTNB = new javax.swing.JButton();
        ResetTNB = new javax.swing.JButton();
        ExitTNB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputTA = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        totalPaymentTF = new javax.swing.JTextField();
        timeTF = new javax.swing.JLabel();
        timeLB = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GYM FEE CALCULATOR");

        jPanel3.setBackground(new java.awt.Color(153, 86, 19));

        jPanel1.setBackground(new java.awt.Color(153, 86, 19));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INPUT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 20, 20));

        IDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTFActionPerformed(evt);
            }
        });
        jPanel1.add(IDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 128, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 52, -1, -1));
        jPanel1.add(custNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 49, 128, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 52, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        BronzeRB.setBackground(new java.awt.Color(153, 86, 19));
        buttonGroup1.add(BronzeRB);
        BronzeRB.setForeground(new java.awt.Color(255, 255, 255));
        BronzeRB.setText("Bronze");
        jPanel1.add(BronzeRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        SilverRB.setBackground(new java.awt.Color(153, 86, 19));
        buttonGroup1.add(SilverRB);
        SilverRB.setForeground(new java.awt.Color(255, 255, 255));
        SilverRB.setText("Silver");
        jPanel1.add(SilverRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        GoldRB.setBackground(new java.awt.Color(153, 86, 19));
        buttonGroup1.add(GoldRB);
        GoldRB.setForeground(new java.awt.Color(255, 255, 255));
        GoldRB.setText("Gold");
        jPanel1.add(GoldRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        CustTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Membership", "Government Employee", "non-member" }));
        CustTypeCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(CustTypeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 49, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Subscribes");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 104, -1, -1));

        SubscribesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month ", "Three Months", "Six Months", "Year" }));
        jPanel1.add(SubscribesCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 101, -1, -1));

        ADDTNB.setBackground(new java.awt.Color(240, 200, 161));
        ADDTNB.setText("ADD");
        ADDTNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDTNBActionPerformed(evt);
            }
        });
        jPanel1.add(ADDTNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 268, -1, -1));

        DisplayTNB.setBackground(new java.awt.Color(240, 200, 161));
        DisplayTNB.setText("DISPLAY ALL");
        DisplayTNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayTNBActionPerformed(evt);
            }
        });
        jPanel1.add(DisplayTNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        SearchTNB.setBackground(new java.awt.Color(240, 200, 161));
        SearchTNB.setText("SEARCH");
        SearchTNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTNBActionPerformed(evt);
            }
        });
        jPanel1.add(SearchTNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        editBTN.setBackground(new java.awt.Color(240, 200, 161));
        editBTN.setText("EDIT");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });
        jPanel1.add(editBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        DeleteTNB.setBackground(new java.awt.Color(240, 200, 161));
        DeleteTNB.setText("DELETE");
        DeleteTNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTNBActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteTNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        ResetTNB.setBackground(new java.awt.Color(240, 200, 161));
        ResetTNB.setText("RESET");
        ResetTNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetTNBActionPerformed(evt);
            }
        });
        jPanel1.add(ResetTNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        ExitTNB.setBackground(new java.awt.Color(240, 200, 161));
        ExitTNB.setText("EXIT");
        ExitTNB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitTNBActionPerformed(evt);
            }
        });
        jPanel1.add(ExitTNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 86, 19));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OUTPUT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        OutputTA.setColumns(20);
        OutputTA.setRows(5);
        jScrollPane1.setViewportView(OutputTA);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Payment");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(totalPaymentTF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(totalPaymentTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeTF.setForeground(new java.awt.Color(255, 255, 255));
        timeTF.setText("jLabel9");

        timeLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeLB.setForeground(new java.awt.Color(255, 255, 255));
        timeLB.setText("jLabel7");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GYM FEE SYSTEM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(timeTF)
                        .addGap(34, 34, 34)
                        .addComponent(timeLB))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTFActionPerformed

    private void ADDTNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDTNBActionPerformed
        try {
            String id = IDTF.getText();
            String custName = custNameTF.getText();
            String custType = (String) CustTypeCB.getSelectedItem();
            String custCategory = null;
            String subscribes = (String) SubscribesCB.getSelectedItem();
            double totalPayment = 0.0;
            

            if (BronzeRB.isSelected()) {
                custCategory = "Bronze";
            }
            if (SilverRB.isSelected()) {
                custCategory = "Silver";
            }
            if (GoldRB.isSelected()) {
                custCategory = "Gold";
            }
            

            P_AhmedAmerBakouban ah = new P_AhmedAmerBakouban(id, custName, custType, custCategory, subscribes);
            
            ah.calculateTraineeType();
            ah.calculateTraineeSubscribe();
            gymList.add(ah);
            totalPaymentTF.setText(String.valueOf(ah.getTotalPayment()));
            OutputTA.setText(ah.toString());
            
            JOptionPane.showMessageDialog(null, "Data is saved.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
             writeFile();
             
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please ensure your input is correct!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }

             
    }//GEN-LAST:event_ADDTNBActionPerformed

    private void DisplayTNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayTNBActionPerformed
       
        OutputTA.setText("CUSTOMER INFORMATION\n");
        OutputTA.append("*******************");
        int i = 0;
        for (P_AhmedAmerBakouban GYM : gymList) {
            OutputTA.append("\n");
            OutputTA.append("\n<<<<CUSTOMER(" + (i + 1) + ")>>>>>");
            OutputTA.append("\n");
            OutputTA.append(GYM.toString());
             i++;
            try {
                writeFile();
            }catch (Exception e) {
         System.out.println (e.getMessage ()) ;
         }
        
        }//for
        
        
    }//GEN-LAST:event_DisplayTNBActionPerformed

    private void SearchTNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTNBActionPerformed
               
      boolean found = false;
        String search = JOptionPane.showInputDialog("Enter the ID of the customer to search for: ");
        for (P_AhmedAmerBakouban gym : gymList) {             
           if (gym.getId().equals(search)) {
                custNameTF.setText(gym.getCustName());
                IDTF.setText(gym.getId());
                if(gym.getCustType().equalsIgnoreCase("Membership")){
                    CustTypeCB.setSelectedIndex(0);
                }
                if(gym.getCustType().equalsIgnoreCase("Government Employee")){
                    CustTypeCB.setSelectedIndex(1);
                }
                if(gym.getCustType().equalsIgnoreCase("non-member")){
                    CustTypeCB.setSelectedIndex(2);
                }
                 if(gym.getSubscribes().equalsIgnoreCase("Month")){
                    SubscribesCB.setSelectedIndex(0);
                }
                 if(gym.getSubscribes().equalsIgnoreCase("Three Months")){
                    SubscribesCB.setSelectedIndex(1);
                }
                 if(gym.getSubscribes().equalsIgnoreCase(" Six Months")){
                    SubscribesCB.setSelectedIndex(2);
                }
                 if(gym.getSubscribes().equalsIgnoreCase(" Year")){
                    SubscribesCB.setSelectedIndex(3);
                }
                 totalPaymentTF.setText(String.valueOf(gym.getTotalPayment()));
                 if(gym.getCustCategory().equalsIgnoreCase("Bronze")){
                    BronzeRB.setSelected(true);
                }
                 if(gym.getCustCategory().equalsIgnoreCase("Silver")){
                    SilverRB.setSelected(true);
                }
                 if(gym.getCustCategory().equalsIgnoreCase("Gold")){
                   GoldRB.setSelected(true);
                }
                
                OutputTA.setText(gym.toString());
                
                found = true;
                break;
            }//if  
        }//for
        if (found == false) {
            JOptionPane.showMessageDialog(null, "The file can't be found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchTNBActionPerformed

    private void DeleteTNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTNBActionPerformed
       int index;
        boolean found = false;
        String delete = JOptionPane.showInputDialog ("Enter the ID of the customer to delete for: ");
         for (P_AhmedAmerBakouban GYM : gymList) {
          if (GYM.getId().equals(delete)){
          index = gymList.indexOf(GYM);//indexOf s object in the customer arraylist
          gymList.remove(index);//remove object from arrayList
          try{
        writeFile();
         }catch (Exception e) {
         System.out.println (e.getMessage ()) ;
         }
          JOptionPane.showMessageDialog(null, "The file has been deleted successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);     
          found = true;
          break;
           }//if  
         }//for
        if(found == false)   
          JOptionPane.showMessageDialog (null, "The file can't be found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_DeleteTNBActionPerformed

    private void ResetTNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetTNBActionPerformed
       IDTF.setText("");
       custNameTF.setText("");
       totalPaymentTF.setText("");
       SubscribesCB.setSelectedIndex(0);
       CustTypeCB.setSelectedIndex(0);
        BronzeRB.setSelected(false);
        GoldRB.setSelected(false);
        SilverRB.setSelected(false);
    }//GEN-LAST:event_ResetTNBActionPerformed

    private void ExitTNBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitTNBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitTNBActionPerformed

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
      try {
          
            String id = IDTF.getText();
            String custName = custNameTF.getText();
            String custType = (String) CustTypeCB.getSelectedItem();
            String custCategory = null;
            String subscribes = (String) SubscribesCB.getSelectedItem();
            double totalPayment = 0.0;
            for (P_AhmedAmerBakouban gym : gymList) {
             int index = gymList.indexOf(gym);
             P_AhmedAmerBakouban ah = new P_AhmedAmerBakouban(id, custName, custType, custCategory, subscribes);
              gymList.set(index, gym);
             ah.calculateTraineeType();
            ah.calculateTraineeSubscribe();
            OutputTA.setText(gym.toString());
            writeFile();
             JOptionPane.showMessageDialog(null, "Data has been Updated.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
      } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please ensure your input is correct!", "ERROR", JOptionPane.ERROR_MESSAGE);
      } catch(Exception e){
            System.out.print(e.getMessage());
        }
            
    }//GEN-LAST:event_editBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CaluclateGYMSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaluclateGYMSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaluclateGYMSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaluclateGYMSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaluclateGYMSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDTNB;
    private javax.swing.JRadioButton BronzeRB;
    private javax.swing.JComboBox<String> CustTypeCB;
    private javax.swing.JButton DeleteTNB;
    private javax.swing.JButton DisplayTNB;
    private javax.swing.JButton ExitTNB;
    private javax.swing.JRadioButton GoldRB;
    private javax.swing.JTextField IDTF;
    private static javax.swing.JTextArea OutputTA;
    private javax.swing.JButton ResetTNB;
    private javax.swing.JButton SearchTNB;
    private javax.swing.JRadioButton SilverRB;
    private javax.swing.JComboBox<String> SubscribesCB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField custNameTF;
    private javax.swing.JButton editBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel timeLB;
    private javax.swing.JLabel timeTF;
    private javax.swing.JTextField totalPaymentTF;
    // End of variables declaration//GEN-END:variables
}
