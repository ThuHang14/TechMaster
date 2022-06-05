package DoAn_Java.ArrayList;

import DoAn_Java.model.Product;
import Util.Util;
import java.util.ArrayList;

public class productArray {
    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> b = new ArrayList<>();
        b.add(new Product(Util.randomNumber(1,100),"Sweater", type.Thời_trang,900000,350000,5,7));
        b.add(new Product(Util.randomNumber(1,100),"Carrot",type.Thực_Phẩm,90000,35000,6,4));
        b.add(new Product(Util.randomNumber(1,100),"Pot",type.Đồ_gia_dụng,850000,700000,10,23));
        b.add(new Product(Util.randomNumber(1,100),"Polo",type.Đồ_gia_dụng,90000,35000,200,1000));
        b.add(new Product(Util.randomNumber(1,100),"Dress",type.Thời_trang,450000,300000,50,2));
        b.add(new Product(Util.randomNumber(1,100),"Banana",type.Thực_Phẩm,35000,20000,25,50));

                return b;
    }
}

