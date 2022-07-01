/**
 * UpdateFehlzeitRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Der Daten zur Aktualisierung einer Fehlzeit.
 */
public class UpdateFehlzeitRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateFehlzeitRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "UpdateFehlzeitRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fehlzeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fehlzeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FehlzeitType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die zu aktualisierende Fehlzeit. */
    private FehlzeitType fehlzeit;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateFehlzeitRequestType() {
    }


    public UpdateFehlzeitRequestType(
            RequestHeaderType requestHeader,
            FehlzeitType fehlzeit) {
        this.requestHeader = requestHeader;
        this.fehlzeit = fehlzeit;
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
     * Gets the requestHeader value for this UpdateFehlzeitRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this UpdateFehlzeitRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the fehlzeit value for this UpdateFehlzeitRequestType.
     *
     * @return fehlzeit   * Die zu aktualisierende Fehlzeit.
     */
    public FehlzeitType getFehlzeit() {
        return fehlzeit;
    }

    /**
     * Sets the fehlzeit value for this UpdateFehlzeitRequestType.
     *
     * @param fehlzeit   * Die zu aktualisierende Fehlzeit.
     */
    public void setFehlzeit(FehlzeitType fehlzeit) {
        this.fehlzeit = fehlzeit;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateFehlzeitRequestType)) return false;
        UpdateFehlzeitRequestType other = (UpdateFehlzeitRequestType) obj;
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
                ((this.fehlzeit == null && other.getFehlzeit() == null) ||
                        (this.fehlzeit != null &&
                                this.fehlzeit.equals(other.getFehlzeit())));
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
        if (getFehlzeit() != null) {
            _hashCode += getFehlzeit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
