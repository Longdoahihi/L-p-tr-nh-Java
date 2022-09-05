/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import read_excel_file.ReadingXLSXFile;
import specs.Product;

/**
 *
 * @author QuachVanLong
 */
public class SetDemo {
    
    public static int is_Inc = 1;

    /**
     * Sắp xếp với tên hoặc sắp xếp với giá tiền sử dụng Set
     *
     * @param set
     * @param isINC tăng hoặc giảm
     */
    public static void sortedListProductByNameWithSet(Set<Product> set, boolean isINC) {
        if (isINC) {
            is_Inc = 1;
        } else {
            is_Inc = -1;
        }
        Set<Product> treeSet = new TreeSet<>(new sortedByName());
        treeSet.addAll(set);
        printSet(treeSet);
    }

    public static void sortedListProductByPriceWithSet(Set<Product> set, boolean isINC) {
        if (isINC) {
            is_Inc = 1;
        } else {
            is_Inc = -1;
        }
        Set<Product> hashSet = new TreeSet<>(new sortedByPrice());
        hashSet.addAll(set);
//        printSet(hashSet);
    }
    /**
     * Sửa sản phẩm theo id nhập
     * @param set
     * @throws IOException 
     */
    
    public static void editProductIntoSet(HashSet<Product> set) throws IOException{
        String pathFile = "C:\\Users\\QuachVanLong\\Desktop\\Java\\ItemDemo.xlsx";
        HashSet<Product> setReadFile = ReadingXLSXFile.getDataFromExcelFile(1, pathFile);
        Product[] arr = setReadFile.toArray(new Product[setReadFile.size()]);
        Product item = arr[0];
        
        for (Product product : set) {
            if (product.getId() == item.getId()){
                System.out.println("Thông tin điện thoại cũ:");
                Product.printHeader();
                product.printLine();
                product = item;
                System.out.println("Thông tin điện thoại mới:");
                Product.printHeader();
                product.printLine();
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm nào có id là: " + item.getId());
    }
    /**
     * Tìm kiếm sản phẩm
     * @param list 
     */
    public static void findItemIntoSet(HashSet<Product> set) throws IOException{
        String pathFile = "C:\\Users\\QuachVanLong\\Desktop\\Java\\ItemDemo.xlsx";
        HashSet<Product> setReadFile = ReadingXLSXFile.getDataFromExcelFile(1, pathFile);
        Product[] arr = setReadFile.toArray(new Product[setReadFile.size()]);
        Product item = arr[0];
        
        if (set.contains(item)){
            for (Iterator<Product> iter = setReadFile.iterator(); iter.hasNext();) {
                Product next = iter.next();
                if (next.equals(item)){
                    System.out.println("Thông tin sản phẩm có id là: " + item.getId());
                    Product.printHeader();
                    next.printLine();
                }
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm có id là: "+ item.getId());
        }
    }
    /**
     *  Xóa sản phẩm
     * @param list 
     */
    public static void removeItemIntoSet(HashSet<Product> set) throws IOException{
        String pathFile = "C:\\Users\\QuachVanLong\\Desktop\\Java\\ItemDemo.xlsx";
        HashSet<Product> setReadFile = ReadingXLSXFile.getDataFromExcelFile(1, pathFile);
        Product[] arr = setReadFile.toArray(new Product[setReadFile.size()]);
        Product item = arr[0];
        
        if (set.contains(item)){
            set.remove(item);
            System.out.println("Đã xóa sản phẩm có id là: "+ item.getId());
        } else {
            System.out.println("Không tìm thấy sản phẩm có id là: "+ item.getId());
        }
    }

    public static void printSet(Set<Product> list) {
        Product.printHeader();
        for (Product product : list) {
            product.printLine();
        }
    }

    public static void main(String[] args) throws IOException {
        HashSet<Product> listProduct = ReadingXLSXFile.getDataFromExcelFile(5000,"C:\\Users\\QuachVanLong\\Desktop\\Java\\FileData.xlsx");
        //Sắp xếp sản phẩm theo tên
        sortedListProductByNameWithSet(listProduct, true);
        System.out.println();
//        //Sửa sản phẩm theo id
//        editProductIntoSet(listProduct);
//        System.out.println();
//        //Tìm kiếm sản phẩm theo id
//        findItemIntoSet(listProduct);
//        System.out.println();
//        //Xóa sản phâm khỏi danh sách theo id
//        removeItemIntoSet(listProduct);
//        System.out.println();
    }

    static class sortedByName implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            if (is_Inc == 1) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            } else {
                return o2.getName().compareToIgnoreCase(o1.getName());
            }
        }
    }

    static class sortedByPrice implements Comparator<Product> {

        @Override
        // Chú ý: return 0 thì khi sắp sếp những sản phẩm có cùng giá sẽ bị loại bỏ
        public int compare(Product o1, Product o2) {
            long priceO1 = o1.getFeatures().getPrice();
            long priceO2 = o2.getFeatures().getPrice();
            if (priceO1 * is_Inc > priceO2 * is_Inc) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    
}
