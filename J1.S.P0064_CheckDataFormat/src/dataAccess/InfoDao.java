/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Validation;

/**
 *
 * @author Admin
 */
public class InfoDao {
    private static InfoDao instance = null;
    private Validation valid = new Validation();

    public static InfoDao Instance() {
        if (instance == null) {
            synchronized (InfoDao.class) {
                if (instance == null) {
                    instance = new InfoDao();
                }
            }
        }
        return instance;
    }

    public void checkInputPhone() {
        valid.checkInputPhone("Phone number");
        System.err.println("Successfull");
    }
    
    public void checkInputEmail(){
        valid.checkInputEmail("Email", "[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$");
        System.err.println("Successfull");
    }
    
    public void checkInputDate(){
        valid.checkInputDate("Date");
        System.err.println("Successfull");
    }
}
