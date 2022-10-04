package Inlämning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Program {
    List<Växt> växtList;
    Program(){
        växtList= new ArrayList<>();

        växtList.add(new Kaktus(0.2,"Igge"));
        växtList.add(new PalmTräd( 5.0,"Laura"));
        växtList.add(new KöttätandeVäxt(0.7,"Meatloaf"));
        växtList.add(new PalmTräd(1.0,"Putte"));

        printResult();

    }
    public Växt fetchVäxtObjectIfExist(String input) {
        for(Växt växt : växtList) {
            if(växt.getNamn().equalsIgnoreCase(input)) {
                return växt;
            }
        }
        throw new NoSuchElementException();
    }

    public void printResult() {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");
            try {
                Växt fetched = fetchVäxtObjectIfExist(input);
                fetched.beräknaNäring();
                break;
            } catch (NoSuchElementException e) {
                JOptionPane.showMessageDialog(null, "Fanns ej! Stavfel?");
            }
        }
    }
}

