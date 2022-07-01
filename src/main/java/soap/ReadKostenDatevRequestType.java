/**
 * ReadKostenDatevRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Lesen des Kostenexports im DATEV Format.
 */
public class ReadKostenDatevRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadKostenDatevRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKostenDatevRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readKostenSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readKostenSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKostenSearchCriteriaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien für die Suche nach Buchungen im DATEV Format. */
    private ReadKostenSearchCriteriaType readKostenSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadKostenDatevRequestType() {
    }


    public ReadKostenDatevRequestType(
            RequestHeaderType requestHeader,
            ReadKostenSearchCriteriaType readKostenSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readKostenSearchCriteria = readKostenSearchCriteria;
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
     * Gets the requestHeader value for this ReadKostenDatevRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadKostenDatevRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readKostenSearchCriteria value for this ReadKostenDatevRequestType.
     *
     * @return readKostenSearchCriteria   * Die Suchkriterien für die Suche nach Buchungen im DATEV Format.
     */
    public ReadKostenSearchCriteriaType getReadKostenSearchCriteria() {
        return readKostenSearchCriteria;
    }

    /**
     * Sets the readKostenSearchCriteria value for this ReadKostenDatevRequestType.
     *
     * @param readKostenSearchCriteria   * Die Suchkriterien für die Suche nach Buchungen im DATEV Format.
     */
    public void setReadKostenSearchCriteria(ReadKostenSearchCriteriaType readKostenSearchCriteria) {
        this.readKostenSearchCriteria = readKostenSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadKostenDatevRequestType)) return false;
        ReadKostenDatevRequestType other = (ReadKostenDatevRequestType) obj;
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
                ((this.readKostenSearchCriteria == null && other.getReadKostenSearchCriteria() == null) ||
                        (this.readKostenSearchCriteria != null &&
                                this.readKostenSearchCriteria.equals(other.getReadKostenSearchCriteria())));
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
        if (getReadKostenSearchCriteria() != null) {
            _hashCode += getReadKostenSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
