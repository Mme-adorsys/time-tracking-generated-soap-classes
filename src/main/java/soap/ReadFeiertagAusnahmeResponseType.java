/**
 * ReadFeiertagAusnahmeResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadFeiertagAusnahmeResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadFeiertagAusnahmeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFeiertagAusnahmeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feiertagAusnahmeListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feiertagAusnahmeListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FeiertagAusnahmeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "feiertagAusnahme"));
        typeDesc.addFieldDesc(elemField);
    }

    private ResponseHeaderType responseHeader;
    private FeiertagAusnahmeType[] feiertagAusnahmeListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadFeiertagAusnahmeResponseType() {
    }


    public ReadFeiertagAusnahmeResponseType(
            ResponseHeaderType responseHeader,
            FeiertagAusnahmeType[] feiertagAusnahmeListe) {
        this.responseHeader = responseHeader;
        this.feiertagAusnahmeListe = feiertagAusnahmeListe;
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
     * Gets the responseHeader value for this ReadFeiertagAusnahmeResponseType.
     *
     * @return responseHeader
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadFeiertagAusnahmeResponseType.
     *
     * @param responseHeader
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the feiertagAusnahmeListe value for this ReadFeiertagAusnahmeResponseType.
     *
     * @return feiertagAusnahmeListe
     */
    public FeiertagAusnahmeType[] getFeiertagAusnahmeListe() {
        return feiertagAusnahmeListe;
    }

    /**
     * Sets the feiertagAusnahmeListe value for this ReadFeiertagAusnahmeResponseType.
     *
     * @param feiertagAusnahmeListe
     */
    public void setFeiertagAusnahmeListe(FeiertagAusnahmeType[] feiertagAusnahmeListe) {
        this.feiertagAusnahmeListe = feiertagAusnahmeListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadFeiertagAusnahmeResponseType)) return false;
        ReadFeiertagAusnahmeResponseType other = (ReadFeiertagAusnahmeResponseType) obj;
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
                ((this.feiertagAusnahmeListe == null && other.getFeiertagAusnahmeListe() == null) ||
                        (this.feiertagAusnahmeListe != null &&
                                java.util.Arrays.equals(this.feiertagAusnahmeListe, other.getFeiertagAusnahmeListe())));
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
        if (getFeiertagAusnahmeListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFeiertagAusnahmeListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFeiertagAusnahmeListe(), i);
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
