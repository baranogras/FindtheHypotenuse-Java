package Lesson2;

import java.util.Scanner;

public class findthehypo {
    public static void main(String[] args) {
        int shortSide1,shortSide2,area;
        double longSide,perimeter;

        Scanner input = new Scanner(System.in);
        System.out.print("First Short Side : ");
        shortSide1 = input.nextInt();
        System.out.print("Second Short Side : ");
        shortSide2 = input.nextInt();
        longSide = Math.sqrt((shortSide1*shortSide1) + (shortSide2*shortSide2));
        System.out.println("Hypotenuse : " +longSide);

        perimeter = shortSide1+shortSide2+longSide;
        System.out.println("Perimeter : " +perimeter);
        area = (shortSide1*shortSide2)/2;
        System.out.println("Area : " +area);

    }
}
