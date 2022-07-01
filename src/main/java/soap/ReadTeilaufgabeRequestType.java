/**
 * ReadTeilaufgabeRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Lesen von Teilaufgaben.
 */
public class ReadTeilaufgabeRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTeilaufgabeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTeilaufgabeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTeilaufgabeSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readTeilaufgabeSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTeilaufgabeSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Suchkriterien zum Lesen von Teilaufgaben. */
    private ReadTeilaufgabeSearchCriteriaType readTeilaufgabeSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTeilaufgabeRequestType() {
    }


    public ReadTeilaufgabeRequestType(
            RequestHeaderType requestHeader,
            ReadTeilaufgabeSearchCriteriaType readTeilaufgabeSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readTeilaufgabeSearchCriteria = readTeilaufgabeSearchCriteria;
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
     * Gets the requestHeader value for this ReadTeilaufgabeRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadTeilaufgabeRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readTeilaufgabeSearchCriteria value for this ReadTeilaufgabeRequestType.
     *
     * @return readTeilaufgabeSearchCriteria   * Die Suchkriterien zum Lesen von Teilaufgaben.
     */
    public ReadTeilaufgabeSearchCriteriaType getReadTeilaufgabeSearchCriteria() {
        return readTeilaufgabeSearchCriteria;
    }

    /**
     * Sets the readTeilaufgabeSearchCriteria value for this ReadTeilaufgabeRequestType.
     *
     * @param readTeilaufgabeSearchCriteria   * Die Suchkriterien zum Lesen von Teilaufgaben.
     */
    public void setReadTeilaufgabeSearchCriteria(ReadTeilaufgabeSearchCriteriaType readTeilaufgabeSearchCriteria) {
        this.readTeilaufgabeSearchCriteria = readTeilaufgabeSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTeilaufgabeRequestType)) return false;
        ReadTeilaufgabeRequestType other = (ReadTeilaufgabeRequestType) obj;
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
                ((this.readTeilaufgabeSearchCriteria == null && other.getReadTeilaufgabeSearchCriteria() == null) ||
                        (this.readTeilaufgabeSearchCriteria != null &&
                                this.readTeilaufgabeSearchCriteria.equals(other.getReadTeilaufgabeSearchCriteria())));
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
        if (getReadTeilaufgabeSearchCriteria() != null) {
            _hashCode += getReadTeilaufgabeSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
