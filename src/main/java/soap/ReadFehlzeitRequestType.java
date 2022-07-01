/**
 * ReadFehlzeitRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zur Abfrage von Fehlzeiten.
 */
public class ReadFehlzeitRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadFehlzeitRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFehlzeitRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readFehlzeitSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readFehlzeitSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFehlzeitSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien zur Suche nach Fehlzeiten */
    private ReadFehlzeitSearchCriteriaType readFehlzeitSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadFehlzeitRequestType() {
    }


    public ReadFehlzeitRequestType(
            RequestHeaderType requestHeader,
            ReadFehlzeitSearchCriteriaType readFehlzeitSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readFehlzeitSearchCriteria = readFehlzeitSearchCriteria;
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
     * Gets the requestHeader value for this ReadFehlzeitRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadFehlzeitRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readFehlzeitSearchCriteria value for this ReadFehlzeitRequestType.
     *
     * @return readFehlzeitSearchCriteria   * Die Suchkriterien zur Suche nach Fehlzeiten
     */
    public ReadFehlzeitSearchCriteriaType getReadFehlzeitSearchCriteria() {
        return readFehlzeitSearchCriteria;
    }

    /**
     * Sets the readFehlzeitSearchCriteria value for this ReadFehlzeitRequestType.
     *
     * @param readFehlzeitSearchCriteria   * Die Suchkriterien zur Suche nach Fehlzeiten
     */
    public void setReadFehlzeitSearchCriteria(ReadFehlzeitSearchCriteriaType readFehlzeitSearchCriteria) {
        this.readFehlzeitSearchCriteria = readFehlzeitSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadFehlzeitRequestType)) return false;
        ReadFehlzeitRequestType other = (ReadFehlzeitRequestType) obj;
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
                ((this.readFehlzeitSearchCriteria == null && other.getReadFehlzeitSearchCriteria() == null) ||
                        (this.readFehlzeitSearchCriteria != null &&
                                this.readFehlzeitSearchCriteria.equals(other.getReadFehlzeitSearchCriteria())));
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
        if (getReadFehlzeitSearchCriteria() != null) {
            _hashCode += getReadFehlzeitSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
