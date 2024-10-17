package test3.Autos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import test3.Auto.Auto;

public class Autos {
    private List<Auto> autos;

    public Autos(){
        this.autos = new ArrayList<>();
    }

    public void addAuto(Auto auto){
        autos.add(auto);
    }

    public void getAutos(){
        Collections.sort(autos);
        for (Auto auto : autos) {
            System.out.println(auto.getAuto());
        }
    }
}
