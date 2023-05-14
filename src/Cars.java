// Klasa bazowa - jedzenie
public class Jedzenie {
    protected String nazwa;

    public Jedzenie(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void opis() {
        System.out.println("Popular cars");
    }
}

// Klasa dziedzicząca - owoce
class Porche extends Jedzenie {
    public Porche(String nazwa) {
        super(nazwa);
    }

    @Override
    public void opis() {
        System.out.println("The most popular model of Porche is Porche 911");
    }
}

// Klasa dziedzicząca - warzywa
class Warzywa extends Jedzenie {
    public Warzywa(String nazwa) {
        super(nazwa);
    }

    @Override
    public void opis() {
        System.out.println("Warzywa to jadalne części roślin, niekoniecznie słodkie.");
    }
}

// Klasa dziedzicząca - mięso
class Mięso extends Jedzenie {
    public Mięso(String nazwa) {
        super(nazwa);
    }

    @Override
    public void opis() {
        System.out.println("Mięso to tkanka mięśniowa zwierząt.");
    }
}

// Klasa dziedzicząca - fast food
class FastFood extends Jedzenie {
    public FastFood(String nazwa) {
        super(nazwa);
    }

    @Override
    public void opis() {
        System.out.println("Fast food to dania szybkiej obsługi, często o wysokiej zawartości tłuszczu i kalorii.");
    }
}
