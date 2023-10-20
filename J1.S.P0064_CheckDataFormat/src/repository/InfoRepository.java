/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.InfoDao;

/**
 *
 * @author Admin
 */
public class InfoRepository implements IInfoRepository {

    @Override
    public void checkPhone() {
        InfoDao.Instance().checkInputPhone();
    }

    @Override
    public void checkDate() {
        InfoDao.Instance().checkInputDate();
    }

    @Override
    public void checkEmail() {
        InfoDao.Instance().checkInputEmail();
    }
}
