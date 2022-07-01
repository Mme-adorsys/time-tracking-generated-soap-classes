/**
 * ReadTicketHistoryRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Lesen einer Tciket-Historie.
 */
public class ReadTicketHistoryRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTicketHistoryRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTicketHistoryRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTicketHistorySearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readTicketHistorySearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTicketHistorySearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien zur Bestimmung des Tickets. */
    private ReadTicketHistorySearchCriteriaType readTicketHistorySearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTicketHistoryRequestType() {
    }


    public ReadTicketHistoryRequestType(
            RequestHeaderType requestHeader,
            ReadTicketHistorySearchCriteriaType readTicketHistorySearchCriteria) {
        this.requestHeader = requestHeader;
        this.readTicketHistorySearchCriteria = readTicketHistorySearchCriteria;
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
     * Gets the requestHeader value for this ReadTicketHistoryRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadTicketHistoryRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readTicketHistorySearchCriteria value for this ReadTicketHistoryRequestType.
     *
     * @return readTicketHistorySearchCriteria   * Die Suchkriterien zur Bestimmung des Tickets.
     */
    public ReadTicketHistorySearchCriteriaType getReadTicketHistorySearchCriteria() {
        return readTicketHistorySearchCriteria;
    }

    /**
     * Sets the readTicketHistorySearchCriteria value for this ReadTicketHistoryRequestType.
     *
     * @param readTicketHistorySearchCriteria   * Die Suchkriterien zur Bestimmung des Tickets.
     */
    public void setReadTicketHistorySearchCriteria(ReadTicketHistorySearchCriteriaType readTicketHistorySearchCriteria) {
        this.readTicketHistorySearchCriteria = readTicketHistorySearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTicketHistoryRequestType)) return false;
        ReadTicketHistoryRequestType other = (ReadTicketHistoryRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.requestHeader == null && other.getRequestHeader() == null) ||
                        (this.requestHeader != null &&
                                this.requestHeader.equals(other.getRequestHeader()))) &&
                ((this.readTicketHistorySearchCriteria == null && other.getReadTicketHistorySearchCriteria() == null) ||
                        (this.readTicketHistorySearchCriteria != null &&
                                this.readTicketHistorySearchCriteria.equals(other.getReadTicketHistorySearchCriteria())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getReadTicketHistorySearchCriteria() != null) {
            _hashCode += getReadTicketHistorySearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
