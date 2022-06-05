package DoAn_Java.service;
import DoAn_Java.model.Product;
import DoAn_Java.model.TransactionHistory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Bill {
    Scanner sc = new Scanner(System.in);
    ProductService productService = new ProductService();

        public TransactionHistory inputBuy (ArrayList<Product> p) {
            System.out.println("Tên người nhập :");
            String name = sc.nextLine();
            productService.printType(p);
            System.out.println("Nhập id sản phẩm sẽ nhập thêm");
            String id = sc.nextLine();
            if (productService.chooseID(p, id) != null) {
                System.out.println("Số lượng nhập thêm");
                int a = Integer.parseInt(sc.nextLine());
                int amount = a + productService.chooseID(p, id).getInventoryNumber();
                productService.chooseID(p, id).setInventoryNumber(amount);
                System.out.println("Hoàn tất . \n Sản phẩm đã được cập nhập");
                System.out.println(productService.chooseID(p, id));

                long money = (a * productService.chooseID(p, id).getBuyPrice());

                return new TransactionHistory(name+" Nhập __ " , productService.chooseID(p, id).getId(), productService.chooseID(p, id).getName(), LocalDateTime.now(), a, "Số tiền cần trả cho nhà cung cấp : ", money);
            } else {
                System.out.println("không thấy sản phẩm phù hợp");
            }
            return null;
        }
        public void buy (ArrayList < Product > p,ArrayList<TransactionHistory> histories) {
            TransactionHistory add = inputBuy(p);
            histories.add(add);
        }

        public TransactionHistory inputSell (ArrayList < Product > p) {
            System.out.println("Tên người xuất :");
            String name = sc.nextLine();
            productService.printType(p);
            System.out.println("Nhập id sản phẩm muốn xuất đi");
            String id = sc.nextLine();
            if (productService.chooseID(p, id) != null) {
                productService.chooseID(p, id);
                System.out.println("Số lượng xuất đi ");
                int a = Integer.parseInt(sc.nextLine());

                int amount = productService.chooseID(p, id).getInventoryNumber() - a;

                if (amount < 0) {
                    System.out.println("Không đủ sản phẩm để xuất đi");
                } else {
                    productService.chooseID(p, id).setInventoryNumber(amount);
                    System.out.println("Sản phẩm còn lại ");
                    System.out.println(productService.chooseID(p, id));

                    long money = ((long) a * productService.chooseID(p, id).getSellPrice());

                    return new TransactionHistory(name+" Xuất __ ", productService.chooseID(p, id).getId(), productService.chooseID(p, id).getName(),LocalDateTime.now(), a, "Số tiền thu được : ", money);
                }
                return null;
            } else {
                System.out.println("không thấy sản phẩm phù hợp");
            }
            return null;
        }

        public void sell (ArrayList < Product > p,ArrayList<TransactionHistory> histories) {
            TransactionHistory add = inputSell(p);
            histories.add(add);
        }

        public void printHistory (ArrayList<TransactionHistory> histories) {
            System.out.println("Lịch sử giao dịch : ");
            for (TransactionHistory s : histories
            ) {
                System.out.println(s);
            }
            System.out.println("...");
        }
    }
