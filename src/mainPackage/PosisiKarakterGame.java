/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

/**
 *
 * @author ASUS
 */
public class PosisiKarakterGame {
        private String state = "Menunggu aba-aba";
    public void gerak(String command) {
        switch (command) { //1302204085 % 3 == 1
            case "Berdiri":
                this.state = "posisi standby";
                break;
            case "Tengkurap":
                this.state = "posisi istirahat";
                break;
        }
    }
    public String getState(){
        return this.state;

    }
}
