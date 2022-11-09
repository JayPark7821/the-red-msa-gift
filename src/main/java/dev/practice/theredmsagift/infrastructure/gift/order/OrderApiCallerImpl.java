package dev.practice.theredmsagift.infrastructure.gift.order;

import org.springframework.stereotype.Component;

import dev.practice.theredmsagift.common.response.CommonResponse;
import dev.practice.theredmsagift.domain.gift.GiftCommand;
import dev.practice.theredmsagift.domain.gift.order.OrderApiCaller;
import dev.practice.theredmsagift.domain.gift.order.OrderApiCommand;
import dev.practice.theredmsagift.infrastructure.retrofit.RetrofitUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderApiCallerImpl implements OrderApiCaller {
    private final RetrofitUtils retrofitUtils;
    private final RetrofitOrderApi retrofitOrderApi;

    @Override
    public String registerGiftOrder(OrderApiCommand.Register request) {
        var call = retrofitOrderApi.registerOrder(request);
        return retrofitUtils.responseSync(call)
                .map(CommonResponse::getData)
                .map(RetrofitOrderApiResponse.Register::getOrderToken)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public void updateReceiverInfo(String orderToken, GiftCommand.Accept request) {
        var call = retrofitOrderApi.updateReceiverInfo(orderToken, request);
        retrofitUtils.responseVoid(call);
    }
}
