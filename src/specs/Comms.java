/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

import java.util.ArrayList;

/**
 * Các thông số về kết nối 
 * @author QuachVanLong
 */
public class Comms {
    private String wlan; 
    private String bluetooth;
    private String gps;
    private String nfc;
    private String radio;
    private String usb;
    
    //Phương thức khởi tạo
    public Comms() {    
        this.wlan = FinalVariable.NULL;
        this.bluetooth = FinalVariable.NULL;
        this.gps = FinalVariable.NULL;
        this.nfc = FinalVariable.NULL;
        this.radio = FinalVariable.NULL;
        this.usb = FinalVariable.NULL;
    }

    public Comms(String wlan, String bluetooth, String gps, String nfc, String radio, String usb) {
        this.wlan = wlan;
        this.bluetooth = bluetooth;
        this.gps = gps;
        this.nfc = nfc;
        this.radio = radio;
        this.usb = usb;
    }
    
    public  Comms(ArrayList<String> input){
        this.wlan = input.get(0);
        this.bluetooth = input.get(1);
        this.gps = input.get(2);
        this.nfc = input.get(3);
        this.radio = input.get(4);
        this.usb = input.get(5);
    }
    //get set
    public String getWlan() {
        return wlan;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getGps() {
        return gps;
    }

    public String getNfc() {
        return nfc;
    }

    public String getRadio() {
        return radio;
    }

    public String getUsb() {
        return usb;
    }

    public void setWlan(String wlan) {
        this.wlan = wlan;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }
    
    
}
