/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import common.MenuEnum;
import controller.Navigator;
import dto.MenuDto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author KimAnh
 */
public class FrMain extends javax.swing.JFrame {

    /**
     * Creates new form FrMain
     */
    public FrMain() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        lbLogo.setIcon(new ImageIcon(getClass().getResource("/images/icon_logo_bkcit.png")));
        
        
        List<MenuDto> menus = new ArrayList<>();
        menus.add(new MenuDto(MenuEnum.HOMEPAGE, pnHome, lbHome));
        menus.add(new MenuDto(MenuEnum.STUDENT, pnStudent, lbStudent));
        menus.add(new MenuDto(MenuEnum.COURSE, pnCourse, lbCourse));
        menus.add(new MenuDto(MenuEnum.CLASS, pnClass, lbClass));
        menus.add(new MenuDto(MenuEnum.STATISTIC, pnStatistic, lbStatistic));
        
        
        Navigator navigator = new Navigator(pnMainView,  menus);
        
        navigator.setStartPage(new pnHomePage());
        
        navigator.setEvents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLeft = new javax.swing.JPanel();
        pnTop = new javax.swing.JPanel();
        lbApp = new javax.swing.JLabel();
        pnMenu = new javax.swing.JPanel();
        pnHome = new javax.swing.JPanel();
        lbHome = new javax.swing.JLabel();
        pnStudent = new javax.swing.JPanel();
        lbStudent = new javax.swing.JLabel();
        pnCourse = new javax.swing.JPanel();
        lbCourse = new javax.swing.JLabel();
        pnClass = new javax.swing.JPanel();
        lbClass = new javax.swing.JLabel();
        pnStatistic = new javax.swing.JPanel();
        lbStatistic = new javax.swing.JLabel();
        pnLogo = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        pnMainView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnLeft.setBackground(new java.awt.Color(0, 0, 0));
        pnLeft.setLayout(new java.awt.BorderLayout());

        pnTop.setBackground(new java.awt.Color(255, 0, 51));
        pnTop.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 10));

        lbApp.setBackground(new java.awt.Color(255, 255, 255));
        lbApp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbApp.setForeground(new java.awt.Color(255, 255, 255));
        lbApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_ung_dung_white_24dp.png"))); // NOI18N
        lbApp.setText("Quản lý học viên");
        pnTop.add(lbApp);

        pnLeft.add(pnTop, java.awt.BorderLayout.PAGE_START);

        pnMenu.setBackground(new java.awt.Color(0, 0, 0));
        pnMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        pnMenu.setLayout(new java.awt.GridLayout(5, 1, 10, 10));

        pnHome.setBackground(new java.awt.Color(96, 100, 191));
        pnHome.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu0_white_24dp.png"))); // NOI18N
        lbHome.setText("Màn Hình Chính");
        pnHome.add(lbHome);

        pnMenu.add(pnHome);

        pnStudent.setBackground(new java.awt.Color(76, 175, 80));
        pnStudent.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbStudent.setForeground(new java.awt.Color(255, 255, 255));
        lbStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu1_white_24dp.png"))); // NOI18N
        lbStudent.setText("Quản lý học viên");
        lbStudent.setToolTipText("");
        pnStudent.add(lbStudent);

        pnMenu.add(pnStudent);

        pnCourse.setBackground(new java.awt.Color(76, 175, 80));
        pnCourse.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbCourse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCourse.setForeground(new java.awt.Color(255, 255, 255));
        lbCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu2_white_24dp.png"))); // NOI18N
        lbCourse.setText("Quản lý khóa học");
        lbCourse.setToolTipText("");
        pnCourse.add(lbCourse);

        pnMenu.add(pnCourse);

        pnClass.setBackground(new java.awt.Color(76, 175, 80));
        pnClass.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbClass.setForeground(new java.awt.Color(255, 255, 255));
        lbClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu3_white_24dp.png"))); // NOI18N
        lbClass.setText("Quản lý lớp học");
        lbClass.setToolTipText("");
        pnClass.add(lbClass);

        pnMenu.add(pnClass);

        pnStatistic.setBackground(new java.awt.Color(76, 175, 80));
        pnStatistic.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbStatistic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbStatistic.setForeground(new java.awt.Color(255, 255, 255));
        lbStatistic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_menu4_white_24dp.png"))); // NOI18N
        lbStatistic.setText("Thống kê dữ liệu");
        lbStatistic.setToolTipText("");
        pnStatistic.add(lbStatistic);

        pnMenu.add(pnStatistic);

        pnLeft.add(pnMenu, java.awt.BorderLayout.CENTER);

        pnLogo.add(lbLogo);

        pnLeft.add(pnLogo, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnLeft, java.awt.BorderLayout.WEST);
        getContentPane().add(pnMainView, java.awt.BorderLayout.CENTER);

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
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbApp;
    private javax.swing.JLabel lbClass;
    private javax.swing.JLabel lbCourse;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbStatistic;
    private javax.swing.JLabel lbStudent;
    private javax.swing.JPanel pnClass;
    private javax.swing.JPanel pnCourse;
    private javax.swing.JPanel pnHome;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnMainView;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnStatistic;
    private javax.swing.JPanel pnStudent;
    private javax.swing.JPanel pnTop;
    // End of variables declaration//GEN-END:variables
}
