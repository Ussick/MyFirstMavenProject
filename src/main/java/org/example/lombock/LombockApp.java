package org.example.lombock;

import lombok.SneakyThrows;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LombockApp {
    public static void main(String[] args) {
        ProductModel productModel=new ProductModel();
        productModel.setName("Product 1");
        productModel.getName();
        //productModel.setPrice(BigDecimal.ONE);/private access

        String category=productModel.getCategory();
        //System.out.println(productModel.getName());
        TVmodel tv=new TVmodel();
        tv.setName("tv 1");
        System.out.println(productModel);
        //UserModel user=new UserModel("FN", 23, "email", 2);
        //UserModel user2=new UserModel();
//        UserModel user3=new UserModel("email",2);
//        UserModel userModel=UserModel.getInstance();
        List <String> addresses=new ArrayList<>(){{add("rt");add("we");}};
        UserModel userBuilder= UserModel.builder().age(23).email("ma").addresses(addresses)
                .address("address 1").address("addresses 2")
                .id(2).fullName("r").build();
        List<String> addresses1 = userBuilder.getAddresses();


    }
    @SneakyThrows
    public static void  createNewFile(){
        File file=new File("tst.txt");
        file.createNewFile();
    }
}
