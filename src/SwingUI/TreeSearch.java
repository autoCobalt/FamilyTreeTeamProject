package SwingUI;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import JavaClasses.TreeGenealogy;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TreeSearch {
    private JPanel TreeSearch;
    private JPanel SearchOptions;
    private JButton personButton;
    private JButton relationshipButton;
    private JPanel PersonSearch;
    private JTextPane searchForAPersonTextPane;
    private JTextField lastNameField;
    private JTextField firstNameField;
    private JButton searchPerson;
    private JTextPane useFirstOrLastTextPane;
    private JTextArea firstTextArea;
    private JTextField pIDField;
    private JTextArea usePIDTextArea;
    private JTextArea lastTextArea;
    private JTextArea pIDTextArea;
    private JPanel RelationshipSearch;
    private JTextField rIDField;
    private JTextField relationshipPIDField;
    private JTextPane searchForARelationshipTextPane;
    private JButton searchRelationship;
    private JTextArea useRIDTextArea;
    private JTextArea findRelationshipToATextArea;
    private JTextPane pIDTextPane;
    private JComboBox personRelationshipChoice;
    private JTextPane rIDTextPane;
    private JTextPane chooseARelationshipTextPane;
    private JButton backButton;
    private JButton backButton1;
    private JTextPane searchTextPane;
    private TreeGenealogy tg;
    private static final String defaultFamilyTree = "FamilyTreeInputTextFileV2.txt";
    private JTextArea textArea;
    private PrintStream standardOut;

    CardLayout newCL = new CardLayout(0, 0);

    public TreeSearch() {
        textArea = new JTextArea(50, 10);
        textArea.setEditable(false);
        PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));

        // keeps reference of standard output stream
        standardOut = System.out;

        // re-assigns standard output stream and error output stream
        System.setOut(printStream);
        System.setErr(printStream);

        //Use CardLayout to switch between Pages
        TreeSearch.setLayout(newCL);
        TreeSearch.add(SearchOptions, "Search Options");
        TreeSearch.add(PersonSearch, "Person Search");
        TreeSearch.add(RelationshipSearch, "Relationship Search");
        newCL.show(TreeSearch, "Search Options");

        //Search to person search page btn
        personButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newCL.show(TreeSearch, "Person Search");
            }
        });

        //Search to Relationship search page btn
        relationshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newCL.show(TreeSearch, "Relationship Search");
            }
        });

        //back buttons
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newCL.show(TreeSearch, "Search Options");
            }
        });

        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newCL.show(TreeSearch, "Search Options");
            }
        });
        //gets person info by pID
        pIDField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getPID = pIDField.getText();
                //return
                //needs to take the input and send to get pID of person
            }
        });

        //gets person info by First name

        //get person info by Last name

        //gets rID for a relationship

        //gets pID for the relationship
        relationshipPIDField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getPID = relationshipPIDField.getText();

                //needs to take the input and send to get pID of person
            }
        });

        //gets person to connect to pID depending on choice by user
        personRelationshipChoice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selection = personRelationshipChoice.getSelectedIndex();
                switch (selection) {
                    case 0: //Does nothing
                        break;
                    case 1: //mother
                        break;
                    case 2: //father
                        break;
                    case 3: //grandparents
                        break;
                    case 4: //child
                        break;
                    case 5: //partner
                        break;
                    case 6: //cousin
                        break;
                    default:
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tree Search");
        frame.setContentPane(new TreeSearch().TreeSearch);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        String treeFile = (args.length == 1 ? args[0] : defaultFamilyTree);
    }

    //prints console to jtextarea
    public class CustomOutputStream extends OutputStream {
        private JTextArea textArea;

        public CustomOutputStream(JTextArea textArea) {
            this.textArea = textArea;
        }

        @Override
        public void write(int b) throws IOException {
            // redirects data to the text area
            textArea.append(String.valueOf((char) b));
            // scrolls the text area to the end of data
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }

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
        TreeSearch = new JPanel();
        TreeSearch.setLayout(new CardLayout(0, 0));
        TreeSearch.setBackground(new Color(-5997967));
        TreeSearch.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), "Search Tree", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.BELOW_TOP, this.$$$getFont$$$("Consolas", Font.BOLD, 20, TreeSearch.getFont()), new Color(-16777216)));
        SearchOptions = new JPanel();
        SearchOptions.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        SearchOptions.setBackground(new Color(-2760988));
        TreeSearch.add(SearchOptions, "Card1");
        searchTextPane = new JTextPane();
        searchTextPane.setBackground(new Color(-2760988));
        searchTextPane.setEditable(false);
        Font searchTextPaneFont = this.$$$getFont$$$(null, Font.BOLD, 28, searchTextPane.getFont());
        if (searchTextPaneFont != null) searchTextPane.setFont(searchTextPaneFont);
        searchTextPane.setForeground(new Color(-16777216));
        searchTextPane.setText("Search");
        SearchOptions.add(searchTextPane, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 5, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        SearchOptions.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        personButton = new JButton();
        personButton.setText("Person");
        SearchOptions.add(personButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        relationshipButton = new JButton();
        relationshipButton.setText("Relationship");
        SearchOptions.add(relationshipButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        SearchOptions.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        SearchOptions.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        PersonSearch = new JPanel();
        PersonSearch.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(10, 3, new Insets(0, 0, 0, 0), -1, -1));
        PersonSearch.setBackground(new Color(-2760988));
        TreeSearch.add(PersonSearch, "Card2");
        searchForAPersonTextPane = new JTextPane();
        searchForAPersonTextPane.setBackground(new Color(-2760988));
        searchForAPersonTextPane.setEditable(true);
        Font searchForAPersonTextPaneFont = this.$$$getFont$$$(null, Font.BOLD, 24, searchForAPersonTextPane.getFont());
        if (searchForAPersonTextPaneFont != null) searchForAPersonTextPane.setFont(searchForAPersonTextPaneFont);
        searchForAPersonTextPane.setForeground(new Color(-16777216));
        searchForAPersonTextPane.setText("Search for a Person");
        PersonSearch.add(searchForAPersonTextPane, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        searchPerson = new JButton();
        searchPerson.setText("search");
        PersonSearch.add(searchPerson, new com.intellij.uiDesigner.core.GridConstraints(8, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
        PersonSearch.add(spacer4, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer5 = new com.intellij.uiDesigner.core.Spacer();
        PersonSearch.add(spacer5, new com.intellij.uiDesigner.core.GridConstraints(9, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        useFirstOrLastTextPane = new JTextPane();
        useFirstOrLastTextPane.setBackground(new Color(-2760988));
        Font useFirstOrLastTextPaneFont = this.$$$getFont$$$(null, -1, 20, useFirstOrLastTextPane.getFont());
        if (useFirstOrLastTextPaneFont != null) useFirstOrLastTextPane.setFont(useFirstOrLastTextPaneFont);
        useFirstOrLastTextPane.setForeground(new Color(-16777216));
        useFirstOrLastTextPane.setText("Use First or Last Name");
        PersonSearch.add(useFirstOrLastTextPane, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(170, 50), null, 0, false));
        lastNameField = new JTextField();
        PersonSearch.add(lastNameField, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(170, 30), null, 0, false));
        firstNameField = new JTextField();
        PersonSearch.add(firstNameField, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(170, 30), null, 0, false));
        firstTextArea = new JTextArea();
        firstTextArea.setBackground(new Color(-2760988));
        firstTextArea.setForeground(new Color(-16777216));
        firstTextArea.setText("first");
        PersonSearch.add(firstTextArea, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 25), null, 0, false));
        pIDField = new JTextField();
        PersonSearch.add(pIDField, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        usePIDTextArea = new JTextArea();
        usePIDTextArea.setBackground(new Color(-2760988));
        Font usePIDTextAreaFont = this.$$$getFont$$$(null, -1, 20, usePIDTextArea.getFont());
        if (usePIDTextAreaFont != null) usePIDTextArea.setFont(usePIDTextAreaFont);
        usePIDTextArea.setForeground(new Color(-16777216));
        usePIDTextArea.setText("Use pID");
        PersonSearch.add(usePIDTextArea, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        lastTextArea = new JTextArea();
        lastTextArea.setBackground(new Color(-2760988));
        lastTextArea.setForeground(new Color(-16777216));
        lastTextArea.setText("last");
        PersonSearch.add(lastTextArea, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 25), null, 0, false));
        pIDTextArea = new JTextArea();
        pIDTextArea.setBackground(new Color(-2760988));
        pIDTextArea.setForeground(new Color(-16777216));
        pIDTextArea.setText("pID");
        PersonSearch.add(pIDTextArea, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 25), null, 0, false));
        backButton = new JButton();
        backButton.setText("back");
        PersonSearch.add(backButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        RelationshipSearch = new JPanel();
        RelationshipSearch.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(11, 3, new Insets(0, 0, 0, 0), -1, -1));
        RelationshipSearch.setBackground(new Color(-2760988));
        TreeSearch.add(RelationshipSearch, "Card3");
        relationshipPIDField = new JTextField();
        RelationshipSearch.add(relationshipPIDField, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        searchForARelationshipTextPane = new JTextPane();
        searchForARelationshipTextPane.setBackground(new Color(-2760988));
        Font searchForARelationshipTextPaneFont = this.$$$getFont$$$(null, Font.BOLD, 24, searchForARelationshipTextPane.getFont());
        if (searchForARelationshipTextPaneFont != null)
            searchForARelationshipTextPane.setFont(searchForARelationshipTextPaneFont);
        searchForARelationshipTextPane.setForeground(new Color(-16777216));
        searchForARelationshipTextPane.setText("Search for a Relationship");
        RelationshipSearch.add(searchForARelationshipTextPane, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        searchRelationship = new JButton();
        searchRelationship.setText("search");
        RelationshipSearch.add(searchRelationship, new com.intellij.uiDesigner.core.GridConstraints(9, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        useRIDTextArea = new JTextArea();
        useRIDTextArea.setBackground(new Color(-2760988));
        Font useRIDTextAreaFont = this.$$$getFont$$$(null, -1, 20, useRIDTextArea.getFont());
        if (useRIDTextAreaFont != null) useRIDTextArea.setFont(useRIDTextAreaFont);
        useRIDTextArea.setForeground(new Color(-16777216));
        useRIDTextArea.setText("Use rID");
        RelationshipSearch.add(useRIDTextArea, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        findRelationshipToATextArea = new JTextArea();
        findRelationshipToATextArea.setBackground(new Color(-2760988));
        Font findRelationshipToATextAreaFont = this.$$$getFont$$$(null, -1, 20, findRelationshipToATextArea.getFont());
        if (findRelationshipToATextAreaFont != null)
            findRelationshipToATextArea.setFont(findRelationshipToATextAreaFont);
        findRelationshipToATextArea.setForeground(new Color(-16777216));
        findRelationshipToATextArea.setText("Find relationship to a person");
        findRelationshipToATextArea.setWrapStyleWord(false);
        RelationshipSearch.add(findRelationshipToATextArea, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        personRelationshipChoice = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Choose one...");
        defaultComboBoxModel1.addElement("Mother");
        defaultComboBoxModel1.addElement("Father");
        defaultComboBoxModel1.addElement("Grandparents");
        defaultComboBoxModel1.addElement("Child");
        defaultComboBoxModel1.addElement("Partner");
        defaultComboBoxModel1.addElement("Cousin");
        personRelationshipChoice.setModel(defaultComboBoxModel1);
        RelationshipSearch.add(personRelationshipChoice, new com.intellij.uiDesigner.core.GridConstraints(7, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer6 = new com.intellij.uiDesigner.core.Spacer();
        RelationshipSearch.add(spacer6, new com.intellij.uiDesigner.core.GridConstraints(10, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer7 = new com.intellij.uiDesigner.core.Spacer();
        RelationshipSearch.add(spacer7, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer8 = new com.intellij.uiDesigner.core.Spacer();
        RelationshipSearch.add(spacer8, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pIDTextPane = new JTextPane();
        pIDTextPane.setBackground(new Color(-2760988));
        pIDTextPane.setForeground(new Color(-16777216));
        pIDTextPane.setText("pID");
        RelationshipSearch.add(pIDTextPane, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 25), null, 0, false));
        rIDTextPane = new JTextPane();
        rIDTextPane.setBackground(new Color(-2760988));
        rIDTextPane.setForeground(new Color(-16777216));
        rIDTextPane.setText("rID");
        RelationshipSearch.add(rIDTextPane, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 25), null, 0, false));
        chooseARelationshipTextPane = new JTextPane();
        chooseARelationshipTextPane.setBackground(new Color(-2760988));
        chooseARelationshipTextPane.setForeground(new Color(-16777216));
        chooseARelationshipTextPane.setText("Choose a relationship");
        RelationshipSearch.add(chooseARelationshipTextPane, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 25), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer9 = new com.intellij.uiDesigner.core.Spacer();
        RelationshipSearch.add(spacer9, new com.intellij.uiDesigner.core.GridConstraints(8, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        rIDField = new JTextField();
        RelationshipSearch.add(rIDField, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        backButton1 = new JButton();
        backButton1.setText("back");
        RelationshipSearch.add(backButton1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return TreeSearch;
    }

}
