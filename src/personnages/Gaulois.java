package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
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
		return "Le gaulois" + nom + " : ";
	}
	
	public void frapper(Romains romains) {
		String nomRomain = romains.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = (force*effetPotion) / 3;
		romains.recevoirCoup(forceCoup);
	}

	@Override
	public String toString() {
		return nom ;
	}
	
	public void boirePotion(int ForcePotion) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Gaulois ast = new Gaulois("Astérix", 8);
		System.out.println(ast.toString());
	}

}
