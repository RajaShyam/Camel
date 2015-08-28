# Camel
Camel Samples

sample xml input:
=================
<OrderDetails>
<cName>Sandeep</cName>
<iName>Soap</iName>
<oId>1</oId>
<quantity>120</quantity>
<shippingAddressLocation>Gurgaon</shippingAddressLocation>
</OrderDetails>

Add the headers content-Type:application/xml and Accept:application/xml

Observe the input xml and output xml which are both  different format

Output Xml:
===========
<Order>
  <customerName>Sandeep</customerName>
  <itemName>Soap</itemName>
  <orderId>1</orderId>
  <quantity>500</quantity>
  <shippingAddress>Gurgaon</shippingAddress>
</Order>
