public class Employe {
    private int id ;
    private String nom;
    private String prenom;
    private String departement;
    private int grade ;
    public Employe(){}
    public Employe(int id,String nom,String prenom,String departement,int garde){
        this.id=id;
        this.nom=nom;
        this.departement=departement;
        this.prenom=prenom;
        this.grade=grade;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom=" + prenom +
                ", departement =" + departement +
                ", grade='" + grade + '\''+
                '}';
    }
    @Override
    public boolean equals (Object obj){
        if(null == obj) return false ;
        if(obj instanceof Employe employe){
            return id==employe.id && nom.equals(employe.nom) ;
        }
        return false;
    }
}
