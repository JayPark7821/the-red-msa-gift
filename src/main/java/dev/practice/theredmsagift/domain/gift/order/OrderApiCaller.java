package dev.practice.theredmsagift.domain.gift.order;

import dev.practice.theredmsagift.domain.gift.GiftCommand;

public interface OrderApiCaller {
    String registerGiftOrder(OrderApiCommand.Register request);

    void updateReceiverInfo(String orderToken, GiftCommand.Accept request);
}
