/**
 * ReadTicketStatusRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Request-Struktur zur Abfrage einer Ticket-Status Definition aus
 * den Stammdaten.
 */
public class ReadTicketStatusRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTicketStatusRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTicketStatusRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readticketStatusSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readticketStatusSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadticketStatusSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien zur Abfrage eines Ticket-Status. */
    private ReadticketStatusSearchCriteriaType readticketStatusSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTicketStatusRequestType() {
    }


    public ReadTicketStatusRequestType(
            RequestHeaderType requestHeader,
            ReadticketStatusSearchCriteriaType readticketStatusSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readticketStatusSearchCriteria = readticketStatusSearchCriteria;
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
     * Gets the requestHeader value for this ReadTicketStatusRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadTicketStatusRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readticketStatusSearchCriteria value for this ReadTicketStatusRequestType.
     *
     * @return readticketStatusSearchCriteria   * Die Suchkriterien zur Abfrage eines Ticket-Status.
     */
    public ReadticketStatusSearchCriteriaType getReadticketStatusSearchCriteria() {
        return readticketStatusSearchCriteria;
    }

    /**
     * Sets the readticketStatusSearchCriteria value for this ReadTicketStatusRequestType.
     *
     * @param readticketStatusSearchCriteria   * Die Suchkriterien zur Abfrage eines Ticket-Status.
     */
    public void setReadticketStatusSearchCriteria(ReadticketStatusSearchCriteriaType readticketStatusSearchCriteria) {
        this.readticketStatusSearchCriteria = readticketStatusSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTicketStatusRequestType)) return false;
        ReadTicketStatusRequestType other = (ReadTicketStatusRequestType) obj;
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
                ((this.readticketStatusSearchCriteria == null && other.getReadticketStatusSearchCriteria() == null) ||
                        (this.readticketStatusSearchCriteria != null &&
                                this.readticketStatusSearchCriteria.equals(other.getReadticketStatusSearchCriteria())));
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
        if (getReadticketStatusSearchCriteria() != null) {
            _hashCode += getReadticketStatusSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
