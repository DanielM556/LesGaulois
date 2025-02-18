package personnages;

public class Romains {
	private String nom;	
	private int force;

	public Romains(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain" + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		this.force = this.force - forceCoup;
		
		if (force < 1) {
			System.out.println("J'abandonne !");
		} else {
			System.out.println("Aie !");
		}
	}
}
