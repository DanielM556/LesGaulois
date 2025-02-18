package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public Druide(String nom, int force, Chaudron chaudron) {
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide" + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		this.parler("J'ai concocté" + quantite + "dose de potion magique. "
				+ "Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {
		// TODO Auto-generated method stub
		if (chaudron.resterPotion()) {
			if (gaulois.getNom() == "Obélix") {
				parler("Non" + gaulois.getNom() + "Non !... Et tu le sais très bien !");
			} else {
				gaulois.boirePotion(chaudron.prendreLouche());
				parler("Tiens, " + gaulois.getNom() + "un peu de potion magique. ");
			}
		} else {
			parler("Désolé " + gaulois.getNom() + "il n'y a plus une seule goutte de poption.");
		}
	}

	public String getNom() {
		return nom;
	}

}
