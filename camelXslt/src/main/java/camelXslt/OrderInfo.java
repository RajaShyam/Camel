package camelXslt;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/Order/")
public interface OrderInfo {

	@GET
	@Produces ("application/xml")
	@Path("{orderId}")
	public Order getOrder(@PathParam ("orderId") int officeId);
	
	
	@GET
	@Produces ("application/xml")
	@Path ("/All")
	public OrderList getAllOrders();
	
	@GET
	@Produces("application/xml")
	@Path("/navigateOrder")
	public OrderList returnOrders();
	
	@POST
	@Produces("application/xml")
	@Consumes("application/xml")
	@Path("/getOrder")
	public Order getOrderDetails(Order order);
}
