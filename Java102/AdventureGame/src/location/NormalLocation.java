package location;

import player.Player;

public class NormalLocation extends Location{
    public NormalLocation(Player player, String name, int id){
        super(player, name, id);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
