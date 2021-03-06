package org.freeeed.ui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
import org.freeeed.services.Project;

/**
 *
 * @author mark
 */
public class ProcessingParametersDialog extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form ProcessingParametersDialog
     */
    public ProcessingParametersDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        metadataButtonGroup = new javax.swing.ButtonGroup();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        fieldSeparatorLabel = new javax.swing.JLabel();
        fieldSeparatorChoice = new javax.swing.JComboBox();
        labelMetadataCollected = new javax.swing.JLabel();
        standardMetadataRadio = new javax.swing.JRadioButton();
        allMetadataRadio = new javax.swing.JRadioButton();
        denistCheck = new javax.swing.JCheckBox();
        skipLabel = new javax.swing.JLabel();
        skipText = new javax.swing.JTextField();
        textInMetadataBox = new javax.swing.JCheckBox();

        setTitle("Processing options");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        fieldSeparatorLabel.setText("Field separator");

        labelMetadataCollected.setText("Metadata collected");

        metadataButtonGroup.add(standardMetadataRadio);
        standardMetadataRadio.setSelected(true);
        standardMetadataRadio.setText("Standard");

        metadataButtonGroup.add(allMetadataRadio);
        allMetadataRadio.setText("All");

        denistCheck.setSelected(true);
        denistCheck.setText("DeNIST (Remove system files)");

        skipLabel.setText("Skip files for sampling (testing only!)");

        textInMetadataBox.setText("Insert text in metadata");
        textInMetadataBox.setToolTipText("Useful for Concordance and Hive load");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMetadataCollected)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(standardMetadataRadio)
                        .addGap(18, 18, 18)
                        .addComponent(allMetadataRadio)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(skipLabel)
                        .addGap(18, 18, 18)
                        .addComponent(skipText))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldSeparatorLabel)
                                .addGap(34, 34, 34)
                                .addComponent(fieldSeparatorChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(denistCheck)
                            .addComponent(textInMetadataBox))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSeparatorLabel)
                    .addComponent(fieldSeparatorChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetadataCollected)
                    .addComponent(standardMetadataRadio)
                    .addComponent(allMetadataRadio))
                .addGap(18, 18, 18)
                .addComponent(denistCheck)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skipLabel)
                    .addComponent(skipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textInMetadataBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void doClose(int retStatus) {
        if (!collectData()) {
            return;
        }
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allMetadataRadio;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox denistCheck;
    private javax.swing.JComboBox fieldSeparatorChoice;
    private javax.swing.JLabel fieldSeparatorLabel;
    private javax.swing.JLabel labelMetadataCollected;
    private javax.swing.ButtonGroup metadataButtonGroup;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel skipLabel;
    private javax.swing.JTextField skipText;
    private javax.swing.JRadioButton standardMetadataRadio;
    private javax.swing.JCheckBox textInMetadataBox;
    // End of variables declaration//GEN-END:variables
    private int returnStatus = RET_CANCEL;

    @Override
    public void setVisible(boolean b) {
        if (b) {
            myInit();
            displayData();
        }
        super.setVisible(b);
    }

    private void myInit() {
        fieldSeparatorChoice.removeAllItems();
        fieldSeparatorChoice.addItem("tab (\\t)");
        fieldSeparatorChoice.addItem("non-ascii one (x0001)");
        fieldSeparatorChoice.addItem("pipe (|)");
        fieldSeparatorChoice.addItem("carret (^)");
    }

    private boolean collectData() {
        Project project = Project.getProject();
        try {
            int index = fieldSeparatorChoice.getSelectedIndex();
            switch (index) {
                case 0:
                    project.setFieldSeparator("tab");
                    break;
                case 1:
                    project.setFieldSeparator("hex_one");
                    break;
                case 2:
                    project.setFieldSeparator("pipe");
                    break;
                case 3:
                    project.setFieldSeparator("carret");
                    break;
            }
            project.setMetadataCollect(
                    standardMetadataRadio.isSelected() ? "standard" : "all");
            project.setRemoveSystemFiles(denistCheck.isSelected());
            project.setSkip(Integer.parseInt(skipText.getText()));
            project.setTextInMetadata(textInMetadataBox.isSelected());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void displayData() {
        Project project = Project.getProject();
        int index = 0;
        String fieldSeparator = project.getFieldSeparator();
        if ("tab".equals(fieldSeparator)) {
            index = 0;
        } else if ("hex_one".equals(fieldSeparator)) {
            index = 1;
        } else if ("pipe".equals(fieldSeparator)) {
            index = 2;
        } else if ("carret".equals(fieldSeparator)) {
            index = 3;
        }
        fieldSeparatorChoice.setSelectedIndex(index);
        allMetadataRadio.setSelected("all".equals(project.getMetadataCollect()));
        standardMetadataRadio.setSelected("standard".equals(project.getMetadataCollect()));
        denistCheck.setSelected(project.isRemoveSystemFiles());
        skipText.setText("" + project.getSkip());
        textInMetadataBox.setSelected(project.isTextInMetadata());
    }
}
