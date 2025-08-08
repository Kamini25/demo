public class Bidder  implements Colleague {
    String name;
    AuctionMediator mediator;
    Bidder(){}
    Bidder(String name, AuctionMediator mediator){
        this.name = name;
        this.mediator = mediator;
        mediator.addBidder(this);
    }
    public void placeBid(int amount){
        System.out.println("Bidder " + name + " placed a bid of " + amount);
        mediator.NotifyColleagues(this, amount);
    }
    public void notifyBid(int amount){
        System.out.println("To notify bidder " + this.name + " for the bid amount " + amount);
    }
    public String getName() {
        return name;
    }
    
}

