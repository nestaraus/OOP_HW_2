public class Main {
    public static void main(String[] args) {
        Market market = new Market(9, 12);

        market.getStatus();
        market.showQueue();
        market.deletePerson();
        market.deletePerson();
        market.showQueue();
        market.giveOrder();
        market.giveOrder();
        market.addPerson();
        market.newOrder();
        market.getStatus();
    }
}
