import java.util.List;

public class OEntityMinecartHopper extends OEntityMinecartContainer implements OHopper {

    private boolean a = true;
    int b = -1; // CanaryMod: private -> package-private

    public OEntityMinecartHopper(OWorld oworld) {
        super(oworld);
    }

    public OEntityMinecartHopper(OWorld oworld, double d0, double d1, double d2) {
        super(oworld, d0, d1, d2);
    }

    public int l() {
        return 5;
    }

    public OBlock n() {
        return OBlock.cv;
    }

    public int r() {
        return 1;
    }

    public int j_() {
        return 5;
    }

    public boolean c(OEntityPlayer oentityplayer) {
        if (!this.q.I) {
            oentityplayer.a(this);
        }

        return true;
    }

    public void a(int i, int j, int k, boolean flag) {
        boolean flag1 = !flag;

        if (flag1 != this.u()) {
            this.f(flag1);
        }
    }

    public boolean u() {
        return this.a;
    }

    public void f(boolean flag) {
        this.a = flag;
    }

    public OWorld az() {
        return this.q;
    }

    public double aA() {
        return this.u;
    }

    public double aB() {
        return this.v;
    }

    public double aC() {
        return this.w;
    }

    public void l_() {
        super.l_();
        if (!this.q.I && this.T() && this.u()) {
            --this.b;
            if (!this.aE()) {
                this.l(0);
                if (this.aD()) {
                    this.l(4);
                    this.e();
                }
            }
        }
    }

    public boolean aD() {
        if (OTileEntityHopper.a((OHopper) this)) {
            return true;
        } else {
            List list = this.q.a(OEntityItem.class, this.E.b(0.25D, 0.0D, 0.25D), OIEntitySelector.a);

            if (list.size() > 0) {
                OTileEntityHopper.a((OIInventory) this, (OEntityItem) list.get(0));
            }

            return false;
        }
    }

    public void a(ODamageSource odamagesource) {
        super.a(odamagesource);
        this.a(OBlock.cv.cF, 1, 0.0F);
    }

    protected void b(ONBTTagCompound onbttagcompound) {
        super.b(onbttagcompound);
        onbttagcompound.a("TransferCooldown", this.b);
    }

    protected void a(ONBTTagCompound onbttagcompound) {
        super.a(onbttagcompound);
        this.b = onbttagcompound.e("TransferCooldown");
    }

    public void l(int i) {
        this.b = i;
    }

    public boolean aE() {
        return this.b > 0;
    }

    @Override
    public HopperMinecart getEntity() {
        // Already initialized in OEntityMinecartContainer
        return (HopperMinecart) super.getEntity();
    }
}
