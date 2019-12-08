import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminUI {

    public UserModel user = null;

    public JFrame view;

    public JButton btnSystemConfig = new JButton("Setup System Configuration");
    public JButton btnAddUser = new JButton("Add New User");
    public JButton btnDeleteUser = new JButton("Delete User");
    public JButton btnUpdateUser = new JButton("Update User");

    public AdminUI(UserModel user) {

        this.user = user;

        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Admin View");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelUser = new JPanel(new FlowLayout());
        panelUser.add(new JLabel("Fullname: " + user.mFullname));
//        panelUser.add(new JLabel("CustomerID: " + user.mCustomerID));

        view.getContentPane().add(panelUser);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnSystemConfig);
        panelButtons.add(btnDeleteUser);
        panelButtons.add(btnAddUser);
        panelButtons.add(btnUpdateUser);

        view.getContentPane().add(panelButtons);


//        btnDeleteUser.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                PurchaseHistoryUI ui = new PurchaseHistoryUI(user);
//                ui.view.setVisible(true);
//            }
//        });
//
//        btnSystemConfig.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                ManageCustomerUI ui = new ManageCustomerUI();
//                ui.run();
//            }
//        });
//
//        btnSeachProduct.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                ProductSearchUI ui = new ProductSearchUI(user);
//                ui.view.setVisible(true);
//            }
//        } );

    }
}