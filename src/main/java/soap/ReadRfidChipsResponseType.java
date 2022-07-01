/**
 * ReadRfidChipsResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Resultat der Request-Ausführung.
 */
public class ReadRfidChipsResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRfidChipsResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRfidChipsResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfidChipListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rfidChipListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RfidChipType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rfidChip"));
        typeDesc.addFieldDesc(elemField);
    }

    private ResponseHeaderType responseHeader;
    /* Die Liste der gefundenen RFID-Chips. */
    private RfidChipType[] rfidChipListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRfidChipsResponseType() {
    }


    public ReadRfidChipsResponseType(
            ResponseHeaderType responseHeader,
            RfidChipType[] rfidChipListe) {
        this.responseHeader = responseHeader;
        this.rfidChipListe = rfidChipListe;
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
     * Gets the responseHeader value for this ReadRfidChipsResponseType.
     *
     * @return responseHeader
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadRfidChipsResponseType.
     *
     * @param responseHeader
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the rfidChipListe value for this ReadRfidChipsResponseType.
     *
     * @return rfidChipListe   * Die Liste der gefundenen RFID-Chips.
     */
    public RfidChipType[] getRfidChipListe() {
        return rfidChipListe;
    }

    /**
     * Sets the rfidChipListe value for this ReadRfidChipsResponseType.
     *
     * @param rfidChipListe   * Die Liste der gefundenen RFID-Chips.
     */
    public void setRfidChipListe(RfidChipType[] rfidChipListe) {
        this.rfidChipListe = rfidChipListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRfidChipsResponseType)) return false;
        ReadRfidChipsResponseType other = (ReadRfidChipsResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.responseHeader == null && other.getResponseHeader() == null) ||
                        (this.responseHeader != null &&
                                this.responseHeader.equals(other.getResponseHeader()))) &&
                ((this.rfidChipListe == null && other.getRfidChipListe() == null) ||
                        (this.rfidChipListe != null &&
                                java.util.Arrays.equals(this.rfidChipListe, other.getRfidChipListe())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getRfidChipListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRfidChipListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRfidChipListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
