/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheritance;

/**
 *
 * @author Stephen D
 */
public class prjInheritance {

    public static void main(String[] args) {
        
        SportStudent sport = new SportStudent ("John");
        
        System.out.println(sport.attendClass());
        System.out.println(sport.submitAssignemnt());
        System.out.println(sport.playSport());
        
        MusicStudent music = new MusicStudent ("Sally");
        
        System.out.println(music.attendClass());
        System.out.println(music.submitAssignemnt());
        System.out.println(music.practiceInstrument());
        
        ArtStudent art = new ArtStudent ("Reagan");
        
        System.out.println(art.attendClass());
        System.out.println(art.submitAssignemnt());
        System.out.println(art.IsPainting());
        
        Student stud = new Student("Testing");
        stud.playSport();
        
    }
}
