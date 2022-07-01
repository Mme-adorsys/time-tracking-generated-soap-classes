/**
 * ReadMahlzeitRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Paramater zum Lesen von Mahlzeiten.
 */
public class ReadMahlzeitRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadMahlzeitRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadMahlzeitRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readMahlzeitSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readMahlzeitSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadMahlzeitSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    private ReadMahlzeitSearchCriteriaType readMahlzeitSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadMahlzeitRequestType() {
    }


    public ReadMahlzeitRequestType(
            RequestHeaderType requestHeader,
            ReadMahlzeitSearchCriteriaType readMahlzeitSearchCriteria) {
        this.requestHeader = requestHeader;
        this.readMahlzeitSearchCriteria = readMahlzeitSearchCriteria;
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
     * Gets the requestHeader value for this ReadMahlzeitRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadMahlzeitRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the readMahlzeitSearchCriteria value for this ReadMahlzeitRequestType.
     *
     * @return readMahlzeitSearchCriteria
     */
    public ReadMahlzeitSearchCriteriaType getReadMahlzeitSearchCriteria() {
        return readMahlzeitSearchCriteria;
    }

    /**
     * Sets the readMahlzeitSearchCriteria value for this ReadMahlzeitRequestType.
     *
     * @param readMahlzeitSearchCriteria
     */
    public void setReadMahlzeitSearchCriteria(ReadMahlzeitSearchCriteriaType readMahlzeitSearchCriteria) {
        this.readMahlzeitSearchCriteria = readMahlzeitSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadMahlzeitRequestType)) return false;
        ReadMahlzeitRequestType other = (ReadMahlzeitRequestType) obj;
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
                ((this.readMahlzeitSearchCriteria == null && other.getReadMahlzeitSearchCriteria() == null) ||
                        (this.readMahlzeitSearchCriteria != null &&
                                this.readMahlzeitSearchCriteria.equals(other.getReadMahlzeitSearchCriteria())));
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
        if (getReadMahlzeitSearchCriteria() != null) {
            _hashCode += getReadMahlzeitSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
