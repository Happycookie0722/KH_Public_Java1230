package 제네릭예제3;

public class GenericEx3 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrint = new GenericPrinter<>();
        powderPrint.setMaterial(new Powder()); // Powder 타입의 객체를 생성
        Powder powder = powderPrint.getMaterial();
        Powder powder1 = new Powder();
        powder1.doPrinting();
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrint = new GenericPrinter<>();
        plasticPrint.setMaterial(new Plastic()); // Powder 타입의 객체를 생성
        Plastic plastic = plasticPrint.getMaterial();
        System.out.println(plastic);

        GenericPrinter<Water> waterPrint = new GenericPrinter<>();
        waterPrint.setMaterial(new Water()); // Powder 타입의 객체를 생성
        Water water = waterPrint.getMaterial();
        System.out.println(water);
    }
}
