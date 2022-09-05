/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

import java.util.ArrayList;

/**
 * Các thông số về thời điểm công bố sản phẩm
 * @author QuachVanLong
 */
public class Launch {
    private String announced; // thời gian công bố
    private String status;    // trạng thái
    
    //Phương thức khởi tạo
    public Launch() {    
    }

    public Launch(String announced, String status) {
        this.announced = announced;
        this.status = status;
    }
    
    public  Launch(ArrayList<String> input){
        this.announced = input.get(0);
        this.status = input.get(1);
    }
    //get set
    public String getAnnounced() {
        return announced;
    }

    public String getStatus() {
        return status;
    }

    public void setAnnounced(String announced) {
        this.announced = announced;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
