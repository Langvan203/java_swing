/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import dao.AccountDAO;
import dao.ChiTietPhieuNhapDAO;
import dao.ChiTietPhieuXuatDAO;
import dao.MayTinhDAO;
import dao.PhieuNhapDAO;
import dao.PhieuXuatDAO;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Account;
import model.ChiTietPhieu;
import model.Phieu;
import model.PhieuNhap;
import model.PhieuXuat;


public class CTThongKeAcc extends javax.swing.JDialog {

    /**
     * Creates new form CTPhieuDialog
     */
    private ThongKeForm pa;

    public CTThongKeAcc(javax.swing.JInternalFrame parent, javax.swing.JFrame owner, boolean modal) {
        super(owner, modal);
        this.pa = (ThongKeForm) parent;
        initComponents();
        setLocationRelativeTo(null);
        String maAcc = pa.getMaAcc();
        Account ac = AccountDAO.getInstance().selectById(maAcc);
        labelNguoiTao.setText(ac.getFullName());
        loadDataToTablePhieu(maAcc);
        setWidthTable();
    }

    public void setWidthTable() {
        tblChiTietPhieu.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblChiTietPhieu.getColumnModel().getColumn(1).setPreferredWidth(10);
        tblChiTietPhieu.getColumnModel().getColumn(2).setPreferredWidth(250);
    }

    public void loadDataToTablePhieu(String maAcc) {
        DefaultTableModel tblAcc = (DefaultTableModel) tblChiTietPhieu.getModel();
        ArrayList<Phieu> result = new ArrayList<Phieu>();
        for (Phieu phieu : PhieuNhapDAO.getInstance().selectAllAccount(maAcc)) {
            if (phieu.getNguoiTao().equals(maAcc)) {
                result.add(phieu);
            }
        }
        for (int i=0;i<result.size();i++) {
            tblAcc.addRow(new Object[]{
                i+1,
                result.get(i).getMaPhieu(),
                pa.getFormatDate().format(result.get(i).getThoiGianTao()),
                pa.getFormatter().format(result.get(i).getTongTien()) + "đ"
            });
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietPhieu = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        labelNguoiTao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chi tiết phiếu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" PHIẾU ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        tblChiTietPhieu.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        tblChiTietPhieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã phiếu", "Thời gian", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(tblChiTietPhieu);

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel4.setText("Người tạo:");

        labelNguoiTao.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        labelNguoiTao.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(labelNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelNguoiTao))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CTThongKeAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTThongKeAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTThongKeAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTThongKeAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNguoiTao;
    private javax.swing.JTable tblChiTietPhieu;
    // End of variables declaration//GEN-END:variables
}
