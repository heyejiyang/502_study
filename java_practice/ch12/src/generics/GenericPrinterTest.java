package generics;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderP = new GenericPrinter<>();
        powderP.setMaterial(new Powder());
        //Powder powder = powderP.getMaterial();
        //System.out.println(powder);
        System.out.println(powderP);
       //powder.doPrinting();
        powderP.printing();

        GenericPrinter<Plastic> plasticP = new GenericPrinter<>();
        plasticP.setMaterial(new Plastic());
//        Plastic p1= plasticP.getMaterial();
        System.out.println(plasticP);
//        p1.doPrinting();
        plasticP.printing();

    }
}
