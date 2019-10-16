package DomainModel;

public interface transport {
    void movingType();

    void movingSound();

    void movingForce();
}
// 1 интерфейс

abstract class Cars implements transport {
    // 1ый абстрактный
    @Override
    public void movingType() {
        System.out.println("Riding");
    }

    @Override
    public abstract void movingSound();

    @Override
    public abstract void movingForce();
}

abstract class ElectricCar extends Cars {
    // 1ый дочерний
    //2ой абстрактный
    @Override
    public abstract void movingSound();

    @Override
    public void movingForce() {
        System.out.println("ElectricMotor");
    }

    class Tesla extends ElectricCar {
        // Вложенный
        // 2ой дочерний
        @Override
        public void movingSound() {
            System.out.println("Wzzou-wzzzou");
        }
    }

    class Prius extends ElectricCar {
        // 3ий дочерний
        @Override
        public void movingSound() {
            System.out.println("Bzz-bzz");
        }
    }

    class YoMobile extends ElectricCar {
        //4ый дочерний
        @Override
        public void movingSound() {
            System.out.println("[звуки страдания]");
        }
    }
}

class Batmobile extends Cars {
    //5ый дочерний
    @Override
    public void movingSound() {
        System.out.println("WHEREoooom-DETONATORoooom");
    }

    @Override
    public void movingForce() {
        System.out.println("RAGE");
    }
}

abstract class Ships implements transport {
    // 3ий абстрактный
    //6ой дочерний
    @Override
    public void movingType() {
        System.out.println("Swimming");
    }

    abstract public void movingSound();

    abstract public void movingForce();
}

class Submarine extends Ships {
    //7ой дочерний
    @Override
    public void movingSound() {
        System.out.println("буль-буль");
    }

    @Override
    public void movingForce() {
        System.out.println("PeacefullAtom");
    }
}

class Kayak extends Ships {
    //8ой дочерний
    @Override
    public void movingSound() {
        System.out.println("Grebi!");
    }

    @Override
    public void movingForce() {
        System.out.println("Paddle");
    }
}

class Сlipper extends Ships {
    // 9ый дочерний
    @Override
    public void movingSound() {
        System.out.println("Wzhukh!");
    }

    @Override
    public void movingForce() {
        System.out.println("Wind");
    }
}


//Реализовать доменную модель для средств передвижения.
// Должен быть минимум 1 интерфейс,
// 3 абстрактных класса и
// 9 дочерних классов.
// При разработке нужно использовать хотя бы 1 вложенный или внутренний класс