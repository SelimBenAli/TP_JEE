package web;

import java.util.ArrayList;
import java.util.List;
import metier.Velo;


public class VeloModele {
private String motCle;
List<Velo> Velos = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Velo> getVelos() {
return Velos;
}
public void setVelos(List<Velo> Velos) {
this.Velos = Velos;
}

}