/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

import java.util.ArrayList;

/**
 * Các thông số về nền tảng(platform)
 * @author QuachVanLong
 */
public class Platform {
    private String os;     // hệ điêu hành
    private String chipset;// chip set
    private String cpu;    // cpu
    private String gpu;    // chip đồ họa
    //Phương thức khởi tạo
    public Platform() {
    }
    public Platform(String os, String chipset, String cpu, String gpu) {
        this.os = os;
        this.chipset = chipset;
        this.cpu = cpu;
        this.gpu = gpu;
    }
    public  Platform(ArrayList<String> input){
        this.os = input.get(0);
        this.chipset = input.get(1);
        this.cpu = input.get(2);
        this.gpu = input.get(3);
    }
    //get set
    public String getOs() {
        return os;
    }
    public String getChipset() {
        return chipset;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    
    
}
