package jace.shim.springcamp2017.order.infra;

import jace.shim.springcamp2017.core.event.AbstractEventHandler;
import jace.shim.springcamp2017.core.event.EventStore;
import jace.shim.springcamp2017.core.snapshot.SnapshotRepository;
import jace.shim.springcamp2017.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jaceshim on 2017. 3. 14..
 */
@Component
public class OrderEventHandler extends AbstractEventHandler<Product, Long> {

	@Autowired
	public OrderEventHandler(EventStore eventStore,
		SnapshotRepository snapshotRepository) {
		super(eventStore, snapshotRepository);
	}
}
