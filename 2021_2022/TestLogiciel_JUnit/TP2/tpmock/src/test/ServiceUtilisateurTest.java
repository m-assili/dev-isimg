package tpmock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServiceUtilisateurTest {
	Utilisateur user;
	@Mock
	private UtilisateurRepository userRep;
	@InjectMocks
	private ServiceUtilisateur serviceUser;
	
	@BeforeEach
	void init() {
		user = new Utilisateur();
	}
	
	@Test
	public void test() {
		when(userRep.save(any(Utilisateur.class))).thenReturn(user);
		
		assertNotNull(serviceUser.ajouterutilisateur("mohammed", "123"));
		
		verify(userRep,times(1)).save(any(Utilisateur.class));
	}

}
