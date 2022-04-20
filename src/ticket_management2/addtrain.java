/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket_management2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP Pavilion
 */
public class addtrain extends javax.swing.JFrame {
 Connection con=null;
    /**
     * Creates new form addtrain
     */
    public addtrain() {
        initComponents();
      con=jdbcconnection.con();
      operation();
        this.setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
      PreparedStatement pst;
         ResultSet rs;
    
    @SuppressWarnings("unchecked")
    
    public void operation(){
        try{
            
        pst=(PreparedStatement) con.prepareStatement("SELECT * from addtrain1");
                
                
          rs=pst.executeQuery();
                
                ResultSetMetaData rsd= rs.getMetaData();
                int clm;
                clm=rsd.getColumnCount();
                 DefaultTableModel df1=(DefaultTableModel) jTable1.getModel();
                 /*uses a Vector of Vectors to store the cell value objects. */
                 df1.setRowCount(0);
                  //Vector v1=new Vector();
                 while(rs.next())
                 {
                     Vector v1=new Vector();
                     for(int i=1;i<=clm;i++)
                     {
                          
                            v1.add(rs.getString("trainname"));
                         
                            v1.add(rs.getString("source"));
                            v1.add(rs.getString("destination_place"));
                            
                            v1.add(rs.getString("date"));
                            v1.add(rs.getString("departure_time"));
                            v1.add(rs.getString("arrival_time"));
                            v1.add(rs.getString("Compartment"));
                            v1.add(rs.getString("Price"));
                 
                     
                     }
                     df1.addRow(v1);
                 
                 }
                 
                
              
                
            } catch (SQLException ex) { 
          java.util.logging.Logger.getLogger(addtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } 
        
        
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        addbutton = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtdeptime = new javax.swing.JTextField();
        txtartime = new javax.swing.JTextField();
        txttrainname = new javax.swing.JComboBox<>();
        txtfrom = new javax.swing.JComboBox<>();
        txtto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comptxt = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("From:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("train_name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("To:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Date:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Adding Train");

        txtdate.setBackground(new java.awt.Color(0, 153, 204));
        txtdate.setForeground(new java.awt.Color(0, 0, 102));
        txtdate.setDateFormatString("yyyy-MM-dd");

        addbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbutton.setForeground(new java.awt.Color(0, 0, 102));
        addbutton.setText("Add");
        addbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 102));
        delete.setText("Cancel");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Departuretime:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Arrivaltime:");

        txtdeptime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtartime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txttrainname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txttrainname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "train1", "train2", "train3", "train4" }));
        txttrainname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtfrom.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtfrom.setForeground(new java.awt.Color(51, 51, 51));
        txtfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rajshahi", "Dhaka", "Rangpur", "Chittagong", "Barishal", "Sylhet" }));

        txtto.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtto.setForeground(new java.awt.Color(51, 51, 51));
        txtto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rajshahi", "Dhaka", "Rangpur", "Chittagong", "Barishal", "Sylhet" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Compartment:");

        comptxt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        comptxt.setForeground(new java.awt.Color(51, 51, 51));
        comptxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC_B", "AC_S", "F_BERTH", "F_CHAIR", "F_SEAT", "SHOVAN", "SNIGDHA", "S_CHAIR" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Price:");

        pricetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 102));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 0, 102));
        Delete.setText("Delete");
        Delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txttrainname, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtdeptime, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pricetxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comptxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtartime))))
                        .addGap(336, 336, 336))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdeptime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttrainname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtartime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Date table:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trainname", "From", "To", "Date", "DepartureTime", "Arrival Time", "Compartment", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:

        //  String tno=txttrainno.getSelectedItem().toString();
        String tname=txttrainname.getSelectedItem().toString();
        String from=txtfrom.getSelectedItem().toString();
        String to=txtto.getSelectedItem().toString();
        SimpleDateFormat date_formate= new SimpleDateFormat("yyyy-MM-dd");
        String date=date_formate.format(txtdate.getDate());
        String deptime=txtdeptime.getText();
        String artime=txtartime.getText();
        String  compartment=comptxt.getSelectedItem().toString();
        String  price=pricetxt.getText();
        //String status="empty";
        //  String op=txtoption.getText();
        // String price=txtprice.getText();

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            //con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
            pst=(PreparedStatement) con.prepareStatement("insert into addtrain1(trainname,source,destination_place,date,departure_time,arrival_time,Compartment,Price)values(?,?,?,?,?,?,?,?)");
            // pst.setString(1,tno);
            pst.setString(1,tname);
            pst.setString(2,from);
            pst.setString(3,to);
            pst.setString(4,date);
            pst.setString(5,deptime);
            pst.setString(6,artime);
            pst.setString(7,compartment);
            pst.setString(8,price);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"done!!!");
            operation();
           
            
                    
             //to keep tha table 
             txttrainname.setSelectedIndex(-1);
             txtfrom.setSelectedIndex(-1);
             txtto.setSelectedIndex(-1);
             txtdate.getDate();
             txtdeptime.setText("");
             txtartime.setText("");
             comptxt.setSelectedIndex(-1);
             pricetxt.setText("");
             txttrainname.requestFocus();
           //when update value it will be needed.

        } catch (SQLException ex) { 
         java.util.logging.Logger.getLogger(addtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } 
        
       new main_menu().setVisible(true);

    }//GEN-LAST:event_addbuttonActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new main_menu().setVisible(true);
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        
        
      
        

        try {
                DefaultTableModel df=(DefaultTableModel) jTable1.getModel();
            int select=jTable1.getSelectedRow();
              String tname=txttrainname.getSelectedItem().toString();
        String from=txtfrom.getSelectedItem().toString();
        String to=txtto.getSelectedItem().toString();
        
         SimpleDateFormat date_formate= new SimpleDateFormat("yyyy-MM-dd");
        String date=date_formate.format(txtdate.getDate());
        String deptime=txtdeptime.getText();
        String artime=txtartime.getText();
        String  compartment=comptxt.getSelectedItem().toString();
        String  price=pricetxt.getText();
            
            
            //Class.forName("com.mysql.jdbc.Driver");
            //con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
            pst=(PreparedStatement) con.prepareStatement("update addtrain1 set source=?,destination_place=?,date=?,departure_time=?,arrival_time=?,Compartment=?,price=? where trainname=?");
            
            pst.setString(1,from);
            pst.setString(2,to);
            pst.setString(3,date);
            pst.setString(4,deptime);
            pst.setString(5,artime);
            pst.setString(6,compartment);
            pst.setString(7,price);
            pst.setString(8,tname);
           
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"update done!!!");
            
             addbutton.setEnabled(true);
             
             //add the updated data...
             
             txttrainname.setSelectedIndex(-1);
             txtfrom.setSelectedIndex(-1);
             txtto.setSelectedIndex(-1);
             txtdate.getDate();
             txtdeptime.setText("");
             txtartime.setText("");
             comptxt.setSelectedIndex(-1);
             pricetxt.setText("");
             txttrainname.requestFocus();
             
             operation();
           
               
                
        } catch (SQLException ex) { 
         java.util.logging.Logger.getLogger(addtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } 
        
        
    }//GEN-LAST:event_updateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     try {
         DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
         int select=jTable1.getSelectedRow();
         
         String tname=df.getValueAt(select,0).toString();
         String from= df.getValueAt(select,1).toString();
         String to=df.getValueAt(select,2).toString();
         Date  date=new SimpleDateFormat("yyyy-MM-dd").parse(df.getValueAt(select,3).toString());
         String dep=df.getValueAt(select,4).toString();
         String ar=df.getValueAt(select,5).toString();
         String comp=df.getValueAt(select,6).toString();
         String price=df.getValueAt(select,7).toString();
         
         txttrainname.setSelectedItem(tname);
         txtfrom.setSelectedItem(from);
         txtto.setSelectedItem(to);
         txtdate.setDate(date);
         txtdeptime.setText(dep);
         txtartime.setText(ar);
         comptxt.setSelectedItem(comp);
         pricetxt.setText(price);
         
         
         addbutton.setEnabled(false);
     } catch (ParseException ex) {
         java.util.logging.Logger.getLogger(addtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        try {
                DefaultTableModel df=(DefaultTableModel) jTable1.getModel();
            int select=jTable1.getSelectedRow();
              String tname=txttrainname.getSelectedItem().toString();
       // String from=txtfrom.getSelectedItem().toString();
       // String to=txtto.getSelectedItem().toString();
        
         //SimpleDateFormat date_formate= new SimpleDateFormat("yyyy-MM-dd");
        //String date=date_formate.format(txtdate.getDate());
       // String deptime=txtdeptime.getText();
       // String artime=txtartime.getText();
       // String  compartment=comptxt.getSelectedItem().toString();
       // String  price=pricetxt.getText();
            
            
            //Class.forName("com.mysql.jdbc.Driver");
            //con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
            pst=(PreparedStatement) con.prepareStatement("delete from addtrain1 where trainname=?");
            
            pst.setString(1,tname);
           // pst.setString(2,to);
           // pst.setString(3,date);
           // pst.setString(4,deptime);
           // pst.setString(5,artime);
           // pst.setString(6,compartment);
           // pst.setString(7,price);
           // pst.setString(8,tname);
           
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"Delete Successfully!!!");
            
             
             
             //add the updated data...
             
             txttrainname.setSelectedIndex(-1);
             txtfrom.setSelectedIndex(-1);
             txtto.setSelectedIndex(-1);
             txtdate.getDate();
             txtdeptime.setText("");
             txtartime.setText("");
             comptxt.setSelectedIndex(-1);
             pricetxt.setText("");
             txttrainname.requestFocus();
             
             operation();
             addbutton.setEnabled(true);
           
               
                
        } catch (SQLException ex) { 
         java.util.logging.Logger.getLogger(addtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } 
        
        
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(addtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addtrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton addbutton;
    private javax.swing.JComboBox<String> comptxt;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField txtartime;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtdeptime;
    private javax.swing.JComboBox<String> txtfrom;
    private javax.swing.JComboBox<String> txtto;
    private javax.swing.JComboBox<String> txttrainname;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
