/**
 * ReadZahlungsartRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadZahlungsartRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadZahlungsartRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadZahlungsartRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readZahlungsartSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readZahlungsartSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadZahlungsartSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien zur Suche nach Zahlungsarten. */
    private ReadZahlungsartSearchCriteriaType readZahlungsartSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadZahlungsartRequestType() {
    }


    public ReadZahlungsartRequestType(
            RequestHeaderType requestHeader,
            ReadZahlungsartSearchCriteriaType readZahlungsartSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readZahlungsartSearchCriteria = readZahlungsartSearchCriteria;
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
     * Gets the requestHeader value for this ReadZahlungsartRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadZahlungsartRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readZahlungsartSearchCriteria value for this ReadZahlungsartRequestType.
     *
     * @return readZahlungsartSearchCriteria   * Die Suchkriterien zur Suche nach Zahlungsarten.
     */
    public ReadZahlungsartSearchCriteriaType getReadZahlungsartSearchCriteria() {
        return readZahlungsartSearchCriteria;
    }

    /**
     * Sets the readZahlungsartSearchCriteria value for this ReadZahlungsartRequestType.
     *
     * @param readZahlungsartSearchCriteria   * Die Suchkriterien zur Suche nach Zahlungsarten.
     */
    public void setReadZahlungsartSearchCriteria(ReadZahlungsartSearchCriteriaType readZahlungsartSearchCriteria) {
        this.readZahlungsartSearchCriteria = readZahlungsartSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadZahlungsartRequestType)) return false;
        ReadZahlungsartRequestType other = (ReadZahlungsartRequestType) obj;
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
                ((this.readZahlungsartSearchCriteria == null && other.getReadZahlungsartSearchCriteria() == null) ||
                        (this.readZahlungsartSearchCriteria != null &&
                                this.readZahlungsartSearchCriteria.equals(other.getReadZahlungsartSearchCriteria())));
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
        if (getReadZahlungsartSearchCriteria() != null) {
            _hashCode += getReadZahlungsartSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
