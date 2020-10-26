package factorymethod;

public abstract class AterioivaOtus {

    Juoma juoma = null;
    Ruoka ruoka = null;

    public abstract Juoma createJuoma();
    public abstract Ruoka createRuoka();


    public void aterioi(){
        sy�();
        juo();
    }

    public void sy�(){
    	if (ruoka == null)
    		ruoka = createRuoka();
        System.out.println("Kyll�p� " + ruoka + " maistuukin hyv�lt�");
    }


    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian j�lkeen " + juoma + " tekee ter��");
    }
}
