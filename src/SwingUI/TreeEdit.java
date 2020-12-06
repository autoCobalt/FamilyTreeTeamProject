package SwingUI;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import static SwingUI.TreeFuncs.getTreeFuncs;

public class TreeEdit extends EntryPage {
    private static JFrame treeEdit;
    private JPanel TreeEdit;
    private JPanel AddPerson;
    private JPanel RootCard;
    private JButton b_addPerson;
    private JButton b_addRelationship;
    private JButton b_removePerson;
    private JButton b_editRelationship;
    private JButton root_back;
    private JPanel AddRelationship;
    private JPanel EditRelationship;
    private JButton ap_cancel;
    private JFormattedTextField firstname_input;
    private JFormattedTextField lastname_input;
    private JFormattedTextField suffix_input;
    private JComboBox birthdate_mm;
    private JComboBox birthdate_dd;
    private JComboBox birthdate_yyyy;
    private JFormattedTextField birthplace_input;
    private JComboBox deathdate_mm;
    private JComboBox deathdate_dd;
    private JComboBox deathdate_yyyy;
    private JFormattedTextField deathplace_input;
    private JLabel firstname_label;
    private JLabel lastname_label;
    private JLabel suffix_label;
    private JLabel birthdate_label;
    private JLabel birthplace_label;
    private JLabel deathdate_label;
    private JLabel deathplace_label;
    private JButton ap_submit;
    private JButton ar_cancel;
    private JRadioButton radioButton2;
    private JFormattedTextField pID_mother_input;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField pID_father_input;
    private JFormattedTextField formattedTextField4;
    private JRadioButton radioButton3;
    private JFormattedTextField formattedTextField5;
    private JFormattedTextField formattedTextField6;
    private JRadioButton radioButton4;
    private JFormattedTextField formattedTextField7;
    private JFormattedTextField formattedTextField8;
    private JTextArea reltype_prompt;
    private JButton ar_submit;
    private JRadioButton select_child;
    private JLabel pID_mother;
    private JLabel pID_father;

    public TreeEdit() {

        /* Action Listener for button Add Person */
        b_addPerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /* Action Listener for button Add Relationship */
        b_addRelationship.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /* Action Listener for button Edit Relationship */
        b_editRelationship.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /* Action listener for back button */
        root_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame treeFuncs = getTreeFuncs();
                getTreeEdit().setVisible(false);
                treeFuncs.setVisible(true);
            }
        });
    }

    public static void setTreeEdit(JFrame frame) {
        treeEdit = frame;
    }

    public static JFrame getTreeEdit() {
        return treeEdit;
    }


    /////////////////////////
    /* INTELLIJ ADDED CODE */

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        TreeEdit = new JPanel();
        TreeEdit.setLayout(new CardLayout(0, 0));
        TreeEdit.setBackground(new Color(-5997967));
        RootCard = new JPanel();
        RootCard.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 1, new Insets(0, 0, 0, 0), -1, -1));
        RootCard.setBackground(new Color(-5997967));
        TreeEdit.add(RootCard, "rootCard");
        RootCard.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), "Edit Tree", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.BELOW_TOP, this.$$$getFont$$$("Consolas", Font.BOLD, 20, RootCard.getFont()), new Color(-16777216)));
        b_addPerson = new JButton();
        b_addPerson.setBackground(new Color(-2960686));
        Font b_addPersonFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 16, b_addPerson.getFont());
        if (b_addPersonFont != null) b_addPerson.setFont(b_addPersonFont);
        b_addPerson.setText("Add New Person");
        RootCard.add(b_addPerson, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        b_addRelationship = new JButton();
        b_addRelationship.setBackground(new Color(-2960686));
        Font b_addRelationshipFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 16, b_addRelationship.getFont());
        if (b_addRelationshipFont != null) b_addRelationship.setFont(b_addRelationshipFont);
        b_addRelationship.setText("Add New Relationship");
        RootCard.add(b_addRelationship, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        b_removePerson = new JButton();
        b_removePerson.setText("Button");
        RootCard.add(b_removePerson, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        b_editRelationship = new JButton();
        b_editRelationship.setText("Button");
        RootCard.add(b_editRelationship, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        root_back = new JButton();
        root_back.setBackground(new Color(-2960686));
        Font backButtonFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 14, root_back.getFont());
        if (backButtonFont != null) root_back.setFont(backButtonFont);
        root_back.setText("Back");
        root_back.setToolTipText("Return to previous window");
        RootCard.add(root_back, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        RootCard.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        RootCard.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        RootCard.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        AddPerson = new JPanel();
        AddPerson.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        TreeEdit.add(AddPerson, "addPerson");
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return TreeEdit;
    }

}
