package Lesson15.THArrayIndexOutOfBounds;

import java.util.concurrent.ThreadLocalRandom;

public class Create {
    static Integer[] createRandom(){
//        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for(int i = 0; i<100; i++){
//            arr[i] = rd.nextInt(100);
            arr[i] = ThreadLocalRandom.current().nextInt(0,99); /*dong nay thay the cho 2 dong duoc comment*/
        }
        return arr;
    }
}
