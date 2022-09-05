/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package read_excel_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import specs.Battery;
import specs.Body;
import specs.Camera;
import specs.Comms;
import specs.Display;
import specs.Features;
import specs.Launch;
import specs.Memory;
import specs.Product;
import specs.Network;
import specs.Platform;

/**
 *
 * @author QuachVanLong
 */
public class ReadingXLSXFile {
    /**
     * @param start : điểm bắt đầu
     * @param end   : điểm cuối
     * @param row   : dòng đang duyệt hiện tại
     * @return ArrayList      : List các thuộc tính có cùng một nhóm
     */
    private static ArrayList cutCell(int start,int end,Row row) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i=start;i<=end;i++){
            temp.add(row.getCell(i)==null ? "" : row.getCell(i).toString());
        }
        return temp;
    }
    
    /**
     * Đọc File Excel và trả về một mảng
     * @param amount : Số lượng bản ghi cần lấy
     * */
    public static HashSet<Product> getDataFromExcelFile(int amount,String pathFile) throws FileNotFoundException, IOException{
        //Khai báo các giá trị cần thiết để đọc file
        HashSet<Product> listProduct = new HashSet<>();
        FileInputStream fins = new FileInputStream(new File(pathFile));
        XSSFWorkbook wb = new XSSFWorkbook(fins);
        XSSFSheet sheet = wb.getSheetAt(0);
        FormulaEvaluator fmEval = wb.getCreationHelper().createFormulaEvaluator();
        
        //Đọc và hiển thị dữ liệu
        for (Row row : sheet){
            Product p = new Product();
            int cellCount = row.getLastCellNum(),i=0;
            //Bỏ dòng đầu(Header)
            if (row.getRowNum()==0 )
                continue;
            //Đủ số lượng bản ghi yêu cầu thì dừng 
            if (row.getRowNum()==amount+1)
                break;
            while (i<=cellCount){
                switch (i) {
                    case 0:
                        String val = cutCell(0, 0, row).get(0).toString();
                        p.setId(Math.round(Double.parseDouble(val))); i++;
                        break;
                    case 1:
                        p.setName(cutCell(1,1,row).get(0).toString()); i++;                       
                        break;
                    case 2:
                        p.setNetwork(new Network(cutCell(2,8,row))); i=9;
                        break;
                    case 9:
                        p.setLaunch(new Launch(cutCell(9,10,row)));  i=12;
                        break;
                    case 12:
                        p.setBody(new Body(cutCell(11,15,row)));i=16;
                        break;
                    case 16:
                        p.setDisplay(new Display(cutCell(16,20,row)));i=21;
                        break;
                    case 21:
                        p.setPlatform(new Platform(cutCell(21,24,row)));i=25;
                        break;
                    case 25:
                        p.setMemory(new Memory(cutCell(25,27,row))); i=28;
                        break;
                    case 28:
                        ArrayList<String> temp = cutCell(28,29,row); temp.add(0, "maincamera");
                        p.setMainCamera(new Camera(temp)); i=30;
                        break;
                    case 30:
                        ArrayList<String> temp1 = cutCell(30,31,row); temp1.add(0, "selfiecamera");                        
                        p.setSelfieCamera(new Camera(temp1)); i=32;
                        break;
                    case 32:
                        p.setComms(new Comms(cutCell(32,37,row))); i=38;
                        break;
                    case 38:
                        p.setBattery(new Battery(cutCell(38,40,row))); i=41;
                        break;
                    case 41:
                        p.setFeatures(new Features(cutCell(41,53,row))); i=1000;
                    default:
                        break;
                }
            }
            listProduct.add(p);
        }
        return listProduct;
    }
}
