package lavage;

public class Assiette {
	// On compte le nombre total d'assiettes
	private static int nombreAssiettes = 0;
    // Chaque assiette a un numéro
	private final int numeroAssiette;

	public Assiette() {
        // Pour que la classe soit "thread safe" :
		synchronized(this) {
			numeroAssiette = ++nombreAssiettes;
		}
	}

	@Override
	public String toString() {
		return "assiette n°" + numeroAssiette;
	}

}
//Non, il n'y a pas d'incohérences, pas de doublons car il y a le synchronized qui permet d'empêcher que plusieurs threads aient 
//la même assiette.