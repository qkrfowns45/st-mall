package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private Long oderId;
    private String productName;
    private String productId;
    private String qty;
    private String address;
    private String status;

    public DeliveryReturned(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryReturned() {
        super();
    }
}
//>>> DDD / Domain Event
