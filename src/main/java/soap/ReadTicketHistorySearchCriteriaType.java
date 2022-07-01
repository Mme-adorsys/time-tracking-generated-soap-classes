/**
 * ReadTicketHistorySearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zum Lesen der Ticket-Historie.
 */
public class ReadTicketHistorySearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTicketHistorySearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTicketHistorySearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Nummer des gesuchten Tickets. */
    private int ticketNr;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public ReadTicketHistorySearchCriteriaType() {
    }

    public ReadTicketHistorySearchCriteriaType(
            int ticketNr) {
        this.ticketNr = ticketNr;
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the ticketNr value for this ReadTicketHistorySearchCriteriaType.
     *
     * @return ticketNr   * Die Nummer des gesuchten Tickets.
     */
    public int getTicketNr() {
        return ticketNr;
    }

    /**
     * Sets the ticketNr value for this ReadTicketHistorySearchCriteriaType.
     *
     * @param ticketNr   * Die Nummer des gesuchten Tickets.
     */
    public void setTicketNr(int ticketNr) {
        this.ticketNr = ticketNr;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTicketHistorySearchCriteriaType)) return false;
        ReadTicketHistorySearchCriteriaType other = (ReadTicketHistorySearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.ticketNr == other.getTicketNr();
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getTicketNr();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
