class SpaceAge {

    double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    public double getSeconds() {
        return seconds;
    }

    double onEarth() {

        double age = (seconds / 31557600);
        return age;
    }

    double onMercury() {
        double age = (seconds / 31557600);
        return (age/0.2408467);
    }

    double onVenus() {
        double age = (seconds / 31557600);
        return (age/0.61519726);
    }

    double onMars() {
        double age = (seconds / 31557600);
        return (age/1.8808158);
    }

    double onJupiter() {
        double age = (seconds / 31557600);
        return (age/11.862615);
    }

    double onSaturn() {
        double age = (seconds / 31557600);
        return (age/29.447498);
    }

    double onUranus() {
        double age = (seconds / 31557600);
        return (age/84.016846);
    }

    double onNeptune() {
        double age = (seconds / 31557600);
        return (age/164.79132);
    }

}
