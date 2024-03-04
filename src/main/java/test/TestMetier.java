package test;

import java.util.List;

import metier.MetierImpl;
import metier.Velo;

public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Velo> vls = metier.getVelosParMotCle("B");
for (Velo p : vls)
System.out.println(p.getNomVelo());
}
}
