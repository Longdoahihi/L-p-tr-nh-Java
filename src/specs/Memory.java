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
public class Memory {
    private String memorySlot;  // kiểu khe cắm bộ nhớ ngoài
    private String internal;    // bộ nhớ trong, bộ nhớ RAM
    private String memoryOther; //bộ nhớ khác vd:eMMC 4.5

    //Phương thức khởi tạo

    public Memory() {
    }

    public Memory(String memorySlot, String internal, String memoryOther) {
        this.memorySlot = memorySlot;
        this.internal = internal;
        this.memoryOther = memoryOther;
    }
    
    public  Memory(ArrayList<String> input){
        this.memorySlot = input.get(0);
        this.internal = input.get(1);
        this.memoryOther = input.get(2);
    }
    //get set
    public String getMemorySlot() {
        return memorySlot;
    }

    public String getInternal() {
        return internal;
    }

    public String getMemoryOther() {
        return memoryOther;
    }

    public void setMemorySlot(String memorySlot) {
        this.memorySlot = memorySlot;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public void setMemoryOther(String memoryOther) {
        this.memoryOther = memoryOther;
    }
    
    
    
}
