public class Main {
    public static void main(String[] args) {
        AuctionMediator phoneAuction = new AuctionConcrete();
        Colleague bidder1 = new Bidder("abc",   phoneAuction);
        Colleague bidder2 = new Bidder("xyz", phoneAuction);
        Colleague bidder3 = new Bidder("mno", phoneAuction);
        bidder1.placeBid(1000);
        bidder2.placeBid(2000);
        bidder1.placeBid(2009);
        phoneAuction.determineWinner();

            
        
    }
}
