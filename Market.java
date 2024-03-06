public class Market implements MarketBehaviour,QueueBehaviour,Update {
    private int orders;
    private int queue;

    public Market(int orders, int queue){
        this.orders = orders;
        this.queue = queue;
    }
    

    @Override
    public void showQueue(){
        System.out.println("Очередь состоит из "+queue+" человек.");
    }
    @Override
    public void addPerson(){
        System.out.println("Человек добавился в очередь, теперь кол-во людей в очереди: "+ (++queue));
    }
    @Override
    public void deletePerson(){
        System.out.println("Очередь сократилась, кол-во людей в очереди: "+(--queue ));
    }
    @Override
    public void giveOrder(){
        System.out.println("Заказ отдан, осталось заказов: "+(--orders));
    }
    @Override
    public void newOrder(){
        System.out.println("Поступил заказ, осталось заказов: "+(++orders));
    }
    @Override
    public void getStatus(){
        System.out.println("Магазин. Заказов:"+ orders + " Очередь: " + queue);
}
}