/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import static demo.SetDemo.removeItemIntoSet;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashSet;
import read_excel_file.ReadingXLSXFile;
import specs.Product;

/**
 *
 * @author QuachVanLong
 */
public class Demo {
    public static long startTime;
    public static long totalTime;
    public static String formatNumber(long a){
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String converted = decimalFormat.format(a);
        return converted;
    }
    public static void showTime(String name){
       System.out.println("Time " + name + "  : " + formatNumber(totalTime));
    }
    public static void measureTimeFunctionSortByName( HashSet<Product> set){
       startTime = System.nanoTime();
       ArrayDemo.sortedListProductByNameWithArray(ArrayDemo.convertSetToArray(set), true);
       totalTime = System.nanoTime() - startTime;
       showTime("Array");
       startTime = System.nanoTime();
       SetDemo.sortedListProductByNameWithSet(set, true);
       totalTime = System.nanoTime() - startTime;
       showTime("Set");
    }
    public static void measureTimeFunctionSortByPrice( HashSet<Product> set){
       startTime = System.nanoTime();
       ArrayDemo.sortedListProductByPriceWithArray(ArrayDemo.convertSetToArray(set), true);
       totalTime = System.nanoTime() - startTime;
       showTime("Array");
       startTime = System.nanoTime();
       SetDemo.sortedListProductByPriceWithSet(set, true);
       totalTime = System.nanoTime() - startTime;
       showTime("Set");
    }
    public static void measureTimeFunctionFindByID( HashSet<Product> set) throws IOException{
       startTime = System.nanoTime();
       ArrayDemo.findItemIntoArray(ArrayDemo.convertSetToArray(set));
       totalTime = System.nanoTime() - startTime;
       showTime("Array");
       startTime = System.nanoTime();
       SetDemo.findItemIntoSet(set);
       totalTime = System.nanoTime() - startTime;
       showTime("Set");
    }
    public static void measureTimeFunctionEditByID( HashSet<Product> set) throws IOException{
       startTime = System.nanoTime();
       ArrayDemo.editProductIntoArray(ArrayDemo.convertSetToArray(set));
       totalTime = System.nanoTime() - startTime;
       showTime("Array");
       startTime = System.nanoTime();
       SetDemo.editProductIntoSet(set);
       totalTime = System.nanoTime() - startTime;
       showTime("Set");
    }
    public static void measureTimeFunctionRemoveByID( HashSet<Product> set) throws IOException{
       startTime = System.nanoTime();
       ArrayDemo.removeItemIntoArray(ArrayDemo.convertSetToArray(set));
       totalTime = System.nanoTime() - startTime;
       showTime("Array");
       startTime = System.nanoTime();
       SetDemo.removeItemIntoSet(set);
       totalTime = System.nanoTime() - startTime;
       showTime("Set");
    }
    
    public static void main(String[] args) throws IOException {
        HashSet<Product> set = ReadingXLSXFile.getDataFromExcelFile(5000,"C:\\Users\\QuachVanLong\\Desktop\\Java\\Data\\FileDataProduct.xlsx");
        //So sánh thời gian thực hiện đối với sắp xếp
        measureTimeFunctionSortByName(set);
        measureTimeFunctionSortByPrice(set);
        //So sánh thời gian thực hiện đối với phương thức tìm kiếm
        measureTimeFunctionFindByID(set);
        //So sánh thời gian thực hiện đối với phương thức sửa
        measureTimeFunctionEditByID(set);
        //So sánh thời gian thực hiện đối với phương thức sửa
        measureTimeFunctionRemoveByID(set);
    }
}
