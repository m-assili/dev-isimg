package tpmock;

public class ServiceUtilisateur {
	
	private UtilisateurRepository utilisateurRepository;

	public ServiceUtilisateur(UtilisateurRepository utilisateurRepository) {
		this.utilisateurRepository = utilisateurRepository;
	}
	public Utilisateur ajouterutilisateur(String username,String password) {
		Utilisateur u = new Utilisateur();
		u.setUsername(username);
		u.setPassword(password);
		return utilisateurRepository.save(u);
	}
	

}
