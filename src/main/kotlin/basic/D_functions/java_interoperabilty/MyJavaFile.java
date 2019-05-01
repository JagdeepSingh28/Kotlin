package basic.D_functions.java_interoperabilty;

public class MyJavaFile {

    public static void main(String[] args) {

//        int sum = MyKotlinInteroperabilityKt.addNumbers(3, 4);
//        System.out.println("Printing sum from Java file :" + sum);

        int volume = MyKotlinInteroperabilityKt.findVolume(10,20,30);
        System.out.println("Volume is :" + volume);
    }

    public static int getArea(int l, int b) {
        return l * b;
    }
}
