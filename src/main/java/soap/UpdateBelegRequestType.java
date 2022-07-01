/**
 * UpdateBelegRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zur Aktualisierung eines Beleges.
 */
public class UpdateBelegRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateBelegRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "UpdateBelegRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Daten des zu aktualisierenden Beleges. */
    private BelegType beleg;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateBelegRequestType() {
    }


    public UpdateBelegRequestType(
            RequestHeaderType requestHeader,
            BelegType beleg) {
        this.requestHeader = requestHeader;
        this.beleg = beleg;
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
     * Gets the requestHeader value for this UpdateBelegRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this UpdateBelegRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the beleg value for this UpdateBelegRequestType.
     *
     * @return beleg   * Die Daten des zu aktualisierenden Beleges.
     */
    public BelegType getBeleg() {
        return beleg;
    }

    /**
     * Sets the beleg value for this UpdateBelegRequestType.
     *
     * @param beleg   * Die Daten des zu aktualisierenden Beleges.
     */
    public void setBeleg(BelegType beleg) {
        this.beleg = beleg;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateBelegRequestType)) return false;
        UpdateBelegRequestType other = (UpdateBelegRequestType) obj;
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
                ((this.beleg == null && other.getBeleg() == null) ||
                        (this.beleg != null &&
                                this.beleg.equals(other.getBeleg())));
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
        if (getBeleg() != null) {
            _hashCode += getBeleg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
