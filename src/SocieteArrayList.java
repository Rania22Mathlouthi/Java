import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{
    private ArrayList<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override

    public void ajouterEmploye(Employe e) {
        employes.add(e);

    }

    @Override

    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    @Override

    public boolean rechercherEmploye(Employe t) {
        return this.employes.contains(t);
    }
    @Override

    public void supprimerEmploye(Employe t) {
        this.employes.remove(t);

    }
    @Override

    public void displayEmploye() {
        for (Employe employe : this.employes) {
            System.out.println(employe);
        }

    }

    @Override

    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));

    }
    @Override

    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, Comparator.comparing(Employe::getId).thenComparing(Employe::getGrade));

    }
}
