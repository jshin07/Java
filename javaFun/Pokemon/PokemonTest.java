public class PokemonTest{
    public static void main(String[] args) {
        Pokemon p = new Pokemon();
        Pokemon pikachu = p.createPokemon("pikachu", 100, "electric");
        p.pokemonInfo(pikachu);
    }
}
