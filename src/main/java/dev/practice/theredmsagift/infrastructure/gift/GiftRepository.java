package dev.practice.theredmsagift.infrastructure.gift;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.practice.theredmsagift.domain.gift.Gift;

public interface GiftRepository extends JpaRepository<Gift, Long> {
    Optional<Gift> findByGiftToken(String giftToken);
    Optional<Gift> findByOrderToken(String orderToken);
}
