/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

import java.util.ArrayList;

/**
 * Các thông số về mạng
 * @author QuachVanLong
 */
public class Network {
    private String net2g;     // mạng 2g 
    private String net3g;     // mạng 3g      
    private String net4g;     // mạng 4g       
    private String net5g;     // mạng 5g       
    private String gprstext;  // công nghệ mạng GPRS
    private String edge;      // công nghệ mạng Edge
    private String speed;     //chi tiết tốc độ mạng
    //Phương thức khởi tạo
    public Network() {
    }

    public Network(String net2g, String net3g, String net4g, String net5g, String gprstext, String edge, String speed) {
        this.net2g = net2g;
        this.net3g = net3g;
        this.net4g = net4g;
        this.net5g = net5g;
        this.gprstext = gprstext;
        this.edge = edge;
        this.speed = speed;
    }

    public Network(ArrayList<String> input) {
        this.net2g = input.get(0);
        this.net3g = input.get(1);
        this.net4g = input.get(2);
        this.net5g = input.get(3);
        this.gprstext = input.get(4);
        this.edge = input.get(5);
        this.speed = input.get(6);
    }
    //Override
    @Override
    public String toString() {
        String result = "NETWORK:";
        result += (!net2g.isBlank() ? (" - 2G Bands : " + net2g + "\n") : "") +
                           (!net3g.isBlank() ? (" - 3G Bands : " + net3g + "\n") : "") +
                           (!net4g.isBlank() ? (" - 4G Bands : " + net2g + "\n") : "") +
                           (!net5g.isBlank() ? (" - 5G Bands : " + net3g + "\n") : "") +
                           (" - gprs : " + gprstext + "\n") + 
                           (" - edge : " + edge + "\n") + 
                           (" - speed : " + speed);
        return result;
    }
    // get set
    public String getNet2g() {
        return net2g;
    }

    public String getNet3g() {
        return net3g;
    }

    public String getNet4g() {
        return net4g;
    }

    public String getNet5g() {
        return net5g;
    }

    public String getGprstext() {
        return gprstext;
    }

    public String getEdge() {
        return edge;
    }

    public void setNet2g(String net2g) {
        this.net2g = net2g;
    }

    public void setNet3g(String net3g) {
        this.net3g = net3g;
    }

    public void setNet4g(String net4g) {
        this.net4g = net4g;
    }

    public void setNet5g(String net5g) {
        this.net5g = net5g;
    }

    public void setGprstext(String gprstext) {
        this.gprstext = gprstext;
    }

    public void setEdge(String edge) {
        this.edge = edge;
    }

}
