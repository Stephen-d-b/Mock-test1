/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinherentance;

/**
 *
 * @author conno
 */
public class PrjInherentance {

    public static void main(String[] args) {
        /*
        Student class
        SportsStudent Class
        MusicStudent class
        ArtStudent class
        */
        
        SportsStudent sport = new SportsStudent("John Sports");
        System.out.println(sport.attendClass());
        System.out.println(sport.submitAssignment());
        System.out.println(sport.playSport());
        
        MusicStudent music = new MusicStudent("John Music");
        System.out.println(music.attendClass());
        System.out.println(music.submitAssignment());
        System.out.println(music.practiceInstrument());
        
        ArtStudent art = new ArtStudent("John Art");
        System.out.println(art.attendClass());
        System.out.println(art.submitAssignment());
        System.out.println(art.Painting());
        
    }
    
}
