/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

import java.util.ArrayList;

/**
 * Các thông tin khác
 * @author QuachVanLong
 */
public class Features {
    private String colors;
    private long price;
    private String sensors;       //cảm biến
    private String cam1Features;  //đặc điểm của cam 1
    private String featuresOther;  //các đặc điểm khác
    private String batStandby1;    //thời gian chờ của pin
    private String sarEu;          // Specific absorption rate(tỉ lệ hấp thụ riêng)
    private String cam2Features;   //đặc điểm cam 2
    private String optionalOther;
    private String models;
    private String sarUs;          // Specific absorption rate(tỉ lệ hấp thụ riêng)
    private String tbench;
    private String brand;
    //Phương thức khởi tạo
    public Features() {
        this.colors = FinalVariable.NULL;
        this.price = 0;
        this.sensors = FinalVariable.NULL;
        this.cam1Features = FinalVariable.NULL;
        this.batStandby1 = FinalVariable.NULL;
        this.sarEu = FinalVariable.NULL;
        this.cam2Features = FinalVariable.NULL;
        this.optionalOther = FinalVariable.NULL;
        this.models = FinalVariable.NULL;
        this.sarUs = FinalVariable.NULL;
        this.tbench = FinalVariable.NULL;
        this.featuresOther = FinalVariable.NULL;
        this.brand = FinalVariable.NULL;
    }
    public Features(String colors,int price,String sensors, String cam1Features, String featuresOther, String batstandby1, String memoryOther, String speed, String displayProtection, String gpu, String sarEu, String cam2Features, String build, String displayOther, String optionalOther, String models, String sar_us, String batMusicPlayback1, String tbench, String brand) {
        this.colors = colors;
        this.price = price;
        this.sensors = sensors;
        this.cam1Features = cam1Features;
        this.featuresOther = featuresOther;
        this.batStandby1 = batstandby1;
        this.sarEu = sarEu;
        this.cam2Features = cam2Features;
        this.optionalOther = optionalOther;
        this.models = models;
        this.sarUs = sar_us;
        this.tbench = tbench;
        this.brand = brand;
    }
    public  Features(ArrayList<String> input){
        this.colors = input.get(0);
        this.price = (input.get(1) != null && input.get(1).matches("[0-9.]+")) ? 
                Math.round(Double.parseDouble(input.get(1))): 0;
        this.sensors = input.get(2);
        this.cam1Features = input.get(3);
        this.featuresOther = input.get(4);
        this.batStandby1 = input.get(5);
        this.sarEu = input.get(6);
        this.cam2Features = input.get(7);
        this.optionalOther = input.get(8);
        this.models = input.get(9);
        this.sarUs = input.get(10);
        this.tbench = input.get(11);
        this.brand = input.get(12);
    }
    @Override
    public String toString() {
        String result = "FEATURES\n";
        result += (colors.isBlank() ? "" : " - colors : " + colors + "\n")
                + (" - price : " + price + "\n")
                + (sensors.isBlank() ? "" : " - Sensors : " + sensors + "\n")
                + (cam1Features.isBlank() ? "" : " - Camera 1 features : " + cam1Features + "\n")
                + (cam2Features.isBlank() ? "" : " - Camera 2 features : " + cam2Features + "\n")
                + (featuresOther.isBlank() ? "" : " - Other feature : " + featuresOther + "\n")
                + (batStandby1.isBlank() ? "" : " - Battery Standby : " + batStandby1 + "\n")
                + (sarEu.isBlank() ? "" : " - Specific absorption rate(EU) : " + sarEu + "\n")
                + (sarUs.isBlank() ? "" : " - Specific absorption rate(US) : " + sarUs + "\n")
                + (optionalOther.isBlank() ? "" : " - Other optional : " + optionalOther + "\n")
                + (models.isBlank() ? "" : " - Models : " + models + "\n")
                + (tbench.isBlank() ? "" : " - Tbench : " + tbench + "\n")
                + (brand.isBlank() ? "" : " - Brand : " + brand + "\n");
        return result;
                
    }
    
    //get set
    public String getColors() {
        return colors;
    }

    public long getPrice() {    
        return price;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    

    public String getSensors() {
        return sensors;
    }

    public String getCam1Features() {
        return cam1Features;
    }

    public String getFeaturesOther() {
        return featuresOther;
    }

    public String getBatStandby1() {
        return batStandby1;
    }

    public String getSarEu() {
        return sarEu;
    }

    public String getCam2Features() {
        return cam2Features;
    }

    public String getOptionalOther() {
        return optionalOther;
    }

    public String getModels() {
        return models;
    }

    public String getSarUs() {
        return sarUs;
    }

    public String getTbench() {
        return tbench;
    }

    public String getBrand() {
        return brand;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    public void setCam1Features(String cam1Features) {
        this.cam1Features = cam1Features;
    }

    public void setFeaturesOther(String featuresOther) {
        this.featuresOther = featuresOther;
    }

    public void setBatStandby1(String batStandby1) {
        this.batStandby1 = batStandby1;
    }

    public void setSarEu(String sarEu) {
        this.sarEu = sarEu;
    }

    public void setCam2Features(String cam2Features) {
        this.cam2Features = cam2Features;
    }

    public void setOptionalOther(String optionalOther) {
        this.optionalOther = optionalOther;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public void setSarUs(String sarUs) {
        this.sarUs = sarUs;
    }

    public void setTbench(String tbench) {
        this.tbench = tbench;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    
}
