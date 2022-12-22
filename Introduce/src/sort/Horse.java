package sort;

public class Horse {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        horse(x,y);
    }

    public static void horse(int x,int y){
        for(int i = 0;i<8;i++){
            for(int j = 0;j<7;j++){
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}
