package test_fonctionne;

import java.util.Iterator;

import personnages.Chaudron;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romains;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois ast = new Gaulois("Astérix", 8);
		Gaulois obe = new Gaulois("Obélix", 16);
		Romains min = new Romains("Minus", 6); 
		Romains bru = new Romains("Brutus", 14);
		Druide pan = new Druide("Panoramix", 2, new Chaudron());
		pan.fabriquerPotion(4, 3);
		pan.booster(obe);
		pan.booster(ast);
		
		ast.parler("Bonjour Obélix.");
		obe.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		ast.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt " + ast.getNom() + " et " + obe.getNom() + " tombe nez à nez sur le romain " + min.getNom());
		
		for (int i = 0; i < 3; i++) {
			ast.frapper(min);
		}
	}
	
}
