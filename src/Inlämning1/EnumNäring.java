package Inlämning1;

public enum EnumNäring {
    MINERALVATTEN ("Mineralvatten", 0.02, 0.0),
    PROTEINDRYCK("Proteindryck",0.1,0.2),
    KRANVATTEN("Kranvatten", 0.5, 0.0);

    public final String typ;
    public final double bas;
    public final double gånger;

    EnumNäring(String s, double d, double b){
        typ = s;
        bas = d;
        gånger = b;
    }
}
