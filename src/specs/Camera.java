/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

import java.util.ArrayList;

/**
 * 
 * @author QuachVanLong
 */
public class Camera {
    private String typeCamera;  // Camera chính (MAIN CẢMERA), (camera selfie)
    private String single;      // Độ nét vd: 5MP
    private String video;       // Định dạng tín hiệu vd: 720p
    //Phương thức khởi tạo
    public Camera() {    
        this.typeCamera = FinalVariable.NULL;
        this.single = FinalVariable.NULL;
        this.video = FinalVariable.NULL;
    }
    public Camera(String typeCamera, String single, String video) {
        this.typeCamera = typeCamera;
        this.single = single;
        this.video = video;
    }
    public  Camera(ArrayList<String> input){
        this.typeCamera = input.get(0);
        this.single = input.get(1);
        this.video = input.get(2);
    }
    //get set
    public String getTypeCamera() {
        return typeCamera;
    }

    public String getSingle() {
        return single;
    }

    public String getVideo() {
        return video;
    }

    public void setTypeCamera(String typeCamera) {
        this.typeCamera = typeCamera;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    
    
}
