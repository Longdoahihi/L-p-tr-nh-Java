/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specs;

/**
 *
 * @author QuachVanLong
 */
public class Product {
    public static final String STRING_FORMAT = "%-10s%-25s%-26s%-26s%-26s%-26s%-26s%-26s%-16s%-10s\n";
    private long id;
    private String name;
    private Network network;    // thông tin về mạng
    private Launch launch;      // thời gian phát hành và trạng thái
    private Body body;          // thông tin kiểu dáng và chất liệu
    private Display display;    // thông tin màn hình
    private Platform platform;  // thông tin về nền tảng
    private Memory memory;      // thông tin về bộ nhớ
    private Camera mainCamera;  // thông tin camera chính
    private Camera selfieCamera;// thông tin camera sefie
    private Comms comms;        // thông tin các cổng kết nối của điện thoại
    private Features features;  // một số đặc điểm khác
    private Battery battery;    // thông tin vê pin
    
    //Các phương thức xuất ra màn hình
    @Override    
    public String toString() {
        String result = "";
        result += "Id : " + id + "\n"
                + "Name : " + name + "\n"
                + network + "\n"
                + features + "\n"
                + "===========================";
        return result;
    }
    //Rút gọn chuỗi để vừa với cột
    public String shortString(String s,int limit){
        if (s.length() > limit)
            return (s.substring (0,limit - 3) + "...");
        else
            return s;
    }
    //In tiêu đề cột
    public static final void printHeader(){
        System.out.printf(STRING_FORMAT,"ID","NAME","ANNOUNCED","STATUS",
                "DIMÉNIONS","DISPLAY","OPERATING_SYSTEM","CPU","COLORS","PRICE");
    }
    //In các dòng dữ liệu
    public void printLine(){
        System.out.printf(STRING_FORMAT,id,shortString(name, 25),shortString(launch.getAnnounced(),25),
                shortString(launch.getStatus(),25),shortString(body.getDimensions(),25),
                shortString(display.getDisplayType(),25),shortString(platform.getOs(),25),
                shortString(platform.getCpu(),25),shortString(features.getColors(),15),
                features.getPrice());
    }
    public boolean equals(Object obj) {
        return this.getId() == ((Product)obj).getId();
    }
    public int hashCode() {
        return (int)this.getId(); 
    }
    //get set
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Network getNetwork() {
        return network;
    }

    public Launch getLaunch() {
        return launch;
    }

    public Body getBody() {
        return body;
    }

    public Display getDisplay() {
        return display;
    }

    public Platform getPlatform() {
        return platform;
    }

    public Memory getMemory() {
        return memory;
    }

    public Camera getMainCamera() {
        return mainCamera;
    }

    public Camera getSelfieCamera() {
        return selfieCamera;
    }

    public Comms getComms() {
        return comms;
    }

    public Features getFeatures() {
        return features;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void setLaunch(Launch launch) {
        this.launch = launch;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMainCamera(Camera mainCamera) {
        this.mainCamera = mainCamera;
    }

    public void setSelfieCamera(Camera selfieCamera) {
        this.selfieCamera = selfieCamera;
    }

    public void setComms(Comms comms) {
        this.comms = comms;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
    
    
}
