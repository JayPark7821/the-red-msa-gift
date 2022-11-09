package dev.practice.theredmsagift.domain.gift;

public interface GiftReader {
    Gift getGiftBy(String giftToken);

    Gift getGiftByOrderToken(String orderToken);
}
