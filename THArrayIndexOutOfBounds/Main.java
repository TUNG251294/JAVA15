package Lesson15.THArrayIndexOutOfBounds;

import java.util.Scanner;

public class Main extends Create{   /*k kế thừa thì không gọi được pthuc từ class khác*/
    public static void main(String[] args) {
        Integer[] myArray = createRandom();   /*Muốn gọi ra pthuc tu class khac thi phuong thuc do phai static*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random number ");

        try{
            int x = Integer.parseInt(input.nextLine());
            System.out.println("Gia tri cua phan tu co chi so " + x + " la " + myArray[x]);
        } catch (NumberFormatException e){
            System.err.println("Wrong format");
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chi so vuot qua gioi han cua mang");
        }


    }
}
