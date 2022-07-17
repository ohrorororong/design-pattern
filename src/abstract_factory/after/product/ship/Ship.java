package abstract_factory.after.product.ship;

import abstract_factory.after.product.engine.Engine;
import abstract_factory.after.product.handle.Handle;

public abstract class Ship {

    private String name;
    private String color;
    private String logo;
    private Engine engine;
    private Handle handle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }


}
