package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Ordercancelled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private String productId;
    private Integer qty;
    private String status;
    private String address;
    private String orderId;

    public Ordercancelled(Order aggregate) {
        super(aggregate);
    }

    public Ordercancelled() {
        super();
    }
}
//>>> DDD / Domain Event
