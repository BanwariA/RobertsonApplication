package robertsonapplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashba
 */
public class ContactManager {
    public static void main(String[]st){
        ContactApp app = new ContactApp();
        MainForm ns = new MainForm(app);
        ns.setVisible(true);
    }
}
