package com.javasolutions.lowleveldesign.behavioralpatterns.mediator;

// Mediator Interface
public interface AuctionMediator {
    void registerBidder(IColleague bidder);

    void placeBid(IColleague bidder, double bidAmount);

    void closeAuction();
}