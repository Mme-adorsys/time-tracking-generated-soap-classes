/**
 * ReadRechnungRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Der Request zum Lesen von Rechnungen.
 */
public class ReadRechnungRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readRechnungSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readRechnungSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungSearchCriteriaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private RequestHeaderType requestHeader;
    /* Die Kriterien zur Suche von Rechnungen. */
    private RechnungSearchCriteriaType readRechnungSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungRequestType() {
    }


    public ReadRechnungRequestType(
            RequestHeaderType requestHeader,
            RechnungSearchCriteriaType readRechnungSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readRechnungSearchCriteria = readRechnungSearchCriteria;
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
     * Gets the requestHeader value for this ReadRechnungRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Response-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadRechnungRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readRechnungSearchCriteria value for this ReadRechnungRequestType.
     *
     * @return readRechnungSearchCriteria   * Die Kriterien zur Suche von Rechnungen.
     */
    public RechnungSearchCriteriaType getReadRechnungSearchCriteria() {
        return readRechnungSearchCriteria;
    }

    /**
     * Sets the readRechnungSearchCriteria value for this ReadRechnungRequestType.
     *
     * @param readRechnungSearchCriteria   * Die Kriterien zur Suche von Rechnungen.
     */
    public void setReadRechnungSearchCriteria(RechnungSearchCriteriaType readRechnungSearchCriteria) {
        this.readRechnungSearchCriteria = readRechnungSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungRequestType)) return false;
        ReadRechnungRequestType other = (ReadRechnungRequestType) obj;
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
                ((this.readRechnungSearchCriteria == null && other.getReadRechnungSearchCriteria() == null) ||
                        (this.readRechnungSearchCriteria != null &&
                                this.readRechnungSearchCriteria.equals(other.getReadRechnungSearchCriteria())));
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
        if (getReadRechnungSearchCriteria() != null) {
            _hashCode += getReadRechnungSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
