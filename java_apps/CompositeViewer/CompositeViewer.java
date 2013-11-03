/*
 * CompositeViewer.java
 *
 * Created on February 24, 2001, 10:09 PM
 */

import DICOM.*;
import CompositeDialogBox;
/**
 *
 * @author  smm
 * @version 
 */
public class CompositeViewer extends javax.swing.JFrame {

    /** Creates new form CompositeViewer */
    public CompositeViewer() {
        initComponents ();
        pack ();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        
        fileMenu.setText("File");
          
          openMenuItem.setText("Open");
            openMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    openMenuItemActionPerformed(evt);
                }
            }
            );
            fileMenu.add(openMenuItem);
            
          saveMenuItem.setText("Save");
            fileMenu.add(saveMenuItem);
            
          saveAsMenuItem.setText("Save As ...");
            fileMenu.add(saveAsMenuItem);
            
          exitMenuItem.setText("Exit");
            exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    exitMenuItemActionPerformed(evt);
                }
            }
            );
            fileMenu.add(exitMenuItem);
            menuBar.add(fileMenu);
          
        editMenu.setText("Edit");
          
          cutMenuItem.setText("Cut");
            editMenu.add(cutMenuItem);
            
          copyMenuItem.setText("Copy");
            editMenu.add(copyMenuItem);
            
          pasteMenuItem.setText("Paste");
            editMenu.add(pasteMenuItem);
            
          deleteMenuItem.setText("Delete");
            editMenu.add(deleteMenuItem);
            menuBar.add(editMenu);
          
        helpMenu.setText("Help");
          
          contentsMenuItem.setText("Contents");
            helpMenu.add(contentsMenuItem);
            
          aboutMenuItem.setText("About");
            helpMenu.add(aboutMenuItem);
            menuBar.add(helpMenu);
          getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), 0));
        setTitle("Composite Viewer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        }
        );
        
        jLabel1.setText("DICOM Composite Object Viewer");
        
        getContentPane().add(jLabel1);
        
        setJMenuBar(menuBar);
        
    }//GEN-END:initComponents

  private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
    java.awt.FileDialog openFileDialog = new java.awt.FileDialog(this);
    openFileDialog.setVisible(true);
    String s = openFileDialog.getFile();
    if (s == null)
        return;
    String path = openFileDialog.getDirectory() + s;
    
    System.out.println(path);
    DICOM.DICOMWrapper w = new DICOM.DICOMWrapper(path);
    s = w.getString(0x00100010);
    System.out.println(s);
    CompositeDialogBox dialogBox = new CompositeDialogBox(this, false);
    /* dialogBox.setVisible(true); */
    dialogBox.renderDICOM(w);
    dialogBox.setVisible(true);
  }//GEN-LAST:event_openMenuItemActionPerformed

    private void exitMenuItemActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit (0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit (0);
    }//GEN-LAST:event_exitForm

    /**
    * @param args the command line arguments
    */
    public static void main (String args[]) {
        new CompositeViewer ().show ();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}