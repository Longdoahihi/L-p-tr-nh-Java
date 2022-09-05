/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

import java.util.ArrayList;

/**
 *  thông số về pin
 * @author QuachVanLong
 */
public class Battery {
    private String batDescription1; // Mô tả pin
    private String batTalkTime1;    // thời lượng sử dụng pin
    private String batMusicPlayback1;// thời lượng nghe nhạc
    //Khởi tạo
    public Battery() {
        this.batDescription1 = FinalVariable.NULL;
        this.batTalkTime1 = FinalVariable.NULL;
        this.batMusicPlayback1 = FinalVariable.NULL;
    }
    public Battery(String batDescription1, String batTalkTime1, String batMusicPlayback1) {
        this.batDescription1 = batDescription1;
        this.batTalkTime1 = batTalkTime1;
        this.batMusicPlayback1 = batMusicPlayback1;
    }
    public  Battery(ArrayList<String> input){
        this.batDescription1 = input.get(0);
        this.batTalkTime1=  input.get(1);
        this.batMusicPlayback1 = input.get(2);
    }
    // get set
    public String getBatTalkTime1() {
        return batTalkTime1;
    }

    public String getBatDescription1() {
        return batDescription1;
    }

    public void setBatTalkTime1(String batTalkTime1) {
        this.batTalkTime1 = batTalkTime1;
    }

    public void setBatDescription1(String batDescription1) {
        this.batDescription1 = batDescription1;
    }

    public String getBatMusicPlayback1() {
        return batMusicPlayback1;
    }

    public void setBatMusicPlayback1(String batMusicPlayback1) {
        this.batMusicPlayback1 = batMusicPlayback1;
    }
    
    
            
}
