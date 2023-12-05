public class Etudiant {
    private int id ;
    private String nom;
    private int age;
    public Etudiant(){}
    public Etudiant(int id , String nom , int age ){
        this.age=age;
        this.id=id;
        this.nom=nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Etudiant{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +

                '}';
    }
}