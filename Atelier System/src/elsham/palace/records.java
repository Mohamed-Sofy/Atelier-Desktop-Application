/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsham.palace;

import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.table.TableModel;
import javax.swing.JFrame;




public class records extends javax.swing.JFrame  {
  public int  index_privat;

     Connection conn=null;
    ResultSet re=null;
    PreparedStatement str=null;
  int index ;
    show_table_data show = new show_table_data();
    public records() {
        initComponents();
     setResizable(false);
        show_bill_table();
        
        d.setEnabled(false);
        m.setEnabled(false);
        y.setEnabled(false);
        name.setEnabled(false);
        id.setEnabled(false);
        t.setEnabled(false);
        txt_nn.setEnabled(false);
        
    }

    
    
     void show_bill_table()
    {
        
        try{
            conn = Java_connect.connect();
            String sql ="select bill_id , date_recive , dress_id , dress_type from bill_table";
            str = conn.prepareStatement(sql);
            re =str.executeQuery();
            table_rec.setModel(DbUtils.resultSetToTableModel(re));
            
            conn.close();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table_rec = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        t = new javax.swing.JComboBox();
        y = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        m = new javax.swing.JComboBox();
        d = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        search = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_nn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_rec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        table_rec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "الرقم المسلسل", "تاريخ الاستلام", "رقم الفستان", "نوع الفستان"
            }
        ));
        table_rec.setAlignmentX(2.0F);
        table_rec.setAlignmentY(2.0F);
        table_rec.setMaximumSize(new java.awt.Dimension(5, 64));
        table_rec.setMinimumSize(new java.awt.Dimension(88, 88));
        table_rec.setRowHeight(50);
        table_rec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_recMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_recMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(table_rec);
        if (table_rec.getColumnModel().getColumnCount() > 0) {
            table_rec.getColumnModel().getColumn(0).setResizable(false);
            table_rec.getColumnModel().getColumn(0).setPreferredWidth(6);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setText("رجوع");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name.setToolTipText("اسم العميل");

        id.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        id.setToolTipText("رقم الفستان");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        t.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        t.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "فرح", "سواريه", "سواريه قصير", "اطفال", "خطوبه" }));

        y.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        y.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("سنه");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("شهر");

        m.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        d.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("يوم");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("تاريخ الاستلام");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.setText("بحث");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        search.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "بحث", "رقم الفاتوره", "تاريخ الاستلام ", "اسم العميل ", "رقم الفستان و نوعه" }));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("ok");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("مسح السجلات");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_nn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt_nn.setToolTipText("رقم الفاتوره");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(326, 326, 326)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))))
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_nn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_nn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_recMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_recMouseEntered
 
    }//GEN-LAST:event_table_recMouseEntered

    private void table_recMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_recMouseClicked
          //  show.update.setEnabled(false);
       // show.save.setEnabled(false);
        
        
        int i =table_rec.getSelectedRow();
     
        TableModel model = table_rec.getModel();
        String ss = model.getValueAt(i, 0).toString()  ;
        int id = Integer.parseInt(ss);
    
         show.index_s = id;
        show_all_data_about_dress(id);
       
        
    }//GEN-LAST:event_table_recMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        user_interface u = new user_interface();
        u.setSize(1100, 1000);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String search_txt = search.getSelectedItem().toString();
       
        
        
        
        if(search_txt == "تاريخ الاستلام ")
        {
           // JOptionPane.showMessageDialog(null, "ddddd");
             name.setEnabled(false);
            id.setEnabled(false);
            txt_nn.setEnabled(false);
            t.setEnabled(false);
            d.setEnabled(true);
            m.setEnabled(true);
            y.setEnabled(true);
            index =0;
            
        }
        
        else if(search_txt =="رقم الفاتوره")
        {
             name.setEnabled(false);
            id.setEnabled(false);
            t.setEnabled(false);
            d.setEnabled(false);
            m.setEnabled(false);
            y.setEnabled(false);
             txt_nn.setEnabled(true);
             index =3;
        }
                
             
        
        else if(search_txt == "اسم العميل ")
        {
            //JOptionPane.showMessageDialog(null, "2222");
            name.setEnabled(true);
              d.setEnabled(false);
               txt_nn.setEnabled(false);
            m.setEnabled(false);
            y.setEnabled(false);
        t.setEnabled(false);
        index =1;
        }
        else if(search_txt =="رقم الفستان و نوعه")
        {
          //  JOptionPane.showMessageDialog(null, "1111");
            name.setEnabled(true);
              d.setEnabled(false);
               txt_nn.setEnabled(false);
            m.setEnabled(false);
            y.setEnabled(false);
            id.setEnabled(true);
            t.setEnabled(true);
            index =2;
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(index== 0)
        {
              try{
           
            //////////////
        String d_txt = d.getSelectedItem().toString();
        String mo = m.getSelectedItem().toString();
        String y_txt = y.getSelectedItem().toString();
       
       String date_re =""+d_txt+"-"+mo+"-"+y_txt+"";
       conn = Java_connect.connect();
        String sql ="select bill_id , date_recive , dress_id , dress_type from bill_table where date_recive =?";
            str = conn.prepareStatement(sql);
            
            str.setString(1,date_re);
            
            re =str.executeQuery();
             
             table_rec.setModel(DbUtils.resultSetToTableModel(re));
            
         conn.close();
       
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
       
        }
        
        else if (index ==1)
        {
            String txt_name = name.getText().toString();
            
            try{
            conn = Java_connect.connect();
            String sql ="select bill_id , date_recive , dress_id , dress_type from bill_table where customer_name =?";
            str = conn.prepareStatement(sql);
            str.setString(1,txt_name);
            re =str.executeQuery();
            table_rec.setModel(DbUtils.resultSetToTableModel(re));
            
            conn.close();
            
        }catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, e);
            }  
        }
        else if(index == 2)
        {
            try{
            conn = Java_connect.connect();
            String sql ="select bill_id , date_recive , dress_id , dress_type from bill_table where dress_id =? and dress_type =?";
            str = conn.prepareStatement(sql);
             str.setString(1, id.getText().toString());
       str.setString(2,t.getSelectedItem().toString());
            re =str.executeQuery();
            table_rec.setModel(DbUtils.resultSetToTableModel(re));
            
            conn.close();
            
        }catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, e);
            }  
            
            
        }
        
        else if( index == 3)
        {
            String txt_ii = txt_nn.getText().toString();
            
            try{
            conn = Java_connect.connect();
            String sql ="select bill_id , date_recive , dress_id , dress_type from bill_table where bill_id =?";
            str = conn.prepareStatement(sql);
            str.setString(1,txt_ii);
            re =str.executeQuery();
            table_rec.setModel(DbUtils.resultSetToTableModel(re));
            
            conn.close();
            
        }catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, e);
            }  
            
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        del_username u = new del_username();
        u.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    void show_all_data_about_dress(int aa)
    {
        
        int id = aa;
        
        try{
             conn = Java_connect.connect();
            String sql ="select * from bill_table where bill_id =?";
            str = conn.prepareStatement(sql);
            
            str.setInt(1, id);
             
            re =str.executeQuery();
            if(re.next())
            {
                int d_id = re.getInt("dress_id");
                String d_id_text = Integer.toString(d_id);
                
                String d_type = re.getString("dress_type");
                float d_price = re.getFloat("dress_price");
                String d_price_text = Float.toString(d_price);
                
                float paid = re.getFloat("paid");
                String paid_text = Float.toString(paid);
                float stay = re.getFloat("stay");
                String stay_text = Float.toString(stay);
                
                String d_today = re.getString("date_today");
                String d_recive = re.getString("date_recive");
                String note =re.getString("notes");
                String name = re.getString("customer_name");
                String phone_num = re.getString("phone");
                String id_number = re.getString("id_number");
                String address = re.getString("address");
                
                String p1 = re.getString("phone1");
                String p2 = re.getString("phone2");
                 
                // this.setVisible(true);
               //  show.setSize(1083, 764);
                 
                show.setVisible(true);
                show.pack();
                show.setSize(1407, 706);
               show.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                 
                show.txt_idd.setText(Integer.toString(id));
              
                show.dress_num.setText(d_id_text);
                show.type.setText(d_type);
                show.txt_price.setText(d_price_text);
                show.paid.setText(paid_text);
                show.txt_stay.setText(stay_text);
                show.txt_date.setText(d_today);
                show.date_txt.setText(d_recive);
                show.note.setText(note);
                show.txt_name.setText(name);
                show.txt_id_num.setText(id_number);
                show.txt_telephonee.setText(phone_num);
                show.txt_address.setText(address);
                
                show.ph1.setText(p1);
                show.ph2.setText(p2);
            }
            
            conn.close();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
       
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox d;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox m;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox search;
    private javax.swing.JComboBox t;
    public javax.swing.JTable table_rec;
    private javax.swing.JTextField txt_nn;
    private javax.swing.JComboBox y;
    // End of variables declaration//GEN-END:variables
}
