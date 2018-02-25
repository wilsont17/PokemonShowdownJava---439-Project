import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class PokemonShowdownMainGuiTest {

    @Test
    public void stabResult_test(){
        Move move = new Move();
        move.setDmgType(10);
        Pokemon pokemon = new Pokemon();
        pokemon.addType("fire");
        PokemonShowdownMainGui gui = new PokemonShowdownMainGui("test");
        Assert.assertEquals(1.5, gui.stabResult(pokemon, move), .1);
    }

}