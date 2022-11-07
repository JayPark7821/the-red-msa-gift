package dev.practice.theredmsagift.interfaces.api;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import dev.practice.theredmsagift.domain.gift.GiftCommand;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface GiftDtoMapper {

    GiftCommand.Register of(GiftDto.RegisterReq request);

    GiftCommand.RegisterOrderItem of(GiftDto.RegisterOrderItemReq request);

    GiftCommand.RegisterOrderItemOptionGroup of(GiftDto.RegisterOrderItemOptionGroupReq request);

    GiftCommand.RegisterOrderItemOption of(GiftDto.RegisterOrderItemOptionReq request);

    GiftCommand.Accept of(String giftToken, GiftDto.AcceptGiftReq request);
}
