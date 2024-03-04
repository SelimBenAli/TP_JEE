package metier;
import java.io.Serializable;
public class Velo implements Serializable{
private Long idVelo;
private String nomVelo;
private double prix;
public Velo() {
super();
}
public Velo(String nomVelo, double prix) {
super();
this.nomVelo = nomVelo;
this.prix = prix;
}
public Long getIdVelo() {
return idVelo;
}
public void setIdVelo(Long idVelo) {
this.idVelo = idVelo;
}
public String getNomVelo() {
return nomVelo;
}
public void setNomVelo(String nomVelo) {
this.nomVelo = nomVelo;
}
public double getPrix() {
return prix;
}
public void setPrix(double prix) {
this.prix = prix;
}
}