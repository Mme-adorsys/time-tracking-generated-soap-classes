/**
 * UpdateKundeRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Aktualisieren von Kunden.
 */
public class UpdateKundeRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateKundeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "UpdateKundeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kunde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kunde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KundeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Daten zur Aktualisierung des Kunden. */
    private KundeType kunde;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateKundeRequestType() {
    }


    public UpdateKundeRequestType(
            RequestHeaderType requestHeader,
            KundeType kunde) {
        this.requestHeader = requestHeader;
        this.kunde = kunde;
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
     * Gets the requestHeader value for this UpdateKundeRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this UpdateKundeRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the kunde value for this UpdateKundeRequestType.
     *
     * @return kunde   * Die Daten zur Aktualisierung des Kunden.
     */
    public KundeType getKunde() {
        return kunde;
    }

    /**
     * Sets the kunde value for this UpdateKundeRequestType.
     *
     * @param kunde   * Die Daten zur Aktualisierung des Kunden.
     */
    public void setKunde(KundeType kunde) {
        this.kunde = kunde;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateKundeRequestType)) return false;
        UpdateKundeRequestType other = (UpdateKundeRequestType) obj;
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
                ((this.kunde == null && other.getKunde() == null) ||
                        (this.kunde != null &&
                                this.kunde.equals(other.getKunde())));
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
        if (getKunde() != null) {
            _hashCode += getKunde().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
