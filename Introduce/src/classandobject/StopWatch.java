package classandobject;

import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public void start(long startTime){
        this.startTime = startTime;
    }
    public void stop(long endTime){
        this.endTime = endTime;
    }
    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        String start;
        String end;
//        do{
//            System.out.println("gõ start để bắt đầu");
//            start = scanner.nextLine();
//        }while(!start.equals("start"));
//        stopWatch.start(System.nanoTime());
//        System.out.println(stopWatch.getStartTime());
//        do{
//            System.out.println("gõ stop để kết thúc");
//            end = scanner.nextLine();
//        }while(!end.equals("stop"));
//        stopWatch.stop(System.nanoTime());
//        System.out.println(stopWatch.getEndTime());
//        System.out.println("Thời gian đã trôi qua là:"+stopWatch.getElapsedTime());
//        System.out.println(stopWatch.getStartTime());
        int[] array = new int[1000000];
        for(int i = 0;i<array.length;i++){
            array[i] = (int) (Math.random());
        }
//        int[] array1 = {1,2,3,4};
        stopWatch.start(System.currentTimeMillis());
        int max;
        for(int i = 0;i<array.length-1;i++){
            max = array[i];
            for(int j = i+1;j<array.length;j++){
                if(max<array[j]){
                    max = array[j];
                }
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        stopWatch.stop(System.currentTimeMillis());
        System.out.println("Thời gian đã sắp xếp mảng là:"+stopWatch.getElapsedTime());
//        for(int i = 0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
    }
}
