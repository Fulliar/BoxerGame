public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    int start;

    public Fighter(String name, int damage, int health, int weight, double dodge, int start) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.start = start;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }

    public boolean isStart(){
        int randomStart = (int) (Math.random() * 2);
        return randomStart <= this.start;

    }

}
