package dev.practice.theredmsagift.infrastructure.gift;

import org.springframework.stereotype.Component;

import dev.practice.theredmsagift.common.exception.InvalidParamException;
import dev.practice.theredmsagift.domain.gift.Gift;
import dev.practice.theredmsagift.domain.gift.GiftStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class GiftStoreImpl implements GiftStore {
    private final GiftRepository giftRepository;

    @Override
    public Gift store(Gift gift) {
        if (gift == null) throw new InvalidParamException();
        return giftRepository.save(gift);
    }
}
