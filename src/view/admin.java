/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import model.sanpham;
import model.SanphamCT;
import model.Hoadon;
import controller.DAOspCT;
import controller.DAOsp;
import controller.DAOhd;
import controller.DAOus;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.lang.UnsupportedOperationException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import controller.ServerConnection;
import model.User;

/**
 *
 * @author ADMIN
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
    private List<Hoadon> hoadon;
    private List<sanpham> Sanpham;
    private List<SanphamCT> sanphamct;
    private List<User> User;
    private List<sanpham> anhsp;
    private static DefaultTableModel ModelSP;
    private DefaultTableModel ModelUS;
    int selectedIndex;
    private sanpham currentsp;
    private Iterable<SanphamCT> sanphamCT;
    private DAOsp dao;
    public admin() {
        initComponents();
        ModelSP=(DefaultTableModel) TableSP.getModel();
        ModelUS=(DefaultTableModel) TableUS.getModel();
        dao = new DAOsp(); 
        showTableUS();
        showTableSP();
    }

   

     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableUS = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSP = new javax.swing.JTable();
        btnaddsp = new javax.swing.JButton();
        btnxoasp = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        addstt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        addmsp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        addtsp = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        addl = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        addsl = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        addg = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        addha = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmages/logo (2).png"))); // NOI18N
        jLabel23.setText("jLabel23");
        jLabel23.setPreferredSize(new java.awt.Dimension(107, 100));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 178, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ĐĂNG XUẤT");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(130, 45));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));

        TableUS.setAutoCreateRowSorter(true);
        TableUS.setBackground(new java.awt.Color(22, 36, 48));
        TableUS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TableUS.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        TableUS.setForeground(new java.awt.Color(204, 255, 255));
        TableUS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "STT", "Tên đăng nhập", "Mật khẩu"
            }
        ));
        TableUS.setGridColor(new java.awt.Color(153, 153, 153));
        TableUS.setSelectionBackground(new java.awt.Color(255, 153, 0));
        TableUS.setSelectionForeground(new java.awt.Color(0, 0, 51));
        TableUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableUSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableUS);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 470, 200));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        TableSP.setAutoCreateRowSorter(true);
        TableSP.setBackground(new java.awt.Color(22, 36, 48));
        TableSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TableSP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        TableSP.setForeground(new java.awt.Color(204, 255, 255));
        TableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Loại", "Số lượng kho", "Giá", "Hình ảnh"
            }
        ));
        TableSP.setGridColor(new java.awt.Color(153, 153, 153));
        TableSP.setSelectionBackground(new java.awt.Color(255, 153, 0));
        TableSP.setSelectionForeground(new java.awt.Color(0, 0, 51));
        TableSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableSP);
        if (TableSP.getColumnModel().getColumnCount() > 0) {
            TableSP.getColumnModel().getColumn(3).setHeaderValue("Loại");
            TableSP.getColumnModel().getColumn(4).setHeaderValue("Số lượng kho");
            TableSP.getColumnModel().getColumn(5).setHeaderValue("Giá");
            TableSP.getColumnModel().getColumn(6).setHeaderValue("Hình ảnh");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 470, 200));

        btnaddsp.setBackground(new java.awt.Color(0, 204, 204));
        btnaddsp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmages/icons8_add_to_clipboard_25px.png"))); // NOI18N
        btnaddsp.setText("Thêm sản phẩm");
        btnaddsp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaddsp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaddsp.setMaximumSize(new java.awt.Dimension(86, 20));
        btnaddsp.setMinimumSize(new java.awt.Dimension(86, 20));
        btnaddsp.setOpaque(true);
        btnaddsp.setPreferredSize(new java.awt.Dimension(170, 47));
        btnaddsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddspMouseClicked(evt);
            }
        });
        btnaddsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddspActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        btnxoasp.setBackground(new java.awt.Color(0, 204, 204));
        btnxoasp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnxoasp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmages/icons8_delete_bin_30px.png"))); // NOI18N
        btnxoasp.setText("Xoá sản phẩm");
        btnxoasp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnxoasp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnxoasp.setOpaque(true);
        btnxoasp.setPreferredSize(new java.awt.Dimension(170, 47));
        btnxoasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaspActionPerformed(evt);
            }
        });
        getContentPane().add(btnxoasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 100, 150));

        jPanel3.setBackground(new java.awt.Color(22, 36, 48));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("THÊM SẢN PHẨM MỚI");
        jPanel3.add(jLabel13);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("STT:                 ");
        jPanel3.add(jLabel20);

        addstt.setPreferredSize(new java.awt.Dimension(120, 25));
        jPanel3.add(addstt);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Mã sản phẩm: ");
        jPanel3.add(jLabel14);

        addmsp.setPreferredSize(new java.awt.Dimension(120, 25));
        addmsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmspActionPerformed(evt);
            }
        });
        jPanel3.add(addmsp);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tên sản phẩm:");
        jPanel3.add(jLabel15);

        addtsp.setPreferredSize(new java.awt.Dimension(120, 25));
        addtsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtspActionPerformed(evt);
            }
        });
        jPanel3.add(addtsp);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Loại:                 ");
        jPanel3.add(jLabel16);

        addl.setPreferredSize(new java.awt.Dimension(120, 25));
        addl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlActionPerformed(evt);
            }
        });
        jPanel3.add(addl);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Số lượng:        ");
        jPanel3.add(jLabel17);

        addsl.setPreferredSize(new java.awt.Dimension(120, 25));
        addsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addslActionPerformed(evt);
            }
        });
        jPanel3.add(addsl);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Giá:                  ");
        jPanel3.add(jLabel18);

        addg.setPreferredSize(new java.awt.Dimension(120, 25));
        addg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgActionPerformed(evt);
            }
        });
        jPanel3.add(addg);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Hình ảnh:        ");
        jPanel3.add(jLabel19);

        addha.setPreferredSize(new java.awt.Dimension(120, 25));
        addha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addhaActionPerformed(evt);
            }
        });
        jPanel3.add(addha);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, 260));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jmages/bia.jpg"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddspActionPerformed

    }//GEN-LAST:event_btnaddspActionPerformed

    private void loadData() {
        // Khởi tạo DAO và lấy danh sách sản phẩm
        DAOsp dao = new DAOsp();
        ArrayList<sanpham> invoiceList = dao.getListSP();
        ModelSP.setRowCount(0);
  for (sanpham Sanpham : invoiceList) {
            ModelSP.addRow(new Object[]{Sanpham.getMasp(),Sanpham.getTensp(), Sanpham.getLoai(), Sanpham.getSoluong(), Sanpham.getGia(), Sanpham.getHinhAnh() });
        }
    }
    private void TableSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSPMouseClicked
        selectedIndex=TableSP.getSelectedRow();
        sanpham sp= Sanpham.get(selectedIndex);
            
        int selectedIndex = TableSP.getSelectedRow();
        if (selectedIndex != -1) {
            String imageName = TableSP.getValueAt(selectedIndex, 6).toString();
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(imageName));
            Image img = imageIcon.getImage();
            Image newImg = img.getScaledInstance(100, 150, java.awt.Image.SCALE_SMOOTH);
            jLabel12.setIcon(new ImageIcon(newImg));
         }
        
        jLabel12.setVisible(true);
        
    }//GEN-LAST:event_TableSPMouseClicked
       private int clickCount = 0;
       private int lastSelectedIndex = -1;
    public static int getSPQuantity(String masp) {
    for (int i = 0; i < ModelSP.getRowCount(); i++) {
        if (masp.equals(ModelSP.getValueAt(i, 1))) { 
            return (int) ModelSP.getValueAt(i, 4);  
        }
    }
    return -1;  // Return -1 or an appropriate value if not found
}



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int confirmed = JOptionPane.showConfirmDialog(null, 
            "Bạn muốn đăng xuất?", "Xác nhận đăng xuất",            
            JOptionPane.YES_NO_OPTION);
        System.out.println("Client da thoat khoi trang.");

        // Kiểm tra phản hồi của người dùng
        if (confirmed == JOptionPane.YES_OPTION) {
            // Người dùng chọn 'Yes', thực hiện đăng xuất
            start st = new start();
            st.setVisible(true); 
            dispose();
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnaddspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddspMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddspMouseClicked

    private void addmspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addmspActionPerformed

    private void addtspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addtspActionPerformed

    private void addlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addlActionPerformed

    private void addslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addslActionPerformed

    private void addgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addgActionPerformed

    private void addhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addhaActionPerformed

    private void btnxoaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaspActionPerformed
        selectedIndex=TableSP.getSelectedRow();
        int confirmationResult=JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xoá!");
        sanpham sp =Sanpham.get(selectedIndex);
        if(confirmationResult==JOptionPane.YES_OPTION) { 
        ServerConnection.sendDeletedspToServer(sp);
        new DAOsp().DeleteSP(sp.getID());
        showTableSP();   
        }
       
// TODO add your handling code here:
    }//GEN-LAST:event_btnxoaspActionPerformed

    private void TableUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableUSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableUSMouseClicked

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableSP;
    private javax.swing.JTable TableUS;
    private javax.swing.JTextField addg;
    private javax.swing.JTextField addha;
    private javax.swing.JTextField addl;
    private javax.swing.JTextField addmsp;
    private javax.swing.JTextField addsl;
    private javax.swing.JTextField addstt;
    private javax.swing.JTextField addtsp;
    private javax.swing.JButton btnaddsp;
    private javax.swing.JButton btnxoasp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void showTableSP() {
       Sanpham=new DAOsp().getListSP();
       ModelSP.setRowCount(0);
       for(sanpham s:Sanpham) {
           ModelSP.addRow(new Object[]{
               TableSP.getRowCount()+1,s.getMasp(),s.getTensp(),s.getLoai(),s.getSoluong(),s.getGia(),s.getHinhAnh()
           });
       }
    }
    private void showTableUS() {
       User =new DAOus().getListUS();
       ModelUS.setRowCount(0);
       for(User s: User) {
           ModelUS.addRow(new Object[]{
               TableUS.getRowCount()+1,s.getUsername(),s.getPassword()
           });
       }
    }
}

