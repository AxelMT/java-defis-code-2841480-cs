public class Participant implements etats.Participant {
    private final String nom;
  
    public Participant(String nom) {
      if (nom == null) {
        throw new NullPointerException("Le nom ne peut être nul");
      }
      this.nom = nom;
    }
  
    public String getNom() {
      return nom;
    }
  
    @Override
    public String toString() {
      return getNom();
    }
  
    @Override
    public boolean equals(Object obj) {
      return obj instanceof Participant
          && obj.toString().equals(nom);
    }
  
    @Override
    public int hashCode() {
      return nom.hashCode();
    }
  }
  