package dev.practice.theredmsagift.infrastructure.gift;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import dev.practice.theredmsagift.common.exception.EntityNotFoundException;
import dev.practice.theredmsagift.common.exception.InvalidParamException;
import dev.practice.theredmsagift.domain.gift.Gift;
import dev.practice.theredmsagift.domain.gift.GiftReader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class GiftReaderImpl implements GiftReader {
    private final GiftRepository giftRepository;

    @Override
    public Gift getGiftBy(String giftToken) {
        if (StringUtils.isEmpty(giftToken)) throw new InvalidParamException();
        return giftRepository.findByGiftToken(giftToken).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Gift getGiftByOrderToken(String orderToken) {
        if (StringUtils.isEmpty(orderToken)) throw new InvalidParamException();
        return giftRepository.findByOrderToken(orderToken).orElseThrow(EntityNotFoundException::new);
    }
}
