/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjpolymorphism1;

import javax.management.Notification;

/**
 *
 * @author tswan
 */
public class PrjPolymorphism1 {

    public static void main(String[] args) {
        
        Notifications noti = new Notifications();
        System.out.println(noti.send());
        noti = new EmailNotification();
        System.out.println(noti.send());
        noti = new SMSNotification();
        System.out.println(noti.send());
        
    }
}
