/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import dao.LaptopDAO;
import dao.PCDAO;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Laptop;
import model.PC;

public class DetailProduct extends javax.swing.JDialog {

    /**
     * Creates new form ThemSP
     */
    private ProductForm owner;
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    public DetailProduct(javax.swing.JInternalFrame parent, javax.swing.JFrame owner, boolean modal) {
        super(owner, modal);       
        initComponents();
        setLocationRelativeTo(null);
        this.owner = (ProductForm) parent;
        if (this.owner.checklap()) {
            Laptop a = this.owner.getDetailLapTop();
            txtMaSanPham.setText(a.getMaMay());
            txtTenSanPham.setText(a.getTenMay());
            txtDonGia.setText(formatter.format(a.getGia())+"đ");
            txtCPU.setText(a.getTenCpu());
            txtRAM.setText(a.getRam());
            txtROM.setText(a.getRom());
            txtGPU.setText(a.getCardManHinh());
            txtXuatXu.setText(a.getXuatXu());
            cbxloaisp.setSelectedIndex(0);
            txtKichThuocMan.setText(Double.toString(a.getkichThuocMan()));
            txtDungLuongPin.setText(a.getDungLuongPin());
            txtSoLuong.setText(Integer.toString(a.getSoLuong()));
        } else {
            PC a = this.owner.getDetailPC();
            txtMaSanPham.setText(a.getMaMay());
            txtTenSanPham.setText(a.getTenMay());
            txtDonGia.setText(formatter.format(a.getGia())+"đ");
            txtCPU.setText(a.getTenCpu());
            txtRAM.setText(a.getRam());
            txtROM.setText(a.getRom());
            txtGPU.setText(a.getCardManHinh());
            txtXuatXu.setText(a.getXuatXu());
            cbxloaisp.setSelectedIndex(1);
            txtMainBoard.setText(a.getMainBoard());
            txtCongsuatNguon.setText(Integer.toString(a.getCongSuatNguon()) + "W");
            txtSoLuong.setText(Integer.toString(a.getSoLuong()));
        }
    }
    

    private DetailProduct(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCPU = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRAM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtROM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGPU = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxloaisp = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        laptop = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtKichThuocMan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDungLuongPin = new javax.swing.JTextField();
        pc = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtMainBoard = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCongsuatNguon = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtXuatXu = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm sản phẩm mới");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Mã sản phẩm");

        txtMaSanPham.setEnabled(false);

        jLabel3.setText("Tên sản phẩm");

        txtTenSanPham.setEnabled(false);

        jLabel4.setText("Đơn giá");

        txtDonGia.setEnabled(false);

        jLabel6.setText("CPU");

        txtCPU.setEnabled(false);

        jLabel7.setText("RAM");

        txtRAM.setEnabled(false);

        jLabel8.setText("Dung lượng lưu trữ");

        txtROM.setEnabled(false);
        txtROM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtROMActionPerformed(evt);
            }
        });

        jLabel9.setText("Card đồ hoạ");

        txtGPU.setEnabled(false);

        jLabel10.setText("Loại sản phẩm");

        cbxloaisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "PC - Lắp ráp" }));
        cbxloaisp.setEnabled(false);
        cbxloaisp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxloaispItemStateChanged(evt);
            }
        });
        cbxloaisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxloaispActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.CardLayout());

        laptop.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Kích thước màn");

        txtKichThuocMan.setEnabled(false);

        jLabel12.setText("Dung lượng PIN");

        txtDungLuongPin.setEnabled(false);

        javax.swing.GroupLayout laptopLayout = new javax.swing.GroupLayout(laptop);
        laptop.setLayout(laptopLayout);
        laptopLayout.setHorizontalGroup(
            laptopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtKichThuocMan)
            .addGroup(laptopLayout.createSequentialGroup()
                .addGroup(laptopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 98, Short.MAX_VALUE))
            .addComponent(txtDungLuongPin)
        );
        laptopLayout.setVerticalGroup(
            laptopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laptopLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKichThuocMan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDungLuongPin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(laptop, "card2");

        pc.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel13.setText("MainBoard");

        txtMainBoard.setEnabled(false);
        txtMainBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMainBoardActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel14.setText("Công suất nguồn");

        txtCongsuatNguon.setEnabled(false);

        javax.swing.GroupLayout pcLayout = new javax.swing.GroupLayout(pc);
        pc.setLayout(pcLayout);
        pcLayout.setHorizontalGroup(
            pcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMainBoard)
            .addComponent(txtCongsuatNguon)
            .addGroup(pcLayout.createSequentialGroup()
                .addGroup(pcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 79, Short.MAX_VALUE))
        );
        pcLayout.setVerticalGroup(
            pcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCongsuatNguon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(pc, "card2");

        jLabel15.setText("Xuất xứ");

        txtXuatXu.setEnabled(false);

        txtSoLuong.setEnabled(false);

        jLabel5.setText("Số lượng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(txtSoLuong))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtROM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(txtGPU, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxloaisp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtXuatXu))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtROM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel15))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGPU, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 880, 330));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÔNG TIN SẢN PHẨM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxloaispItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxloaispItemStateChanged
        // TODO add your handling code here:
        if (cbxloaisp.getSelectedItem().equals("Laptop")) {
            CardLayout productCategory = (CardLayout) jPanel3.getLayout();
            productCategory.first(jPanel3);

        }

        if (cbxloaisp.getSelectedItem().equals("PC - Lắp ráp")) {
            CardLayout productCategory = (CardLayout) jPanel3.getLayout();
            productCategory.last(jPanel3);
        }
    }//GEN-LAST:event_cbxloaispItemStateChanged

    private void cbxloaispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxloaispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxloaispActionPerformed

    private void txtROMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtROMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtROMActionPerformed

    private void txtMainBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMainBoardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMainBoardActionPerformed

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
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailProduct dialog = new DetailProduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxloaisp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel laptop;
    private javax.swing.JPanel pc;
    private javax.swing.JTextField txtCPU;
    private javax.swing.JTextField txtCongsuatNguon;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDungLuongPin;
    private javax.swing.JTextField txtGPU;
    private javax.swing.JTextField txtKichThuocMan;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtMainBoard;
    private javax.swing.JTextField txtRAM;
    private javax.swing.JTextField txtROM;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtXuatXu;
    // End of variables declaration//GEN-END:variables
}
