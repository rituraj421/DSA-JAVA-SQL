package coreJavaBook;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class imageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new ImageViewerFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }
}

class ImageViewerFrame extends JFrame {

    public ImageViewerFrame() {
        setTitle("ImageViewer");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // use a label to display the images
        label = new JLabel();
        add(label);

        // set up the file chooser
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // set up the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // show file chooser dialog
                int result = chooser.showOpenDialog(null);

                // if file selected, set it as icon of the label
                if (result == JFileChooser.APPROVE_OPTION) {
                    String name = chooser.getSelectedFile().getPath();
                    label.setIcon(new ImageIcon(name));
                }
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
    }

    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

}