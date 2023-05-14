
public class Cars {
    protected String model;

    public Cars(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void description() {
        System.out.println("Popular cars");
    }
}

class Porche extends Cars {
    public Porche(String model) {
        super(model);
    }

    @Override
    public void description() {
        System.out.println("The most popular model of Porche's cars is Porche 911");
    }
}


class Mercedes extends Cars {
    public Mercedes(String model) {
        super(model);
    }

    @Override
    public void description() {
        System.out.println("The most popular model of Mercede's cars is Mercedes class A ");
    }
}


class Toyota extends Cars {
    public Toyota(String model) {
        super(model);
    }

    @Override
    public void description() {
        System.out.println("The most popular model of Toyota's cars is Toyota Corolla");
    }
}


class Ford extends Cars {
    public Ford(String model) {
        super(model);
    }

    @Override
    public void description() {
        System.out.println("The most popular model of Ford's cars is Ford Mustang");
    }
}
