
/**
 * CanaryMod Player manager wrapper
 * @author Chris Ksoll
 *
 */
public class PlayerManager {
    private OPlayerManager pm;

    public PlayerManager(OPlayerManager pm) {
        this.pm = pm;
    }

    /**
     * Update the given player
     * @param player
     */
    public void updateMountedMovingPlayer(OEntityPlayerMP player) {
        // SRG pm.func_72685_d(player);
        pm.d(player);
    }

    /**
     * Update given player
     * @param player
     */
    public void updateMountedMovingPlayer(Player player) {
        this.updateMountedMovingPlayer(player.getEntity());
    }

    /**
     * Add player to this player manager
     * @param player
     */
    public void addPlayer(OEntityPlayerMP player) {
        // SRG pm.func_72683_a(player);
        pm.a(player);
    }

    /**
     * Remove the given player from this player manager
     * @param player
     */
    public void removePlayer(OEntityPlayerMP player) {
        // SRG pm.func_72695_c(player);
        pm.c(player);
    }

    public void markBlockNeedsUpdate(int x, int y, int z) {
        // SRG pm.func_72687_a(x, y, z);
        pm.a(x, y, z);
    }
}
