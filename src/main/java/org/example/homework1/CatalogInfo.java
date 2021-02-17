package org.example.homework1;
import java.io.*;

public class CatalogInfo {
    private static int count;

    public static void getCatalogInfo(String catalogName){
        count++;
        File catalog=new File(catalogName);
        if (count<2){
            System.out.println(" - "+catalog.getName()+": catalog");
        }


        if (catalog.isDirectory()){
            for (File items:catalog.listFiles()){

                if(items.isDirectory()){
                    System.out.println(" - "+items.getName()+": catalog");
                    catalogName=items.getPath()+"";
                    getCatalogInfo(catalogName);
                }
                else {
                    System.out.println("     -  "+items.getName()+": file");
                }

            }
        }


    }



    public static void main(String[] args) {

        String catalogName="D:/Game";

                getCatalogInfo(catalogName);
    }

}
