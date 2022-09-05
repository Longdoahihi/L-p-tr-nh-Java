/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import read_excel_file.ReadingXLSXFile;
import specs.Product;

/**
 *
 * @author QuachVanLong
 */
public class ArrayDemo {

    public static int is_Inc = 1;

    /**
     * Sắp xếp với tên hoặc sắp xếp với giá tiền sử dụng Mảng
     *
     * @param arr
     * @param isINC tăng hoặc giảm
     */
    public static void sortedListProductByNameWithArray(Product[] arr, boolean isINC) {
        if (isINC) {
            is_Inc = 1;
        } else {
            is_Inc = -1;
        }
        Arrays.sort(arr, new sortedByName());
        printAray(arr);
    }

    public static void sortedListProductByPriceWithArray(Product[] arr, boolean isINC) {
        if (isINC) {
            is_Inc = 1;
        } else {
            is_Inc = -1;
        }
        Arrays.sort(arr, new sortedByPrice());
//        printAray(arr);
    }

    /**
     * Sửa sản phẩm theo id nhập sử dụng Array
     *
     * @param set
     * @throws IOException
     */

    public static void editProductIntoArray(Product[] arrList) throws IOException {
        String pathFile = "C:\\Users\\QuachVanLong\\Desktop\\Java\\ItemDemo.xlsx";
        HashSet<Product> setReadFile = ReadingXLSXFile.getDataFromExcelFile(1, pathFile);
        Product[] arr = setReadFile.toArray(new Product[setReadFile.size()]);
        Product item = arr[0];

        for (Product product : arrList) {
            if (product.getId() == item.getId()) {
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
     *
     * @param list
     */
    public static void findItemIntoArray(Product[] arrList) throws IOException {
        String pathFile = "C:\\Users\\QuachVanLong\\Desktop\\Java\\ItemDemo.xlsx";
        HashSet<Product> setReadFile = ReadingXLSXFile.getDataFromExcelFile(1, pathFile);
        Product[] arr = setReadFile.toArray(new Product[setReadFile.size()]);
        Product item = arr[0];

        for (Product product : arr) {
            if (product.equals(item)) {
                System.out.println("Thông tin sản phẩm có id là: " + item.getId());
                Product.printHeader();
                product.printLine();
            } else {
                System.out.println("Không tìm thấy sản phẩm có id là: " + item.getId());
            }
        }
    }
    /**
     * Xóa sản phẩm
     *
     * @param list
     */
    public static void removeItemIntoArray(Product[] set) throws IOException {
        String pathFile = "C:\\Users\\QuachVanLong\\Desktop\\Java\\ItemDemo.xlsx";
        HashSet<Product> setReadFile = ReadingXLSXFile.getDataFromExcelFile(1, pathFile);
        Product[] arr = setReadFile.toArray(new Product[setReadFile.size()]);
        Product item = arr[0];

        for (int i =0 ;i<arr.length;i++) {
            if (arr[i].equals(item)) {
                System.out.println("Đã xóa sản phẩm có id là: " + item.getId());
                System.out.println("Thông tin sản phẩm vừa xóa: ");
                Product.printHeader();
                arr[i].printLine();
                for (int j = i; j < arr.length - 1; j++) {
                    arr[i] = arr[j];
                }
            } else {
                System.out.println("Không tìm thấy sản phẩm có id là: " + item.getId());
            }
        }
    }

    /**
     * In danh sách các phần tử trong mảng
     *
     * @param list
     */
    public static void printAray(Product[] arr) {
        Product.printHeader();
        for (Product product : arr) {
            product.printLine();
        }
    }

    /**
     * Chuyển một Set thành một mảng
     *
     * @param args
     * @throws IOException
     */
    public static Product[] convertSetToArray(HashSet<Product> set) {
        int length = set.size(), i = 0;
        Product[] temp = new Product[length];
        for (Product product : set) {
            temp[i] = product;
            i++;
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        HashSet<Product> set = ReadingXLSXFile.getDataFromExcelFile(5000, "C:\\Users\\QuachVanLong\\Desktop\\Java\\FileData.xlsx");
        Product[] arr = convertSetToArray(set);
        //Sắp xếp sản phẩm theo tên
//        sortedListProductByNameWithArray(arr, true);
//        System.out.println();
        //Sửa sản phẩm theo id
        editProductIntoArray(arr);
        System.out.println();
        //Tìm kiếm sản phẩm theo id
        findItemIntoArray(arr);
        System.out.println();
        //Xóa sản phâm khỏi danh sách theo id
        removeItemIntoArray(arr);
        System.out.println();
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
            if ((priceO1 * is_Inc) > (priceO2 * is_Inc)) {
                return 1;
            } else if ((priceO1 * is_Inc) == (priceO2 * is_Inc)) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
