/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillPayment;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author mohamed
 */
public interface BillManagerInt extends Remote{
     public void addBill(int ID, String residentName, String type, String description, double amount) throws RemoteException;
}
