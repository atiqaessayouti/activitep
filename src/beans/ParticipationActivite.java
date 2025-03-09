package beans;

class ParticipationActivite {
	private int id;
	private Activite activite;
	private Etudiant etudiant;

	public ParticipationActivite(int id, Activite activite, Etudiant etudiant) {
		this.id = id;
		this.activite = activite;
		this.etudiant = etudiant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
}
