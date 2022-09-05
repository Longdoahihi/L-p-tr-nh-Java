/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

import java.util.ArrayList;

/**
 * Các thông số về kiểu dáng điện thoại
 * @author QuachVanLong
 */
public class Body {
    private String dimensions;// kích thước
    private String weight;    // trọng lượng
    private String build;     // chất liệu
    private String sim;       // sim 
    private String bodyother; // thông số khác ví dụ: bút cảm ứng
    //Phương thức khởi tạo
    public Body() {  
        this.dimensions = FinalVariable.NULL;
        this.weight = FinalVariable.NULL;
        this.build = FinalVariable.NULL;
        this.sim = FinalVariable.NULL;
        this.bodyother = FinalVariable.NULL;
    }
    public Body(String dimensions, String weight, String build, String sim, String bodyother) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.build = build;
        this.sim = sim;
        this.bodyother = bodyother;
    }
    public  Body(ArrayList<String> input){
        this.dimensions = input.get(0);
        this.weight = input.get(1);
        this.build = input.get(2);
        this.sim = input.get(3);
        this.bodyother = input.get(4);
    }
    //get set
    public String getDimensions() {
        return dimensions;
    }

    public String getWeight() {
        return weight;
    }

    public String getSim() {
        return sim;
    }

    public String getBodyother() {
        return bodyother;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public void setBodyother(String bodyother) {
        this.bodyother = bodyother;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }
    
    
}
