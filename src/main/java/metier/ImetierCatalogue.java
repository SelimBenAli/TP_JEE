package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Velo> getVelosParMotCle(String mc);
public void addVelo(Velo p);
}