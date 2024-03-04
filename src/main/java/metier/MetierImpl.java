package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
@Override
public List<Velo> getVelosParMotCle(String mc) {
List<Velo> vls= new ArrayList<Velo>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from Velos where NOM_VELO LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Velo p = new Velo();
p.setIdVelo(rs.getLong("ID_VELO"));
p.setNomVelo(rs.getString("NOM_VELO"));
p.setPrix(rs.getDouble("PRIX"));
vls.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
System.out.println("Velos ::::::::::   " + vls);
return vls;
}
@Override
public void addVelo(Velo p) {
// TODO Auto-generated method stub
}
}