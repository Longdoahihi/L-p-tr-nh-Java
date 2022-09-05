/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

import java.util.ArrayList;

/**
 * Các thông số về màn hình
 * @author QuachVanLong
 */
public class Display {

    private String displayType;     // Kiểu màn hình
    private String displaySize;     // kích thước
    private String displayResolution; // Độ phân giải
    private String displayProtection;   //loại bảo vệ màn hình
    private String displayOther;    // thông số màn hình khác


    //Phương thức khởi tạo

    public Display() {
        this.displayType = FinalVariable.NULL;
        this.displaySize = FinalVariable.NULL;
        this.displayResolution = FinalVariable.NULL;
        this.displayProtection = FinalVariable.NULL;
        this.displayOther = FinalVariable.NULL;
    }

    public Display(String displayType, String displaySize, String displayResolution, String displayProtection, String displayOther) {
        this.displayType = displayType;
        this.displaySize = displaySize;
        this.displayResolution = displayResolution;
        this.displayProtection = displayProtection;
        this.displayOther = displayOther;
    }
    
    public  Display(ArrayList<String> input){
        this.displayType = input.get(0);
        this.displaySize = input.get(1);
        this.displayResolution = input.get(2);
        this.displayProtection = input.get(3);
        this.displayOther = input.get(4);
    }
    // get set
    public String getDisplayProtection() {
        return displayProtection;
    }

    public String getDisplayOther() {    
        return displayOther;
    }

    public String getDisplayType() {
        return displayType;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayProtection(String displayProtection) {
        this.displayProtection = displayProtection;
    }

    public void setDisplayOther(String displayOther) {
        this.displayOther = displayOther;
    }
    
    
    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }
    
    
}
