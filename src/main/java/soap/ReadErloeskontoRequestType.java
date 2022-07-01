/**
 * ReadErloeskontoRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Lesen von Erlöskonten.
 */
public class ReadErloeskontoRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadErloeskontoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadErloeskontoRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readErloeskontoSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readErloeskontoSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadErloeskontoSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien für die Suche nach Erlöskonten. */
    private ReadErloeskontoSearchCriteriaType readErloeskontoSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadErloeskontoRequestType() {
    }


    public ReadErloeskontoRequestType(
            RequestHeaderType requestHeader,
            ReadErloeskontoSearchCriteriaType readErloeskontoSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readErloeskontoSearchCriteria = readErloeskontoSearchCriteria;
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
     * Gets the requestHeader value for this ReadErloeskontoRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadErloeskontoRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readErloeskontoSearchCriteria value for this ReadErloeskontoRequestType.
     *
     * @return readErloeskontoSearchCriteria   * Die Suchkriterien für die Suche nach Erlöskonten.
     */
    public ReadErloeskontoSearchCriteriaType getReadErloeskontoSearchCriteria() {
        return readErloeskontoSearchCriteria;
    }

    /**
     * Sets the readErloeskontoSearchCriteria value for this ReadErloeskontoRequestType.
     *
     * @param readErloeskontoSearchCriteria   * Die Suchkriterien für die Suche nach Erlöskonten.
     */
    public void setReadErloeskontoSearchCriteria(ReadErloeskontoSearchCriteriaType readErloeskontoSearchCriteria) {
        this.readErloeskontoSearchCriteria = readErloeskontoSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadErloeskontoRequestType)) return false;
        ReadErloeskontoRequestType other = (ReadErloeskontoRequestType) obj;
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
                ((this.readErloeskontoSearchCriteria == null && other.getReadErloeskontoSearchCriteria() == null) ||
                        (this.readErloeskontoSearchCriteria != null &&
                                this.readErloeskontoSearchCriteria.equals(other.getReadErloeskontoSearchCriteria())));
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
        if (getReadErloeskontoSearchCriteria() != null) {
            _hashCode += getReadErloeskontoSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
