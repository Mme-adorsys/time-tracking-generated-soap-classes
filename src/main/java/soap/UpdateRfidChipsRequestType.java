/**
 * UpdateRfidChipsRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Der Request zur Aktualsiierung der RFID-Chip / User-Zuordnung.
 */
public class UpdateRfidChipsRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateRfidChipsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "UpdateRfidChipsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfidChip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rfidChip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RfidChipType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    /* Die RFID-Chip / User Zuordnung. */
    private RfidChipType rfidChip;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateRfidChipsRequestType() {
    }


    public UpdateRfidChipsRequestType(
            RequestHeaderType requestHeader,
            RfidChipType rfidChip) {
        this.requestHeader = requestHeader;
        this.rfidChip = rfidChip;
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
     * Gets the requestHeader value for this UpdateRfidChipsRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this UpdateRfidChipsRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the rfidChip value for this UpdateRfidChipsRequestType.
     *
     * @return rfidChip   * Die RFID-Chip / User Zuordnung.
     */
    public RfidChipType getRfidChip() {
        return rfidChip;
    }

    /**
     * Sets the rfidChip value for this UpdateRfidChipsRequestType.
     *
     * @param rfidChip   * Die RFID-Chip / User Zuordnung.
     */
    public void setRfidChip(RfidChipType rfidChip) {
        this.rfidChip = rfidChip;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateRfidChipsRequestType)) return false;
        UpdateRfidChipsRequestType other = (UpdateRfidChipsRequestType) obj;
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
                ((this.rfidChip == null && other.getRfidChip() == null) ||
                        (this.rfidChip != null &&
                                this.rfidChip.equals(other.getRfidChip())));
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
        if (getRfidChip() != null) {
            _hashCode += getRfidChip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
