public class OEntityLargeFireball extends OEntityFireball {

    public int e = 1;

    public OEntityLargeFireball(OWorld oworld) {
        super(oworld);
    }

    public OEntityLargeFireball(OWorld oworld, OEntityLivingBase oentitylivingbase, double d0, double d1, double d2) {
        super(oworld, oentitylivingbase, d0, d1, d2);
    }

    protected void a(OMovingObjectPosition omovingobjectposition) {
        if (!(Boolean) etc.getLoader().callHook(PluginLoader.Hook.PROJECTILE_HIT, this.getEntity(), omovingobjectposition.g == null ? null : omovingobjectposition.g.getEntity()) && !this.q.I) {
            if (omovingobjectposition.g != null) {
                omovingobjectposition.g.a(ODamageSource.a((OEntityFireball) this, this.a), 6.0F);
            }

            this.q.a((OEntity) null, this.u, this.v, this.w, (float) this.e, true, this.q.O().b("mobGriefing"));
            this.x();
        }
    }

    public void b(ONBTTagCompound onbttagcompound) {
        super.b(onbttagcompound);
        onbttagcompound.a("ExplosionPower", this.e);
    }

    public void a(ONBTTagCompound onbttagcompound) {
        super.a(onbttagcompound);
        if (onbttagcompound.b("ExplosionPower")) {
            this.e = onbttagcompound.e("ExplosionPower");
        }
    }
}
