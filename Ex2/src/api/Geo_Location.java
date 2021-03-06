package api;

public class Geo_Location implements GeoLocation {
    double x, y, z;

    public Geo_Location()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Geo_Location(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Geo_Location(Geo_Location other)
    {
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
    }

    @Override
    public double x() {
        return this.x;
    }

    @Override
    public double y() {
        return this.y;
    }

    @Override
    public double z() {
        return this.z;
    }

    @Override
    public double distance(GeoLocation g) {
        double dx = this.x - g.x();
        double dy = this.y - g.y();
        double dz = this.z - g.z();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2) + Math.pow(dz, 2));
    }
}

