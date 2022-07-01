/**
 * UpdateEinplanungRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zur Aktualisierung einer Einplanung.
 */
public class UpdateEinplanungRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateEinplanungRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "UpdateEinplanungRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("einplanung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "einplanung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "EinplanungType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    private EinplanungType einplanung;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateEinplanungRequestType() {
    }


    public UpdateEinplanungRequestType(
            RequestHeaderType requestHeader,
            EinplanungType einplanung) {
        this.requestHeader = requestHeader;
        this.einplanung = einplanung;
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
     * Gets the requestHeader value for this UpdateEinplanungRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this UpdateEinplanungRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the einplanung value for this UpdateEinplanungRequestType.
     *
     * @return einplanung
     */
    public EinplanungType getEinplanung() {
        return einplanung;
    }

    /**
     * Sets the einplanung value for this UpdateEinplanungRequestType.
     *
     * @param einplanung
     */
    public void setEinplanung(EinplanungType einplanung) {
        this.einplanung = einplanung;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateEinplanungRequestType)) return false;
        UpdateEinplanungRequestType other = (UpdateEinplanungRequestType) obj;
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
                ((this.einplanung == null && other.getEinplanung() == null) ||
                        (this.einplanung != null &&
                                this.einplanung.equals(other.getEinplanung())));
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
        if (getEinplanung() != null) {
            _hashCode += getEinplanung().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
