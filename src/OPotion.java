
public class OPotion {

    public static final OPotion[] a = new OPotion[32];
    public static final OPotion b = null;
    public static final OPotion c = (new OPotion(1, false, 8171462)).a("potion.moveSpeed").a(0, 0);
    public static final OPotion d = (new OPotion(2, true, 5926017)).a("potion.moveSlowdown").a(1, 0);
    public static final OPotion e = (new OPotion(3, false, 14270531)).a("potion.digSpeed").a(2, 0).a(1.5D);
    public static final OPotion f = (new OPotion(4, true, 4866583)).a("potion.digSlowDown").a(3, 0);
    public static final OPotion g = (new OPotion(5, false, 9643043)).a("potion.damageBoost").a(4, 0);
    public static final OPotion h = (new OPotionHealth(6, false, 16262179)).a("potion.heal");
    public static final OPotion i = (new OPotionHealth(7, true, 4393481)).a("potion.harm");
    public static final OPotion j = (new OPotion(8, false, 7889559)).a("potion.jump").a(2, 1);
    public static final OPotion k = (new OPotion(9, true, 5578058)).a("potion.confusion").a(3, 1).a(0.25D);
    public static final OPotion l = (new OPotion(10, false, 13458603)).a("potion.regeneration").a(7, 0).a(0.25D);
    public static final OPotion m = (new OPotion(11, false, 10044730)).a("potion.resistance").a(6, 1);
    public static final OPotion n = (new OPotion(12, false, 14981690)).a("potion.fireResistance").a(7, 1);
    public static final OPotion o = (new OPotion(13, false, 3035801)).a("potion.waterBreathing").a(0, 2);
    public static final OPotion p = (new OPotion(14, false, 8356754)).a("potion.invisibility").a(0, 1).e();
    public static final OPotion q = (new OPotion(15, true, 2039587)).a("potion.blindness").a(5, 1).a(0.25D);
    public static final OPotion r = (new OPotion(16, false, 2039713)).a("potion.nightVision").a(4, 1).e();
    public static final OPotion s = (new OPotion(17, true, 5797459)).a("potion.hunger").a(1, 1);
    public static final OPotion t = (new OPotion(18, true, 4738376)).a("potion.weakness").a(5, 0);
    public static final OPotion u = (new OPotion(19, true, 5149489)).a("potion.poison").a(6, 0).a(0.25D);
    public static final OPotion v = null;
    public static final OPotion w = null;
    public static final OPotion x = null;
    public static final OPotion y = null;
    public static final OPotion z = null;
    public static final OPotion A = null;
    public static final OPotion B = null;
    public static final OPotion C = null;
    public static final OPotion D = null;
    public static final OPotion E = null;
    public static final OPotion F = null;
    public static final OPotion G = null;
    public final int H;
    private String I = "";
    private int J = -1;
    private final boolean K;
    private double L;
    private boolean M;
    private final int N;

    protected OPotion(int i, boolean flag, int j) {
        super();
        this.H = i;
        a[i] = this;
        this.K = flag;
        if (flag) {
            this.L = 0.5D;
        } else {
            this.L = 1.0D;
        }

        this.N = j;
    }

    protected OPotion a(int i, int j) {
        this.J = i + j * 8;
        return this;
    }

    public int a() {
        return this.H;
    }

    public void a(OEntityLiving oentityliving, int i) {
        if (this.H == l.H) {
            if (oentityliving.aD() < oentityliving.d()) {
                oentityliving.d(1);
            }
        } else if (this.H == u.H) {
            if (oentityliving.aD() > 1) {
                // Canarymod: DAMAGE From Poison
                if (!(Boolean) etc.getLoader().callHook(PluginLoader.Hook.DAMAGE, PluginLoader.DamageType.POTION, null, oentityliving.entity, 1)) {
                    oentityliving.a(ODamageSource.m, 1);
                }
            }
        } else if (this.H == s.H && oentityliving instanceof OEntityPlayer) {
            ((OEntityPlayer) oentityliving).c(0.025F * (float) (i + 1));
        } else if ((this.H != h.H || oentityliving.aN()) && (this.H != OPotion.i.H || !oentityliving.aN())) {
            if (this.H == OPotion.i.H && !oentityliving.aN() || this.H == h.H && oentityliving.aN()) {
                // Canarymod: call to DAMAGE on 1.9?
                if (!(Boolean) etc.getLoader().callHook(PluginLoader.Hook.DAMAGE, PluginLoader.DamageType.POTION, null, oentityliving.entity, 4 << i)) {
                    oentityliving.a(ODamageSource.m, 6 << i);
                }
            }
        } else {
            oentityliving.d(6 << i);
        }

    }

    public void a(OEntityLiving oentityliving, OEntityLiving oentityliving1, int i, double d0) {
        int j;

        if ((this.H != h.H || oentityliving1.aN()) && (this.H != OPotion.i.H || !oentityliving1.aN())) {
            if (this.H == OPotion.i.H && !oentityliving1.aN() || this.H == h.H && oentityliving1.aN()) {
                j = (int) (d0 * (double) (6 << i) + 0.5D);
                if (oentityliving == null) {
                    oentityliving1.a(ODamageSource.m, j);
                } else {
                    oentityliving1.a(ODamageSource.b(oentityliving1, oentityliving), j);
                }
            }
        } else {
            j = (int) (d0 * (double) (6 << i) + 0.5D);
            oentityliving1.d(j);
        }

    }

    public boolean b() {
        return false;
    }

    public boolean b(int i, int j) {
        if (this.H != l.H && this.H != u.H) {
            return this.H == s.H;
        } else {
            int k = 25 >> j;

            return k > 0 ? i % k == 0 : true;
        }
    }

    public OPotion a(String s) {
        this.I = s;
        return this;
    }

    public String c() {
        return this.I;
    }

    protected OPotion a(double d0) {
        this.L = d0;
        return this;
    }

    public double d() {
        return this.L;
    }

    public OPotion e() {
        this.M = true;
        return this;
    }

    public boolean f() {
        return this.M;
    }

    public int g() {
        return this.N;
    }

}
