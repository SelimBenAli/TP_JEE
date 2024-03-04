package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Velo;
@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
private ImetierCatalogue metier;
@Override
public void init() throws ServletException {
metier=new MetierImpl();
}
@Override
protected void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {String mc=request.getParameter("motCle");
VeloModele mod = new VeloModele();
mod.setMotCle(mc);
List<Velo> prods = metier.getVelosParMotCle(mc);
System.out.println("velos 2 ::::   " + prods);	
mod.setVelos(prods);
System.out.println("velos 3 ::::   " + mod.Velos);	
request.setAttribute("modele", mod);
System.out.println(request.getAttribute("modele"));
VeloModele modele = (VeloModele) request.getAttribute("modele");
List<Velo> velos = modele.getVelos();

System.out.println("Content of modele.Velos:");

for (Velo velo : velos) {
    System.out.println("ID: " + velo.getIdVelo() + ", Nom: " + velo.getNomVelo() + ", Prix: " + velo.getPrix());
}
request.getRequestDispatcher("VelosView.jsp").forward(request,response);
}}