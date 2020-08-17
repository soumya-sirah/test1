package ma.mic.sic.budgetaire.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Marche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMarche;
	private String nomMarche;
	@OneToOne(mappedBy = "marche")
    private Projet  projet;

	public Marche() {
		super();
	}

	public int getIdMarche() {
		return idMarche;
	}

	public void setIdMarche(int idMarche) {
		this.idMarche = idMarche;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public String getNomMarche() {
		return nomMarche;
	}

	public void setNomMarche(String nomMarche) {
		this.nomMarche = nomMarche;
	}
	
	
	
}