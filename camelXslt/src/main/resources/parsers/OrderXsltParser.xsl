<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<Order>
				<customerName>
					<xsl:value-of select="OrderDetails/cName"></xsl:value-of>
				</customerName>
				<itemName>
					<xsl:value-of select="OrderDetails/iName"></xsl:value-of>
				</itemName>
				<orderId>
					<xsl:value-of select="OrderDetails/oId"></xsl:value-of>
				</orderId>
				<quantity>
					<xsl:value-of select="OrderDetails/quantity"></xsl:value-of>
				</quantity>
				<shippingAddress>
					<xsl:value-of select="OrderDetails/shippingAddressLocation"></xsl:value-of>
				</shippingAddress>
		</Order>
	</xsl:template>
</xsl:stylesheet>