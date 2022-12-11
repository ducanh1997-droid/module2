import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm");
        int n = Integer.parseInt(scanner.nextLine());
        Product[] listProduct = new Product[n];
        for(int i = 0;i<listProduct.length;i++){
            System.out.println("Nhập code sản phẩm "+(i+1));
            int code = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên sản phẩm "+(i+1));
            String name = scanner.nextLine();
            System.out.println("Nhập giá sản phẩm "+(i+1));
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập loại sản phẩm "+(i+1));
            String type = scanner.nextLine();
            System.out.println("Nhập đơn vị tiền sản phẩm "+i+1);
            String currency = scanner.nextLine();
            Product product = new Product(code,name,price,type,currency);
            listProduct[i] = product;
        }
        for(int i = 0;i< listProduct.length;i++){
            if(i == 0){
                System.out.printf("%-20s%s","Mã"," ");
                System.out.printf("%-20s%s","Tên Sản Phẩm"," ");
                System.out.printf("%-20s%s","Giá"," ");
                System.out.printf("%-20s%s","Loại Sản Phẩm"," ");
                System.out.printf("%-20s%s","Tiền tệ"," ");
                System.out.println();
            }
            System.out.printf("%-20s%s",listProduct[i].getCode()," ");
            System.out.printf("%-20s%s",listProduct[i].getName()," ");
            System.out.printf("%-20s%s",listProduct[i].getPrice()," ");
            System.out.printf("%-20s%s",listProduct[i].getType()," ");
            System.out.printf("%-20s%s",listProduct[i].getCurrency()," ");
            System.out.println();
        }
//        System.out.println("Nhập tên sản phẩm muốn tìm:");
//        String name = scanner.nextLine();
//        findProduct(listProduct,name);
        System.out.println("Tổng giá các sản phẩm là:"+sumPrice(listProduct));

        System.out.println("Xoá các sản phẩm có tên:");
        String nameDelete = scanner.nextLine();
        delete(listProduct,nameDelete);
    }
    public static void findProduct(Product[] arrayProduct,String name){
            boolean flag = false;
            for(int i = 0;i<arrayProduct.length;i++){
                String nameProduct = arrayProduct[i].getName();
                if(nameProduct.contains(name)){
                    System.out.printf("%-20s%s",arrayProduct[i].getCode()," ");
                    System.out.printf("%-20s%s",arrayProduct[i].getName()," ");
                    System.out.printf("%-20s%s",arrayProduct[i].getPrice()," ");
                    System.out.printf("%-20s%s",arrayProduct[i].getType()," ");
                    System.out.printf("%-20s%s",arrayProduct[i].getCurrency()," ");
                    System.out.println();
                    flag = true;
                }
            }
            if(!flag){
                System.out.println("Không tìm thấy sản phẩm");
            }
    }
    public static int sumPrice(Product[] arrayProduct){
        int sum = 0;
           for(int i = 0;i< arrayProduct.length;i++){
               sum+=arrayProduct[i].getPrice();
           }
           return sum;
    }


    public static void delete(Product[] arrayProduct,String name){
        int count = 0;
        for(int i = 0;i< arrayProduct.length;i++){
            String nameProduct = arrayProduct[i].getName();
            if(nameProduct.equals(name)){
                arrayProduct[i].setName("deleted");
                count ++;
            }
        }
        Product[] newArray = new Product[arrayProduct.length-count];
        for(int i=0,j=0;i<arrayProduct.length;i++){
            String nameProduct = arrayProduct[i].getName();
            if(!nameProduct.equals("deleted")){
                newArray[j] = arrayProduct[i];
                j++;
            }
        }
        System.out.println("Sản phẩm còn lại là:");
        for(int i=0;i< newArray.length;i++){
            System.out.printf("%-20s%s",newArray[i].getCode()," ");
            System.out.printf("%-20s%s",newArray[i].getName()," ");
            System.out.printf("%-20s%s",newArray[i].getPrice()," ");
            System.out.printf("%-20s%s",newArray[i].getType()," ");
            System.out.printf("%-20s%s",newArray[i].getCurrency()," ");
            System.out.println();
        }
    }
}
