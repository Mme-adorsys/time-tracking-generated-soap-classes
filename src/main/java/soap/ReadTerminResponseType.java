/**
 * ReadTerminResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadTerminResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTerminResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTerminResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TerminType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "termin"));
        typeDesc.addFieldDesc(elemField);
    }

    private ResponseHeaderType responseHeader;
    private TerminType[] terminListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTerminResponseType() {
    }


    public ReadTerminResponseType(
            ResponseHeaderType responseHeader,
            TerminType[] terminListe) {
        this.responseHeader = responseHeader;
        this.terminListe = terminListe;
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
     * Gets the responseHeader value for this ReadTerminResponseType.
     *
     * @return responseHeader
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadTerminResponseType.
     *
     * @param responseHeader
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the terminListe value for this ReadTerminResponseType.
     *
     * @return terminListe
     */
    public TerminType[] getTerminListe() {
        return terminListe;
    }

    /**
     * Sets the terminListe value for this ReadTerminResponseType.
     *
     * @param terminListe
     */
    public void setTerminListe(TerminType[] terminListe) {
        this.terminListe = terminListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTerminResponseType)) return false;
        ReadTerminResponseType other = (ReadTerminResponseType) obj;
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
                ((this.terminListe == null && other.getTerminListe() == null) ||
                        (this.terminListe != null &&
                                java.util.Arrays.equals(this.terminListe, other.getTerminListe())));
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
        if (getTerminListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTerminListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTerminListe(), i);
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
