package co.istad.chhaya.ecommerce.features.order;

import co.istad.chhaya.ecommerce.features.order.dto.CreateOrderRequest;
import co.istad.chhaya.ecommerce.features.order.dto.OrderResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public OrderResponse createNew(@Valid @RequestBody CreateOrderRequest createOrderRequest) {
        return orderService.createNew(createOrderRequest);
    }

}
