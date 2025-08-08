import java.util.ArrayList;
import java.util.List;

public class AuctionConcrete implements AuctionMediator {
List<Colleague> colleagues;
Colleague winner;
public AuctionConcrete(){
    colleagues = new ArrayList<>();
  //  winner = new Bidder();
}
public void addBidder(Colleague bidder){
    colleagues.add(bidder);
}
public void NotifyColleagues(Colleague colleague, int amount){
    winner = colleague;
    for(Colleague bidder: colleagues){
        if(!bidder.equals(colleague)){
            bidder.notifyBid(amount);
        }
    }
}
public Colleague determineWinner(){
    System.out.println(winner.getName());
    return winner;
}
    
}
