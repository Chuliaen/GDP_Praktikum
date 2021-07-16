package edu.probe;

public abstract class Uhr {
    private double gewicht;

    public Uhr(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }

    public abstract String getGerausch();

    public String getAnzeige() {
        return "analog";
    }
}

class Armbanduhr extends Uhr {
    private String anzeige; private String armband;

    public Armbanduhr(double gewicht, String anzeige, String armband) {
        super(gewicht); this.anzeige = anzeige; this.armband = armband;
    }

    @Override
    public String getGerausch() {
        return "tick-tack";
    }

    @Override public String getAnzeige() { return anzeige;
    }
    public String getArmbandmaterial() { return armband;
    }
}

class Kirchturmuhr extends Uhr {

    public Kirchturmuhr(double gewicht) {
        super(gewicht);
    }

    @Override
    public String getGerausch() {
        return "bim-bam";
    }

}

class main {
    public static void main(String[] args) {
        Uhr uhr1 = new Armbanduhr(7.5, "digital", "Leder");
        Armbanduhr uhr2 = new Armbanduhr(3.5, "digital & analog", "Metall");
        Uhr uhr3 = new Kirchturmuhr(100.7);
        Kirchturmuhr uhr4 = new Kirchturmuhr(150.7);

        String var = ((Armbanduhr)uhr1).getArmbandmaterial();
        String var2 = ((Armbanduhr)uhr2).getArmbandmaterial();
        String var3 = ((Armbanduhr)uhr3).getArmbandmaterial();
        System.out.println(var);
        System.out.println(var2);
        System.out.println(var3);
    }
}