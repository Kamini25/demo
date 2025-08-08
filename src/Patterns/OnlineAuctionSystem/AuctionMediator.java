public interface AuctionMediator {
    void addBidder(Colleague bidder);
    void NotifyColleagues(Colleague bidder, int amount); 
    Colleague determineWinner();
}