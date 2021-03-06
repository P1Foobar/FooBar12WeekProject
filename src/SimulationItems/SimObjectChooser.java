package SimulationItems;

import javax.swing.JPanel;
import javax.swing.JComboBox;

/* Pop up menu that will be used for selecting
 different objects, people, or maybe virus itself */

public class SimObjectChooser extends JPanel {

    private Class selectedClass;
    private JComboBox combolist;
    private String[] classes;

    SimObjectChooser ()
    {
        selectedClass = null;
        classes = null;
        combolist = new JComboBox ();

        combolist.addActionListener
                (e -> {
                            JComboBox cb = (JComboBox) e.getSource ();
                            String classname = (String) cb.getSelectedItem ();
                            setSelectedClass (classname);
                        }
                );

        add (combolist);
    }
    /*adding classes to select in the pop up list*/
    public void addClass (String className) throws ClassNotFoundException
    {
        Class newClass = Class.forName (className);

        String [] oldclasses = classes;

        if (oldclasses == null) {
            classes = new String [1];
            selectedClass = newClass;
        } else {
            classes = new String [oldclasses.length + 1];
        }

        if (oldclasses != null) {
            for (int i = 0; i < oldclasses.length; i++) {
                classes[i] = oldclasses[i];
            }
        }

        classes[classes.length - 1] = className;
        combolist.addItem (className);
    }

    public Class getSelectedClass()
    {
        return selectedClass;
    }

    public void setSelectedClass (String classname)
    {
        try {
            Class newClass = Class.forName (classname);
            selectedClass = newClass;
        } catch (java.lang.ClassNotFoundException ex) {
            System.err.println ("Error: Class not found. Please select a different class: " + classname);
            ex.printStackTrace();
        }
    }

}
